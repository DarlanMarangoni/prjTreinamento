package fatec.poo.model;

public class Aluno {
    
    private String Escolaridade;
    private Matricula matricula;

    public void setEscolaridade(String Escolaridade) {
        this.Escolaridade = Escolaridade;
    }

    public Matricula getMatricula() {
        return matricula;
    }

    public void setMatricula(Matricula matricula) {
        this.matricula = matricula;
    }
    
}
