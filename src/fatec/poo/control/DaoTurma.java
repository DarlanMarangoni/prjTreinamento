package fatec.poo.control;

import fatec.poo.model.Turma;
import java.sql.Connection;

public class DaoTurma {
    //cria a variavel para conexão
    private Connection conn;
    //instancia um obj DaoCurso e recebe um obj connection como parametro
    public DaoTurma (Connection conn){
        this.conn = conn;
    }
    
    public void inserir (Turma turma){
        
    }
    
    public void alterar (Turma turma){
        
    }
    
    public void consultar (Turma turma){
        
    }
    
    public void excuir (Turma turma){
        
    }
}
