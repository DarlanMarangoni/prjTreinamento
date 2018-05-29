package fatec.poo.model;

import java.util.ArrayList;

public class Turma {
    private String SiglaTurma;
    private String Descricao;
    private String DataInicio;
    private String DataTermino;
    private String Periodo;
    private int QtdVagas;
    private String Observacoes;
    private Instrutor instrutor;
    private ArrayList <Matricula> matriculas;
    private Curso curso;

    public Turma(String SiglaTurma, String Descricao) {
        this.SiglaTurma = SiglaTurma;
        this.Descricao = Descricao;
    }

    public void setDescricao(String Descricao) {
        this.Descricao = Descricao;
    }

    public void setDataInicio(String DataInicio) {
        this.DataInicio = DataInicio;
    }

    public void setDataTermino(String DataTermino) {
        this.DataTermino = DataTermino;
    }

    public void setPeriodo(String Periodo) {
        this.Periodo = Periodo;
    }

    public void setQtdVagas(int QtdVagas) {
        this.QtdVagas = QtdVagas;
    }

    public void setObservacoes(String Observacoes) {
        this.Observacoes = Observacoes;
    }
    
    public void EmitirListaFrequencia(){
        
    }

    public Instrutor getInstrutor() {
        return instrutor;
    }

    public void setInstrutor(Instrutor instrutor) {
        this.instrutor = instrutor;
    }
    
    public void addMatricula (Matricula m){
        matriculas.add(m);
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }
    
}
