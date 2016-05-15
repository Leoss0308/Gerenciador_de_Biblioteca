/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.DAO;

import br.com.Conexao.Conecta;
import br.com.Modelagem.Livro;
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
public class LivroDAO {

    private Statement stmt;
    private Connection cnn;           // Atributo de conexao:
    private PreparedStatement ps = null;  // Objeto para SQL Preparado:

    public LivroDAO() {

    }
    Conecta c = new Conecta();
    //inserir dados no banco

    public boolean inserir(Livro liv) throws Exception {
        try {
            cnn = c.getConexao();
            ps = cnn.prepareStatement(
                    "INSERT INTO Livro ( ISBN, Edicao_Livro, Titulo_Livro, Autor_Livro, Editora_Livro, Resumo_Livro, Preco_Livro, Ano_Publicacao, Quantidade, Categoria_Livro, Tags,  Obs_Livro, Avaria,Emprestado, Matricula_Func) VALUES (?,?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?,?)");

            ps.setString(1, liv.getISBN());
            ps.setString(2, liv.getEdicaoLivro());
            ps.setString(3, liv.getTituloLivro());
            ps.setString(4, liv.getAutorLivro());
            ps.setString(5, liv.getEditoraLivro());
            ps.setString(6, liv.getResumoLivro());
            ps.setString(7, liv.getPrecoLivro());
            ps.setString(8, liv.getAnoPublicacao());
            ps.setInt(9, liv.getQuantidade());
            ps.setString(10, liv.getCategoriaLivro());
            ps.setString(11, liv.getTags());
            ps.setString(12, liv.getObsLivro());
            ps.setInt(13, 0);
            ps.setInt(14, 0);
            ps.setInt(15, liv.getMatriculaFunc());

            ps.executeUpdate();
            ps.close();
            return true;

        } catch (Exception e) {

            System.out.println(e.toString());
            return false;
        }

    }

    //atualizar dados do banco
    public boolean atualizar(Livro liv) throws Exception {
        try {
            cnn = c.getConexao();
            ps = cnn.prepareStatement(
                    "UPDATE Livro set  ISBN=?, Edicao_Livro=?, Titulo_Livro=?, Autor_Livro=?, Editora_Livro=?, Resumo_Livro=?, Preco_Livro=?, Ano_Publicacao=?, Quantidade=?, Categoria_Livro=?, Tags=?, Obs_Livro=?,Avaria=?, Emprestado=? where Cod_Livro=?");

            ps.setString(1, liv.getISBN());
            ps.setString(2, liv.getEdicaoLivro());
            ps.setString(3, liv.getTituloLivro());
            ps.setString(4, liv.getAutorLivro());
            ps.setString(5, liv.getEditoraLivro());
            ps.setString(6, liv.getResumoLivro());
            ps.setString(7, liv.getPrecoLivro());
            ps.setString(8, liv.getAnoPublicacao());
            ps.setInt(9, liv.getQuantidade());
            ps.setString(10, liv.getCategoriaLivro());
            ps.setString(11, liv.getTags());
            ps.setString(12, liv.getObsLivro());
            ps.setInt(13, 0);
            ps.setInt(14, 0);
            ps.setInt(15, liv.getCodLivro());

            ps.executeUpdate();
            ps.close();
            return true;
        } catch (Exception e) {
            System.out.println(e.toString());
            return false;
        }

    }

    //"desativar o livro" em caso de baixas = avarias
    public boolean desativarLivro(int liv) throws Exception {
        try {
            cnn = c.getConexao();
            ps = cnn.prepareStatement(
                    "UPDATE Livro set Avaria=? where Cod_Livro=?");
            ps.setInt(1, 1);
            ps.setInt(2, liv);
            ps.executeUpdate();
            ps.close();
            return true;
        } catch (Exception e) {
            System.out.println(e.toString());
            return false;
        }
    }

    // Este método, instancia o JavaBeans para auxiliar a montar a lista:
    public List<Livro> getLista() throws SQLException, ClassNotFoundException {
        cnn = c.getConexao();
        ps = cnn.prepareStatement("select * from Livro where Avaria = 0 and Emprestado = 0");
        ResultSet rs = ps.executeQuery();
        List<Livro> Liv = new ArrayList<Livro>();
        while (rs.next()) {
            // Criando o objeto e setando valores:
            Livro liv = new Livro();
            liv.setCodLivro(rs.getInt("Codigo_Livro"));
            liv.setISBN(rs.getString("ISBN"));
            liv.setEdicaoLivro(rs.getString("Edicao_Livro"));
            liv.setTituloLivro(rs.getString("Titulo_Livro"));
            liv.setAutorLivro(rs.getString("Autor_Livro"));
            liv.setEditoraLivro(rs.getString("Editora_Livro"));
            liv.setResumoLivro(rs.getString("Resumo_Livro"));
            liv.setPrecoLivro(rs.getString("Preco_Livro"));
            liv.setAnoPublicacao(rs.getString("Ano_Publicacao"));
            liv.setQuantidade(rs.getInt("Quantidade"));
            liv.setCategoriaLivro(rs.getString("Categoria_Livro"));
            liv.setTags(rs.getString("Tags"));
            liv.setDataEntrada(rs.getDate("Data_Entrada"));
            liv.setObsLivro(rs.getString("Obs_Livro"));
            liv.setAvaria(rs.getInt("Avaria"));
            liv.setEmprestado(rs.getInt("Emprestado"));
            liv.setMatriculaFunc(rs.getInt("Matricula_Func"));

            // Adicionando o objeto à lista:
            Liv.add(liv);
        }
        rs.close();
        ps.close();
        return Liv;
    }

    // Este método, instancia o JavaBeans para consulta de um registro:
    public Livro getLivro(int Cod_Livro) throws SQLException, ClassNotFoundException {
        cnn = c.getConexao();
        ps = cnn.prepareStatement("select * from Livro where Cod_Livro=?");
        ps.setInt(1, Cod_Livro);
        ResultSet rs = ps.executeQuery();

        Livro liv = new Livro();
        if (rs.next()) {
            // Criando o objeto e setando valores:
            liv.setCodLivro(rs.getInt("Cod_Livro"));
            liv.setISBN(rs.getString("ISBN"));
            liv.setEdicaoLivro(rs.getString("Edicao_Livro"));
            liv.setTituloLivro(rs.getString("Titulo_Livro"));
            liv.setAutorLivro(rs.getString("Autor_Livro"));
            liv.setEditoraLivro(rs.getString("Editora_Livro"));
            liv.setResumoLivro(rs.getString("Resumo_Livro"));
            liv.setPrecoLivro(rs.getString("Preco_Livro"));
            liv.setAnoPublicacao(rs.getString("Ano_Publicacao"));
            liv.setQuantidade(rs.getInt("Quantidade"));
            liv.setCategoriaLivro(rs.getString("Categoria_Livro"));
            liv.setTags(rs.getString("Tags"));
            liv.setDataEntrada(rs.getDate("Data_Entrada"));
            liv.setObsLivro(rs.getString("Obs_Livro"));
            liv.setAvaria(rs.getInt("Avaria"));
            liv.setEmprestado(rs.getInt("Emprestado"));
            liv.setMatriculaFunc(rs.getInt("Matricula_Func"));

        }
        rs.close();
        ps.close();
        return liv;
    }

}
