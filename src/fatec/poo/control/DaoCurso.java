package fatec.poo.control;

import fatec.poo.model.Curso;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DaoCurso {
    //cria a variavel para conexão
    private Connection conn;
    //instancia um obj DaoCurso e recebe um obj connection como parametro
    public DaoCurso (Connection conn){
        this.conn = conn;
    }
    
    public void inserir (Curso curso){
         PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("INSERT INTO tbcurso(SiglaCurso, NomeCurso, CargaHoraria, Valor, DtVigencia, ValorHoraInstrutor, programa) VALUES(?,?,?,?,?,?,?)");
            ps.setString(1, curso.getSigla());
            ps.setString(2, curso.getNome());
            ps.setInt(3, curso.getCargaHoraria());
            ps.setDouble(4, curso.getValor());
            ps.setString(5, curso.getDataVigencia());
            ps.setDouble(6, curso.getValorHoraInstrutor());
            ps.setString(7, curso.getPrograma());            
                      
            ps.execute();
        } catch (SQLException ex) {
             System.out.println(ex.toString());   
        }
    }
    
    public void alterar (Curso curso){
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("UPDATE tbcurso set NomeCurso = ?, CargaHoraria = ?, Valor = ?, DtVigencia = ?, ValorHoraInstrutor = ?, programa = ?"+ " " +
                                                 "where SiglaCurso = ?");
          
            ps.setString(1, curso.getNome());
            ps.setInt(2, curso.getCargaHoraria());
            ps.setDouble(3, curso.getValor());
            ps.setString(4, curso.getDataVigencia());
            ps.setDouble(5, curso.getValorHoraInstrutor());
            ps.setString(6, curso.getPrograma());
            ps.setString(7, curso.getSigla());
           
            ps.execute();
        } catch (SQLException ex) {
             System.out.println(ex.toString());   
        }
    }
    
    public Curso consultar (String siglaCurso){
        Curso c = null;
       
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("SELECT * from tbCurso where " +
                                                 "SiglaCurso = ?");
            
            ps.setString(1, siglaCurso);
            ResultSet rs = ps.executeQuery();
           
            if (rs.next() == true) {
                c = new Curso (siglaCurso, rs.getString("NomeCurso"));
                c.setCargaHoraria(rs.getInt("CargaHoraria"));
                c.setValor(rs.getDouble("Valor"));
                c.setDataVigencia(rs.getString("DtVigencia"));
                c.setValorHoraInstrutor(rs.getDouble("ValorHoraInstrutor"));
                c.setPrograma(rs.getString("Programa"));                
            }
        }
        catch (SQLException ex) { 
             System.out.println(ex.toString());   
        }
        return (c);
    }
    
    public void excluir (Curso curso){
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("DELETE FROM tbCurso where SiglaCurso = ?");
            
            ps.setString(1, curso.getSigla());
                      
            ps.execute();
        } catch (SQLException ex) {
             System.out.println(ex.toString());
        }
    }
}
