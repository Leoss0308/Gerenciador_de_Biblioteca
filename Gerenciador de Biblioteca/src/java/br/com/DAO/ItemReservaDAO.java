
package br.com.DAO;

import br.com.Conexao.Conecta;
import br.com.Modelagem.Itens_Reserva;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


public class ItemReservaDAO {
    
    private Statement stmt;
    private Connection cnn;           // Atributo de conexao:
    private PreparedStatement ps = null;  // Objeto para SQL Preparado:
    
    public ItemReservaDAO(){
        
    }
    
    Conecta c = new Conecta();
    //inserir dados no banco
    public boolean inserirItemReserva(Itens_Reserva ItemR) throws Exception {
        try {
            cnn = c.getConexao();
            ps = cnn.prepareStatement(
                        "INSERT INTO Item_Reserva (Cod_Reserva, Cod_Livro) VALUES (?,?)");
            ps.setInt(1, ItemR.getCodReserva());            
            ps.setInt(2, ItemR.getCodLivro());
            ps.executeUpdate();
            ps.close();
            return true;
            
        } catch (Exception e) {
            
            System.out.println(e.toString());
            return false;
        }
        
    }
    //cacelar reserva
    public boolean cancelarItemReserva(int ItemR) throws Exception {
        try {
            cnn = c.getConexao();
            ps = cnn.prepareStatement(
                        "DELETE from Item_Reserva where Cod_Item_Reserva=?");
            ps.setInt(1, ItemR);
            ps.executeUpdate();
            ps.close();
            return true;
        } catch (Exception e) {
            System.out.println(e.toString());
            return false;
        }
    }
    
     // Este método, instancia o JavaBeans para auxiliar a montar a lista:
    public List<Itens_Reserva> getLista() throws SQLException, ClassNotFoundException {
        cnn = c.getConexao();
        ps = cnn.prepareStatement("select * from Item_Reserva");
        ResultSet rs = ps.executeQuery();
        List<Itens_Reserva> ItemReserv = new ArrayList<Itens_Reserva>();
        while (rs.next()) {
            // Criando o objeto e setando valores:
            Itens_Reserva ItemR = new Itens_Reserva();
            ItemR.setCodItemReserva(rs.getInt("Cod_Item_Reserva"));
            ItemR.setCodReserva(rs.getInt("Cod_Reserva"));
            ItemR.setCodLivro(rs.getInt("Cod_Livro"));
            
            // Adicionando o objeto à lista:
            ItemReserv.add(ItemR);
        }
        rs.close();
        ps.close();
        return ItemReserv;
    }

    // Este método, instancia o JavaBeans para consulta de um registro:
    public Itens_Reserva getReser(int CodItemReserva) throws SQLException, ClassNotFoundException {
        cnn = c.getConexao();
        ps = cnn.prepareStatement("select * from Item_Reserva where Cod_Item_Reserva=?");
        ps.setInt(1, CodItemReserva);
        ResultSet rs = ps.executeQuery();

        Itens_Reserva ItemR = new Itens_Reserva();
        if (rs.next()) {
            // Criando o objeto e setando valores:
            ItemR.setCodItemReserva(rs.getInt("Cod_Item_Reserva"));
            ItemR.setCodReserva(rs.getInt("Cod_Reserva"));
            ItemR.setCodLivro(rs.getInt("Cod_Livro"));
        }
        rs.close();
        ps.close();
        return ItemR;
    }
    

    
}

    
    