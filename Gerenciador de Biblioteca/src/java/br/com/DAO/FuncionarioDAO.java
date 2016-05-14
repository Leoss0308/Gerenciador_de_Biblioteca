/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.DAO;

import br.com.Conexao.Conecta;
import br.com.Modelagem.Funcionario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Amanda
 */
public class FuncionarioDAO {

    private Statement stmt;
    private Connection cnn;           // Atributo de conexao:
    private PreparedStatement ps = null;  // Objeto para SQL Preparado:

    public FuncionarioDAO() {
    }
    Conecta c = new Conecta();
    
    //inserir dados no banco

    public boolean inserir(Funcionario func) throws Exception {
        try {
            cnn = c.getConexao();
            ps = cnn.prepareStatement(
                    "INSERT INTO Funcionario (Nome, Endereco, Complemento, Bairro, CEP, Cidade, Estado, Telefone, E_mail, Login, Senha, Status, Tipo, Data_Nasc) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
            ps.setString(1, func.getNome());
            ps.setString(2, func.getEnd());
            ps.setString(3, func.getComplemento());
            ps.setString(4, func.getBairro());
            ps.setString(5, func.getCep());
            ps.setString(6, func.getCidade());
            ps.setString(7, func.getEstado());
            ps.setString(8, func.getTelefone());
            ps.setString(9, func.getEmail());
            ps.setString(10, func.getLogin());
            ps.setString(11, func.getSenha());
            ps.setString(12, func.getStatusFunc());
            ps.setInt(13,1);
            ps.setDate(14, func.getDtNasc());
            ps.executeUpdate();
            ps.close();
            return true;

        } catch (Exception e) {

            System.out.println(e.toString());
            return false;
        }

    }
    
    //atualizar dados do banco
    public boolean atualizar(Funcionario func) throws Exception {
        try {
            cnn = c.getConexao();
            ps = cnn.prepareStatement(
                    "UPDATE Funcionario set Nome=?, Endereco=?, Complemento=?, Bairro=?, CEP=?, Cidade=?, Estado=?, Telefone=?, E_mail=?, Login=?, Senha=?, Status=?, Tipo=?, Data_Nasc=? where Cod_Matricula=?");
            ps.setString(1, func.getNome());
            ps.setString(2, func.getEnd());
            ps.setString(3, func.getComplemento());
            ps.setString(4, func.getBairro());
            ps.setString(5, func.getCep());
            ps.setString(6, func.getCidade());
            ps.setString(7, func.getEstado());
            ps.setString(8, func.getTelefone());
            ps.setString(9, func.getEmail());
            ps.setString(10, func.getLogin());
            ps.setString(11, func.getSenha());
            ps.setString(12, func.getStatusFunc());
            ps.setInt(13,1);
            ps.setDate(14, func.getDtNasc());
            ps.setInt(15, func.getMatriculaFunc());
            ps.executeUpdate();
            ps.close();
            return true;

        } catch (Exception e) {

            System.out.println(e.toString());
            return false;
        }

    }
    
    //desativar funcionario 
    public boolean desativarfunc(int func) throws Exception {
        try {
            cnn = c.getConexao();
            ps = cnn.prepareStatement(
                        "UPDATE Funcionario set Status=? where Cod_Matricula=?");
            ps.setInt(1, 0);
            ps.setInt(2, func);
            ps.executeUpdate();
            ps.close();
            return true;
        } catch (Exception e) {
            System.out.println(e.toString());
            return false;
        }
    }
    
    // Este método, instancia o JavaBeans para auxiliar a montar a lista:
    public List<Funcionario> getLista() throws SQLException, ClassNotFoundException {
        cnn = c.getConexao();
        ps = cnn.prepareStatement("select * from FUNCIONARIO where STATUS = 1");
        ResultSet rs = ps.executeQuery();
        List<Funcionario> Funcs = new ArrayList<Funcionario>();
        while (rs.next()) {
            // Criando o objeto e setando valores:
            Funcionario func = new Funcionario();
            func.setMatriculaFunc(rs.getInt("Cod_Matricula"));
            func.setNome(rs.getString("Nome"));
            func.setEnd(rs.getString("Endereco"));
            func.setComplemento(rs.getString("Complemento"));
            func.setBairro(rs.getString("Bairro"));
            func.setCep(rs.getString("CEP"));
            func.setCidade(rs.getString("Cidade"));
            func.setEstado(rs.getString("Estado"));
            func.setTelefone(rs.getString("Telefone"));
            func.setEmail(rs.getString("E_mail"));
            func.setLogin(rs.getString("Login"));
            func.setSenha(rs.getString("Senha"));
            func.setTipoFunc(rs.getInt("Tipo"));
            func.setDtCadastroFunc(rs.getDate("Data_Cadastro"));
            func.setDtNasc(rs.getDate("Data_Nasc"));
            
            // Adicionando o objeto à lista:
            Funcs.add(func);
        }
        rs.close();
        ps.close();
        return Funcs;
    }

    // Este método, instancia o JavaBeans para consulta de um registro:
    public Funcionario getFunc(int MatriculaFunc) throws SQLException, ClassNotFoundException {
        cnn = c.getConexao();
        ps = cnn.prepareStatement("select * from Funcionario where Cod_Matricula=?");
        ps.setInt(1, MatriculaFunc);
        ResultSet rs = ps.executeQuery();

        Funcionario func = new Funcionario();
        if (rs.next()) {
            // Criando o objeto e setando valores:
            func.setMatriculaFunc(rs.getInt("Cod_Matricula"));
            func.setNome(rs.getString("Nome"));
            func.setEnd(rs.getString("Endereco"));
            func.setComplemento(rs.getString("Complemento"));
            func.setBairro(rs.getString("Bairro"));
            func.setCep(rs.getString("CEP"));
            func.setCidade(rs.getString("Cidade"));
            func.setEstado(rs.getString("Estado"));
            func.setTelefone(rs.getString("Telefone"));
            func.setEmail(rs.getString("E_mail"));
            func.setLogin(rs.getString("Login"));
            func.setSenha(rs.getString("Senha"));
            func.setStatusFunc(rs.getString("Status"));
            func.setTipoFunc(rs.getInt("Tipo"));
            func.setDtNasc(rs.getDate("Data_Nasc"));
        }
        rs.close();
        ps.close();
        return func;
    }

}
