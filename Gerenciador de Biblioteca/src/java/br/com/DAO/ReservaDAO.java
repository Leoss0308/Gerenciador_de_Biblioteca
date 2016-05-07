
package br.com.DAO;

import br.com.Conexao.Conecta;
import br.com.Modelagem.Reserva;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


public class ReservaDAO {
    
    private Statement stmt;
    private Connection cnn;           // Atributo de conexao:
    private PreparedStatement ps = null;  // Objeto para SQL Preparado:
    
    public ReservaDAO(){
        
    }
    
    Conecta c = new Conecta();
    //inserir dados no banco
    public boolean inserirReserva(Reserva Reser) throws Exception {
        try {
            cnn = c.getConexao();
            ps = cnn.prepareStatement(
                        "INSERT INTO Reserva (Cod_Cliente) VALUES (?)");
            ps.setInt(1, Reser.getCodClie());
            ps.executeUpdate();
            ps.close();
            return true;
            
        } catch (Exception e) {
            
            System.out.println(e.toString());
            return false;
        }
        
    }
    //cacelar reserva
    public boolean cancelarReserva(int Reser) throws Exception {
        try {
            cnn = c.getConexao();
            ps = cnn.prepareStatement(
                        "DELETE from Reserva where Cod_Reserva=?");
            ps.setInt(1, Reser);
            ps.executeUpdate();
            ps.close();
            return true;
        } catch (Exception e) {
            System.out.println(e.toString());
            return false;
        }
    }
    
     // Este método, instancia o JavaBeans para auxiliar a montar a lista:
    public List<Reserva> getLista() throws SQLException, ClassNotFoundException {
        cnn = c.getConexao();
        ps = cnn.prepareStatement("select * from Reserva");
        ResultSet rs = ps.executeQuery();
        List<Reserva> Reserv = new ArrayList<Reserva>();
        while (rs.next()) {
            // Criando o objeto e setando valores:
            Reserva Reser = new Reserva();
            Reser.setCodReserva(rs.getInt("Cod_Reserva"));
            Reser.setDataReseva(rs.getDate("Data_Reserva"));
            Reser.setCodClie(rs.getInt("Cod_Cliente"));
            
            // Adicionando o objeto à lista:
            Reserv.add(Reser);
        }
        rs.close();
        ps.close();
        return Reserv;
    }

    // Este método, instancia o JavaBeans para consulta de um registro:
    public Reserva getReser(int CodReserva) throws SQLException, ClassNotFoundException {
        cnn = c.getConexao();
        ps = cnn.prepareStatement("select * from Reserva where Cod_Reserva=?");
        ps.setInt(1, CodReserva);
        ResultSet rs = ps.executeQuery();

        Reserva Reser = new Reserva();
        if (rs.next()) {
            // Criando o objeto e setando valores:
           Reser.setCodReserva(rs.getInt("Cod_Reserva"));
           Reser.setDataReseva(rs.getDate("Data_Reserva"));
           Reser.setCodClie(rs.getInt("Cod_Cliente"));
        }
        rs.close();
        ps.close();
        return Reser;
    }
    



    
    
    
}

    
    