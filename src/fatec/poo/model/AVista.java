package fatec.poo.model;

public class AVista {
    private double Valor;
    private int Agencia;
    private int NCheque;
    private String PreData;
    private Matricula matricula;

    public void setValor(double Valor) {
        this.Valor = Valor;
    }

    public void setAgencia(int Agencia) {
        this.Agencia = Agencia;
    }

    public void setNCheque(int NCheque) {
        this.NCheque = NCheque;
    }

    public void setPreData(String PreData) {
        this.PreData = PreData;
    }

    public Matricula getMatricula() {
        return matricula;
    }

    public void setMatricula(Matricula matricula) {
        this.matricula = matricula;
    }
    
    
}
