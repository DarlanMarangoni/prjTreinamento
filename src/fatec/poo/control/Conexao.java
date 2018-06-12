//conecta o banco de dados
package fatec.poo.control;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;


public class Conexao {
   private String connectionString;
   private String driver;
   private String usuario;
   private String senha;
   private Connection connection=null;//classe java (conection) encapsulada 

   public Conexao(String usuario, String senha) {   
        this.usuario = usuario;
        this.senha = senha;   
   }

   public void setConnectionString(String connectionString) {
        this.connectionString = connectionString;
   }

   public void setDriver(String driver) {
        this.driver = driver;
   }
   
   public Connection conectar() {
        
	   if (connection == null){//verifica se ha uma conexão
	      try {//tenta conexao//importante para gerenciar erros externos a aplicação
                 Class.forName(driver);//carrega driver
            
                 connection = DriverManager.getConnection(connectionString, usuario, senha);//executa conexão(instancia um obj conection)               
	         System.out.println("Conexao OK");
              }catch (Exception ex) {//erro caso nao for possivel conectar banco fisicamente
                  System.out.println("Falha na Conexao");
                  System.out.println(ex.toString() + ex.getMessage());//no caso normalmente vai para um arquivo de log
          }
	   }
       
	   return connection;
   }
   
   public void fecharConexao(){
        if (connection != null){
	   try {
                  connection.close();
           } catch (SQLException ex) {
                   System.out.println(ex.toString());    
           }
        }   
    }
}