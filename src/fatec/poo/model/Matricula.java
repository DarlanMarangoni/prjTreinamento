package fatec.poo.model;

public class Matricula {
    
    private String Data;
    private String QtdeFaltas;
    private String Nota;
    private Aluno aluno;
    private Turma turma;
    private AVista aVista;
    private APrazo aPrazo;

    public Matricula(String Data) {
        this.Data = Data;
    }

    public void setQtdeFaltas(String QtdeFaltas) {
        this.QtdeFaltas = QtdeFaltas;
    }

    public void setNota(String Nota) {
        this.Nota = Nota;
    }
    
    public void EmitirCarne() {
        
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public Turma getTurma() {
        return turma;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }

    public AVista getaVista() {
        return aVista;
    }

    public APrazo getaPrazo() {
        return aPrazo;
    }

    public void setaVista(AVista aVista) {
        this.aVista = aVista;
    }

    public void setaPrazo(APrazo aPrazo) {
        this.aPrazo = aPrazo;
    }
    
}
