
package br.com.DAO;

import br.com.Modelagem.Cliente;
import br.com.Conexao.Conecta;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


public class ClienteDAO {
    
    private Statement stmt;
    private Connection cnn;           // Atributo de conexao:
    private PreparedStatement ps = null;  // Objeto para SQL Preparado:
    
    public ClienteDAO(){
        
    }
    // tutorial usado http://www.brunorota.com.br/2012/05/14/tutorial-criar-crud-em-java-com-jdbc-parte-1/
    Conecta c = new Conecta();
    //inserir dados no banco
    public boolean inserir(Cliente cli) throws Exception {
        try {
            cnn = c.getConexao();
            ps = cnn.prepareStatement(
                        "INSERT INTO Cliente (Cod_Cliente, Nome, CPF, Bairro, CEP, Cidade, Estado, Telefone, E_mail, Login, Senha, Ativo, Observacao, Data_Cadastro, Endereco, Status, Complemento, Data_Nasc) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
            ps.setInt(1, 6);
            ps.setString(2, cli.getNome());
            ps.setInt(3, cli.getCpfClie());
            ps.setString(4, cli.getBairro());
            ps.setInt(5, cli.getCep());
            ps.setString(6, cli.getCidade());
            ps.setString(7, cli.getEstado());
            ps.setInt(8, cli.getTelefone());
            ps.setString(9, cli.getEmail());
            ps.setString(10, cli.getLogin());
            ps.setString(11, cli.getSenha());
            ps.setInt(12, 1);
            ps.setString(13, cli.getObsClie());
            ps.setDate(14, cli.getDtNasc()); //getDtCadastroClie
            ps.setString(15, cli.getEnd());
            ps.setInt(16, cli.getStatusClie());
            ps.setString(17, cli.getComplemento());
            ps.setDate(18, cli.getDtNasc());
            ps.executeUpdate();
            ps.close();
            return true;
            
        } catch (Exception e) {
            
            System.out.println(e.toString());
            return false;
        }
        
    }
    //atualizar dados do banco
    public boolean atualizar(Cliente cli) throws Exception {
        try {
            cnn = c.getConexao();
            ps = cnn.prepareStatement(
                        "UPDATE Cliente set Nome=?, CPF=?, Bairro=?, CEP=?, Cidade=?, Estado=?, Telefone=?, E_mail=?, Login=?, Senha=?, Ativo=?, Observacao=?, Endereco=?, Status=?, Complemento=?, Data_Nasc=? where Cod_Cliente=?");
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
            ps.setString(13, cli.getEnd());
            ps.setInt(14, cli.getStatusClie());
            ps.setString(15, cli.getComplemento());
            ps.setDate(16, cli.getDtNasc());
            ps.setInt(17, cli.getCodClie());
            ps.executeUpdate();
            ps.close();
            return true;
        } catch (Exception e) {
            System.out.println(e.toString());
            return false;
        } 
        
        
        
        
    }
    //desativar o cliente
    public boolean desativarcli(int cli) throws Exception {
        try {
            cnn = c.getConexao();
            ps = cnn.prepareStatement(
                        "UPDATE Cliente set Ativo=? where Cod_Cliente=?");
            ps.setInt(1, 0);
            ps.setInt(2, cli);
            ps.executeUpdate();
            ps.close();
            return true;
        } catch (Exception e) {
            System.out.println(e.toString());
            return false;
        }
    }
    
     // Este método, instancia o JavaBeans para auxiliar a montar a lista:
    public List<Cliente> getLista() throws SQLException, ClassNotFoundException {
        cnn = c.getConexao();
        ps = cnn.prepareStatement("select * from CLIENTE where ATIVO = 1");
        ResultSet rs = ps.executeQuery();
        List<Cliente> Clies = new ArrayList<Cliente>();
        while (rs.next()) {
            // Criando o objeto e setando valores:
            Cliente cli = new Cliente();
            cli.setCodClie(rs.getInt("Cod_Cliente"));
            cli.setNome(rs.getString("Nome"));
            cli.setCpfClie(rs.getInt("CPF"));
            cli.setBairro(rs.getString("Bairro"));
            cli.setCep(rs.getInt("CEP"));
            cli.setCidade(rs.getString("Cidade"));
            cli.setEstado(rs.getString("Estado"));
            cli.setTelefone(rs.getInt("Telefone"));
            cli.setEmail(rs.getString("E_mail"));
            cli.setLogin(rs.getString("Login"));
            cli.setSenha(rs.getString("Senha"));
            cli.setObsClie(rs.getString("Observacao"));
            cli.setDtCadastroClie(rs.getDate("Data_Cadastro"));
            cli.setEnd(rs.getString("Endereco"));
            cli.setStatusClie(rs.getInt("Status"));
            cli.setComplemento(rs.getString("Complemento"));
            cli.setDtNasc(rs.getDate("Data_Nasc"));
            
            // Adicionando o objeto à lista:
            Clies.add(cli);
        }
        rs.close();
        ps.close();
        return Clies;
    }

    // Este método, instancia o JavaBeans para consulta de um registro:
    public Cliente getClie(int CodClie) throws SQLException, ClassNotFoundException {
        cnn = c.getConexao();
        ps = cnn.prepareStatement("select * from Cliente where Cod_Cliente=?");
        ps.setInt(1, CodClie);
        ResultSet rs = ps.executeQuery();

        Cliente cli = new Cliente();
        if (rs.next()) {
            // Criando o objeto e setando valores:
            cli.setCodClie(rs.getInt("Cod_Cliente"));
            cli.setNome(rs.getString("Nome"));
            cli.setCpfClie(rs.getInt("CPF"));
            cli.setBairro(rs.getString("Bairro"));
            cli.setCep(rs.getInt("CEP"));
            cli.setCidade(rs.getString("Cidade"));
            cli.setEstado(rs.getString("Estado"));
            cli.setTelefone(rs.getInt("Telefone"));
            cli.setEmail(rs.getString("E_mail"));
            cli.setLogin(rs.getString("Login"));
            cli.setSenha(rs.getString("Senha"));
            cli.setObsClie(rs.getString("Observacao"));
            cli.setDtCadastroClie(rs.getDate("Data_Cadastro"));
            cli.setEnd(rs.getString("Endereco"));
            cli.setStatusClie(rs.getInt("Status"));
            cli.setComplemento(rs.getString("Complemento"));
            cli.setDtNasc(rs.getDate("Data_Nasc"));
        }
        rs.close();
        ps.close();
        return cli;
    }
    



    
    
    
    
    
}
