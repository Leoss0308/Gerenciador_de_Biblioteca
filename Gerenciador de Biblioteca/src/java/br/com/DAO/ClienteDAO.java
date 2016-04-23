
package br.com.DAO;

import br.com.Modelagem.Cliente;
import br.com.Conexao.Conecta;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class ClienteDAO {
    
    private Statement cmd;
    private Connection cnn;           // Atributo de conexao:
    private PreparedStatement ps = null;  // Objeto para SQL Preparado:
    
    public ClienteDAO(){
        
    }
    
    Conecta c = new Conecta();
   
    public boolean inserir(Cliente cli) throws Exception {
        try {
            cnn = c.getConexao();
            ps = cnn.prepareStatement(
                        "INSERT INTO Cliente (Nome, CPF, Bairro, CEP, Cidade, Estado, Telefone, E_mail, Login, Senha, Ativo, Observacao, Data_Cadastro, Endereco, Status, Complemento, Data_Nasc) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);");
            ps.setString(1, cli.getNome());
            ps.setInt(2, cli.getCpfClie());
            ps.setString(3, cli.getBairro());
            ps.setInt(4, cli.getCep());
            ps.setString(5, cli.getCidade());
            ps.setString(6, cli.getEstado());
            ps.setInt(7, cli.getTelefone());
            ps.setString(8, cli.getEmail());
            ps.setString(9, cli.getLogin());
            ps.setString(10, cli.getSenha());
            ps.setInt(11, 1);
            ps.setString(12, cli.getObsClie());
            ps.setDate(13, cli.getDtCadastroClie());
            ps.setString(14, cli.getEnd());
            ps.setInt(15, cli.getStatusClie());
            ps.setString(16, cli.getComplemento());
            ps.setDate(17, cli.getDtNasc());
            ps.executeUpdate();
            ps.close();
            return true;
        } catch (Exception e) {
            System.out.println(e.toString());
            return false;
        }
    }
    
    private ResultSet executarSQL(String strSQL) throws ClassNotFoundException, SQLException {
        cnn = c.getConexao();
        cmd = cnn.createStatement();
        ResultSet objRS = cmd.executeQuery(strSQL);
        return objRS;
    }
    
    
    
    
    
}
