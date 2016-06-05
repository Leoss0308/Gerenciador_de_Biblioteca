/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.DAO;

import br.com.Conexao.Conecta;
import br.com.Modelagem.FaleConosco;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author i7
 */
public class FaleConoscoDAO {

    private Statement stmt;
    private Connection cnn;           // Atributo de conexao:
    private PreparedStatement ps = null;  // Objeto para SQL Preparado:

    public FaleConoscoDAO() {

    }
    // tutorial usado http://www.brunorota.com.br/2012/05/14/tutorial-criar-crud-em-java-com-jdbc-parte-1/
    Conecta c = new Conecta();

    //inserir dados no banco
    public boolean inserir(FaleConosco fc) throws Exception {
        try {
            cnn = c.getConexao();
            ps = cnn.prepareStatement(
                    "INSERT INTO FaleConosco (Nome, E_mail, Telefone, Assunto, Mensagem) VALUES (?, ?, ?, ?, ?)");
            ps.setString(1, fc.getNome());
            ps.setString(2, fc.getEmail());
            ps.setString(3, fc.getTelefone());
            ps.setString(4, fc.getAssunto());
            ps.setString(5, fc.getMensagem());
            ps.executeUpdate();
            ps.close();
            return true;

        } catch (Exception e) {

            System.out.println(e.toString());
            return false;
        }

    }
    
    public boolean excluirMsg(int CodFC) throws Exception {
        try {
            cnn = c.getConexao();
            ps = cnn.prepareStatement(
                        "delete from faleConosco where Cod_FaleConosco = ?");
            ps.setInt(1, CodFC);
            ps.executeUpdate();
            ps.close();
            return true;
        } catch (Exception e) {
            System.out.println(e.toString());
            return false;
        }
    }
    
    public List<FaleConosco> getLista() throws SQLException, ClassNotFoundException {
        cnn = c.getConexao();
        ps = cnn.prepareStatement("select * from faleConosco");
        ResultSet rs = ps.executeQuery();
        List<FaleConosco> fcs = new ArrayList<FaleConosco>();
        while (rs.next()) {
            // Criando o objeto e setando valores:
            FaleConosco fc = new FaleConosco();
            fc.setCod_FaleConosco(rs.getInt("Cod_FaleConosco"));
            fc.setNome(rs.getString("Nome"));
            fc.setEmail(rs.getString("E_mail"));
            fc.setTelefone(rs.getString("Telefone"));
            fc.setAssunto(rs.getString("Assunto"));
            fc.setMensagem(rs.getString("Mensagem"));
            fc.setDataEnvio(rs.getDate("Data_envio"));

            // Adicionando o objeto à lista:
            fcs.add(fc);
        }
        rs.close();
        ps.close();
        return fcs;
    }

    // Este método, instancia o JavaBeans para consulta de um registro:
    public FaleConosco getmsg(int CodFC) throws SQLException, ClassNotFoundException {
        cnn = c.getConexao();
        ps = cnn.prepareStatement("select * from faleConosco where Cod_FaleConosco=?");
        ps.setInt(1, CodFC);
        ResultSet rs = ps.executeQuery();

        FaleConosco fc = new FaleConosco();
        if (rs.next()) {
            // Criando o objeto e setando valores:
            fc.setCod_FaleConosco(rs.getInt("Cod_FaleConosco"));
            fc.setNome(rs.getString("Nome"));
            fc.setEmail(rs.getString("E_mail"));
            fc.setTelefone(rs.getString("Telefone"));
            fc.setAssunto(rs.getString("Assunto"));
            fc.setMensagem(rs.getString("Mensagem"));
            fc.setDataEnvio(rs.getDate("Data_envio"));
        }
        rs.close();
        ps.close();
        return fc;
    }
    
    public List<FaleConosco> getListaLike(String palavra, String tipo) throws SQLException, ClassNotFoundException {
        cnn = c.getConexao();
        ps = cnn.prepareStatement("select * from faleConosco where " + tipo + " LIKE ?");
        ps.setString(1, '%' + palavra + '%');
        ResultSet rs = ps.executeQuery();
        List<FaleConosco> Clies = new ArrayList<FaleConosco>();
        while (rs.next()) {
            // Criando o objeto e setando valores:
            FaleConosco fc = new FaleConosco();
            fc.setCod_FaleConosco(rs.getInt("Cod_FaleConosco"));
            fc.setNome(rs.getString("Nome"));
            fc.setEmail(rs.getString("E_mail"));
            fc.setTelefone(rs.getString("Telefone"));
            fc.setAssunto(rs.getString("Assunto"));
            fc.setMensagem(rs.getString("Mensagem"));
            fc.setDataEnvio(rs.getDate("Data_envio"));
            
            // Adicionando o objeto à lista:
            Clies.add(fc);
        }
        rs.close();
        ps.close();
        return Clies;
    }
    
    
    
    
    
    
    
    
    
}
