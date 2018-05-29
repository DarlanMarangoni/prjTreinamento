package fatec.poo.model;

import java.util.ArrayList;

public class Instrutor {
    
    private String Formacao;
    private String AreaAtuacao;
    private ArrayList <Turma> turmas;

    public void setFormacao(String Formacao) {
        this.Formacao = Formacao;
    }

    public void setAreaAtuacao(String AreaAtuacao) {
        this.AreaAtuacao = AreaAtuacao;
    }
    
    public void addTurma (Turma t){
        turmas.add(t);
    }
}