
package br.com.DAO;

import br.com.Conexao.Conecta;
import br.com.Modelagem.Itens_Emprestimo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


public class ItemEmprestimoDAO {
    
    private Statement stmt;
    private Connection cnn;           // Atributo de conexao:
    private PreparedStatement ps = null;  // Objeto para SQL Preparado:
    
    public ItemEmprestimoDAO(){
        
    }
    
    Conecta c = new Conecta();
    //inserir dados no banco
    public boolean inserirItemEmprestimo(Itens_Emprestimo ItemEmp) throws Exception {
        try {
            cnn = c.getConexao();
            ps = cnn.prepareStatement(
                        "INSERT INTO Item_Emprestimo (Cod_Emprestimo, Cod_Livro) VALUES (?,?)");
            ps.setInt(1, ItemEmp.getCodEmprestimo());            
            ps.setInt(2, ItemEmp.getCodLivro());
            ps.executeUpdate();
            ps.close();
            return true;
            
        } catch (Exception e) {
            
            System.out.println(e.toString());
            return false;
        }
        
    }
    
     // Este método, instancia o JavaBeans para auxiliar a montar a lista:
    public List<Itens_Emprestimo> getLista(int codEmprestimo) throws SQLException, ClassNotFoundException {
        cnn = c.getConexao();
        ps = cnn.prepareStatement("select * from Item_Emprestimo where Cod_Emprestimo = ?");
        ps.setInt(1, codEmprestimo);
        ResultSet rs = ps.executeQuery();
        List<Itens_Emprestimo> ItemEmpr = new ArrayList<Itens_Emprestimo>();
        while (rs.next()) {
            // Criando o objeto e setando valores:
            Itens_Emprestimo ItemEmp = new Itens_Emprestimo();
            ItemEmp.setCodItemEmprestimo(rs.getInt("Cod_Item_Emprestimo"));
            ItemEmp.setCodEmprestimo(rs.getInt("Cod_Emprestimo"));
            ItemEmp.setCodLivro(rs.getInt("Cod_Livro"));
                        // Adicionando o objeto à lista:
            ItemEmpr.add(ItemEmp);
        }
        rs.close();
        ps.close();
        return ItemEmpr;
    }

    // Este método, instancia o JavaBeans para consulta de um registro:
    public Itens_Emprestimo getEmp(int CodItemEmprestimo) throws SQLException, ClassNotFoundException {
        cnn = c.getConexao();
        ps = cnn.prepareStatement("select * from Item_Emprestimo where Cod_Item_Emprestimo=?");
        ps.setInt(1, CodItemEmprestimo);
        ResultSet rs = ps.executeQuery();

        Itens_Emprestimo ItemEmp = new Itens_Emprestimo();
        if (rs.next()) {
            // Criando o objeto e setando valores:
            ItemEmp.setCodItemEmprestimo(rs.getInt("Cod_Item_Emprestimo"));
            ItemEmp.setCodEmprestimo(rs.getInt("Cod_Emprestimo"));
            ItemEmp.setCodLivro(rs.getInt("Cod_Livro"));
        }
        rs.close();
        ps.close();
        return ItemEmp;
    }
    

    
}

    
    