/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.DAO;

import br.com.Conexao.Conecta;
import br.com.Modelagem.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author i7
 */
public class LoginDAO {
    
    private Connection cnn;           // Atributo de conexao:
    private PreparedStatement ps = null;  // Objeto para SQL Preparado:
    
    Conecta c = new Conecta();
    
    public Cliente loginCliente(String login, String senha) throws SQLException, ClassNotFoundException {
        cnn = c.getConexao();
        ps = cnn.prepareStatement("select * from Cliente where ATIVO = 1 AND Login = ? AND Senha = ?");
        ps.setString(1, login);
        ps.setString(2, senha);
        
        ResultSet rs = ps.executeQuery();

        Cliente cli = new Cliente();
        if (rs.next()) {
            // Criando o objeto e setando valores:
            cli.setCodClie(rs.getInt("Cod_Cliente"));
            cli.setNome(rs.getString("Nome"));
            cli.setCpfClie(rs.getString("CPF"));
            cli.setBairro(rs.getString("Bairro"));
            cli.setCep(rs.getString("CEP"));
            cli.setCidade(rs.getString("Cidade"));
            cli.setEstado(rs.getString("Estado"));
            cli.setTelefone(rs.getString("Telefone"));
            cli.setEmail(rs.getString("E_mail"));
            cli.setLogin(rs.getString("Login"));
            cli.setSenha(rs.getString("Senha"));
            cli.setObsClie(rs.getString("Observacao"));
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
