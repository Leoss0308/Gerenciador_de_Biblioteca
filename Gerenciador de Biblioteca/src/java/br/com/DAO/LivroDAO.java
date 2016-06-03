/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.DAO;

import br.com.Conexao.Conecta;
import br.com.Modelagem.Livro;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Blob;
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

    public boolean inserir(Livro liv, File imgfile, InputStream fin) throws Exception {
        try {

            cnn = c.getConexao();
            ps = cnn.prepareStatement(
                    "INSERT INTO Livro ( ISBN, Edicao_Livro, Titulo, Autor, Editora, Resumo, Preco, Ano_Publicacao, Categoria, Tags,  Observacao, Avaria, Emprestado, Cod_Matricula, Imagem) VALUES (?,?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?,?)");

            ps.setString(1, liv.getISBN());
            ps.setString(2, liv.getEdicaoLivro());
            ps.setString(3, liv.getTituloLivro());
            ps.setString(4, liv.getAutorLivro());
            ps.setString(5, liv.getEditoraLivro());
            ps.setString(6, liv.getResumoLivro());
            ps.setString(7, liv.getPrecoLivro());
            ps.setString(8, liv.getAnoPublicacao());
            ps.setString(9, liv.getCategoriaLivro());
            ps.setString(10, liv.getTags());
            ps.setString(11, liv.getObsLivro());
            ps.setInt(12, 0);
            ps.setInt(13, 0);
            ps.setInt(14, liv.getMatriculaFunc());
            ps.setBinaryStream(15, (InputStream) fin, (int) imgfile.length());
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
                    "UPDATE Livro set   ISBN=?, Edicao_Livro=?, Titulo=?, Autor=?, Editora=?, Resumo=?, Preco=?, Ano_Publicacao=?, Categoria=?, Tags=?,  Observacao=? where Cod_Livro=?");

            ps.setString(1, liv.getISBN());
            ps.setString(2, liv.getEdicaoLivro());
            ps.setString(3, liv.getTituloLivro());
            ps.setString(4, liv.getAutorLivro());
            ps.setString(5, liv.getEditoraLivro());
            ps.setString(6, liv.getResumoLivro());
            ps.setString(7, liv.getPrecoLivro());
            ps.setString(8, liv.getAnoPublicacao());
            ps.setString(9, liv.getCategoriaLivro());
            ps.setString(10, liv.getTags());
            ps.setString(11, liv.getObsLivro());
            ps.setInt(12, liv.getCodLivro());

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
            liv.setCodLivro(rs.getInt("Cod_Livro"));
            liv.setISBN(rs.getString("ISBN"));
            liv.setEdicaoLivro(rs.getString("Edicao_Livro"));
            liv.setTituloLivro(rs.getString("Titulo"));
            liv.setAutorLivro(rs.getString("Autor"));
            liv.setEditoraLivro(rs.getString("Editora"));
            liv.setResumoLivro(rs.getString("Resumo"));
            liv.setPrecoLivro(rs.getString("Preco"));
            liv.setAnoPublicacao(rs.getString("Ano_Publicacao"));
            liv.setCategoriaLivro(rs.getString("Categoria"));
            liv.setTags(rs.getString("Tags"));
            liv.setDataEntrada(rs.getDate("Data_Entrada"));
            liv.setObsLivro(rs.getString("Observacao"));
            liv.setAvaria(rs.getInt("Avaria"));
            liv.setEmprestado(rs.getInt("Emprestado"));
            liv.setMatriculaFunc(rs.getInt("Cod_Matricula"));
            

            // Adicionando o objeto à lista:
            Liv.add(liv);
        }
        rs.close();
        ps.close();
        return Liv;
    }

    // Este método, instancia o JavaBeans para auxiliar a montar a lista:
    public List<Livro> getListaCli(InputStream fin) throws SQLException, ClassNotFoundException, FileNotFoundException, IOException {
        cnn = c.getConexao();
        ps = cnn.prepareStatement("select * from Livro where Avaria = 0 and Emprestado = 0");
        ResultSet rs = ps.executeQuery();
        List<Livro> Liv = new ArrayList<Livro>();
        while (rs.next()) {
            // Criando o objeto e setando valores:
            Livro liv = new Livro();
            liv.setCodLivro(rs.getInt("Cod_Livro"));
            liv.setISBN(rs.getString("ISBN"));
            liv.setEdicaoLivro(rs.getString("Edicao_Livro"));
            liv.setTituloLivro(rs.getString("Titulo"));
            liv.setAutorLivro(rs.getString("Autor"));
            liv.setEditoraLivro(rs.getString("Editora"));
            liv.setResumoLivro(rs.getString("Resumo"));
            liv.setPrecoLivro(rs.getString("Preco"));
            liv.setAnoPublicacao(rs.getString("Ano_Publicacao"));
            liv.setCategoriaLivro(rs.getString("Categoria"));
            liv.setTags(rs.getString("Tags"));
            liv.setDataEntrada(rs.getDate("Data_Entrada"));
            liv.setObsLivro(rs.getString("Observacao"));
            liv.setAvaria(rs.getInt("Avaria"));
            liv.setEmprestado(rs.getInt("Emprestado"));
            liv.setMatriculaFunc(rs.getInt("Cod_Matricula"));
          //  liv.setImagem(rs.getBytes("Imagem"));

            /* do prof
            rs = ps.executeQuery("select imagem from livro");
            byte buff[] = new byte[1024];
            while (rs.next()) {
                Blob ablob = rs.getBlob(1);
                File newfile = new File("newimage.jpg");

                InputStream is = ablob.getBinaryStream();

                FileOutputStream fos = new FileOutputStream(newfile);

                for (int b = is.read(buff); b != -1; b = is.read(buff)) {
                    fos.write(buff, 0, b);
                     ByteArrayOutputStream output = new ByteArrayOutputStream();
                }
            is.close();
            fos.close();
            
        }

        ps.close();
        rs.close();
        cnn.close(); */
        /*try{
            
         while (rs.next()) {
         InputStream in = rs.getBinaryStream(1);
         OutputStream f = new FileOutputStream(new File("capa" + liv.getCodLivro() + ".jpeg"));
                    
         int c = 0;
         while ((c = in.read()) > -1) {
         f.write(c);
         }
         f.close();
         in.close();
         }
         } catch (Exception ex) {
         System.out.println(ex.getMessage());
         }
         */
        /*  InputStream input = rs.getBinaryStream("Imagem");
         if (input != null) {
         ByteArrayOutputStream output = new ByteArrayOutputStream();
         // set read buffer size
         byte[] rb = new byte[1024];
         int ch = 0;
         while ((ch = input.read(rb)) != -1) {
         output.write(rb, 0, ch);
         }
         // transfer to byte buffer
         byte[] b = output.toByteArray();
         liv.setImagem(b);
         input.close();
         output.close();
         // onde o método setImagem espera um array de bytes
         //umObjeto.setImagem(b);
             
         }
         */
        // Adicionando o objeto à lista:
        Liv.add(liv);
    }

    rs.close ();

    ps.close ();
    return Liv ;
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
            liv.setTituloLivro(rs.getString("Titulo"));
            liv.setAutorLivro(rs.getString("Autor"));
            liv.setEditoraLivro(rs.getString("Editora"));
            liv.setResumoLivro(rs.getString("Resumo"));
            liv.setPrecoLivro(rs.getString("Preco"));
            liv.setAnoPublicacao(rs.getString("Ano_Publicacao"));
            liv.setCategoriaLivro(rs.getString("Categoria"));
            liv.setTags(rs.getString("Tags"));
            liv.setDataEntrada(rs.getDate("Data_Entrada"));
            liv.setObsLivro(rs.getString("Observacao"));
            liv.setAvaria(rs.getInt("Avaria"));
            liv.setEmprestado(rs.getInt("Emprestado"));
            liv.setMatriculaFunc(rs.getInt("Cod_Matricula"));

        }
        rs.close();
        ps.close();
        return liv;
    }

    // Este método, consulta o titulo de um livro;
    public String getTituloLivro(int codLivro) throws SQLException, ClassNotFoundException {
        cnn = c.getConexao();
        ps = cnn.prepareStatement("select Titulo from Livro where Cod_Livro=?");
        ps.setInt(1, codLivro);
        ResultSet rs = ps.executeQuery();

        Livro livr = new Livro();
        if (rs.next()) {
            // Criando o objeto e setando valores:
            livr.setTituloLivro(rs.getString("Titulo"));

        }
        rs.close();
        ps.close();
        return livr.getTituloLivro();
    }

    public List<Livro> getListaLike(String palavra, String tipo) throws SQLException, ClassNotFoundException {
        cnn = c.getConexao();
        ps = cnn.prepareStatement("select * from Livro where AVARIA = 0 AND " + tipo + " LIKE ?");
        ps.setString(1, '%' + palavra + '%');
        ResultSet rs = ps.executeQuery();
        List<Livro> Liv = new ArrayList<Livro>();
        while (rs.next()) {
            // Criando o objeto e setando valores:
            Livro liv = new Livro();
            liv.setCodLivro(rs.getInt("Cod_Livro"));
            liv.setISBN(rs.getString("ISBN"));
            liv.setEdicaoLivro(rs.getString("Edicao_Livro"));
            liv.setTituloLivro(rs.getString("Titulo"));
            liv.setAutorLivro(rs.getString("Autor"));
            liv.setEditoraLivro(rs.getString("Editora"));
            liv.setResumoLivro(rs.getString("Resumo"));
            liv.setPrecoLivro(rs.getString("Preco"));
            liv.setAnoPublicacao(rs.getString("Ano_Publicacao"));
            liv.setCategoriaLivro(rs.getString("Categoria"));
            liv.setTags(rs.getString("Tags"));
            liv.setDataEntrada(rs.getDate("Data_Entrada"));
            liv.setObsLivro(rs.getString("Observacao"));
            liv.setAvaria(rs.getInt("Avaria"));
            liv.setEmprestado(rs.getInt("Emprestado"));
            liv.setMatriculaFunc(rs.getInt("Cod_Matricula"));
            // Adicionando o objeto à lista:
            Liv.add(liv);
        }
        rs.close();
        ps.close();
        return Liv;
    }

}
