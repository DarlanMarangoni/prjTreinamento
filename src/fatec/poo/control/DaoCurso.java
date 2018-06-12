package fatec.poo.control;

import fatec.poo.model.Curso;
import java.sql.Connection;

public class DaoCurso {
    //cria a variavel para conexão
    private Connection conn;
    //instancia um obj DaoCurso e recebe um obj connection como parametro
    public DaoCurso (Connection conn){
        this.conn = conn;
    }
    
    public void inserir (Curso curso){
        
    }
    
    public void alterar (Curso curso){
        
    }
    
    public void consultar (Curso curso){
        
    }
    
    public void excuir (Curso curso){
        
    }
    
}
