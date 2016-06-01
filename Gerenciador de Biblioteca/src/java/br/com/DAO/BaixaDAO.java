/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.DAO;

import br.com.Conexao.Conecta;
import br.com.Modelagem.Baixa;
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
public class BaixaDAO {

    private Statement stmt;
    private Connection cnn;           // Atributo de conexao:
    private PreparedStatement ps = null;  // Objeto para SQL Preparado:

    public BaixaDAO() {

    }
    Conecta c = new Conecta();
    //inserir dados no banco

    public boolean inserir(Baixa bx) throws Exception {
        try {
            cnn = c.getConexao();
            ps = cnn.prepareStatement(
                    "INSERT INTO Baixa ( Motivo_Baixa, Observacao, Cod_Matricula, Cod_Livro) VALUES (?,?,?,?)");
            ps.setString(1, bx.getMotivoBaixa());
            ps.setString(2, bx.getObsBaixa());
            ps.setInt(3, bx.getMatriculaFunc());
            ps.setInt(4, bx.getCodLivro());

            ps.executeUpdate();
            ps.close();
            ps = cnn.prepareStatement(
                    "UPDATE Livro set Avaria= 1 Where Cod_Livro=? ");
            ps.setInt(1, bx.getCodLivro());
            ps.executeUpdate();
            ps.close();
            return true;

        } catch (Exception e) {

            System.out.println(e.toString());
            return false;
        }

    }

    //atualizar dados do banco
    public boolean atualizar(Baixa bx) throws Exception {
        try {
            cnn = c.getConexao();
            ps = cnn.prepareStatement(
                    "UPDATE Baixa set  Motivo_Baixa=?, Observacao=? where Cod_Baixa=?");

            ps.setString(1, bx.getMotivoBaixa());
            ps.setString(2, bx.getObsBaixa());
            ps.setInt(3, bx.getCodBaixa());
            ps.executeUpdate();
            ps.close();
            return true;
        } catch (Exception e) {
            System.out.println(e.toString());
            return false;
        }

    }

    public boolean cancelarBaixa(int Baix, int Liv) throws Exception {
        try {
            cnn = c.getConexao();
            ps = cnn.prepareStatement(
                    "DELETE from Baixa where Cod_Baixa=?");
            ps.setInt(1, Baix);
            ps.executeUpdate();
            ps.close();
            ps = cnn.prepareStatement(
                    "UPDATE Livro set Avaria= 0 Where Cod_Livro=? ");
            ps.setInt(1, Liv);
            ps.executeUpdate();
            ps.close();

            return true;
        } catch (Exception e) {
            System.out.println(e.toString());
            return false;
        }
    }

    // Este método, instancia o JavaBeans para auxiliar a montar a lista:
    public List<Baixa> getLista() throws SQLException, ClassNotFoundException {
        cnn = c.getConexao();
        ps = cnn.prepareStatement("select * from Baixa ");
        ResultSet rs = ps.executeQuery();
        List<Baixa> Baix = new ArrayList<Baixa>();
        while (rs.next()) {
            // Criando o objeto e setando valores:
            Baixa bx = new Baixa();
            bx.setCodBaixa(rs.getInt("Cod_Baixa"));
            bx.setMotivoBaixa(rs.getString("Motivo_Baixa"));
            bx.setObsBaixa(rs.getString("Observacao"));
            bx.setMatriculaFunc(rs.getInt("Cod_Matricula"));
            bx.setCodEmprestimo(rs.getInt("Cod_Emprestimo"));
            bx.setCodLivro(rs.getInt("Cod_Livro"));

            // Adicionando o objeto à lista:
            Baix.add(bx);
        }
        rs.close();
        ps.close();
        return Baix;
    }

    // Este método, instancia o JavaBeans para consulta de um registro:
    public Baixa getBaixa(int Cod_Baixa) throws SQLException, ClassNotFoundException {
        cnn = c.getConexao();
        ps = cnn.prepareStatement("select * from Baixa where Cod_Baixa=?");
        ps.setInt(1, Cod_Baixa);
        ResultSet rs = ps.executeQuery();

        Baixa bx = new Baixa();
        if (rs.next()) {
            // Criando o objeto e setando valores:
            bx.setCodBaixa(rs.getInt("Cod_Baixa"));
            bx.setMotivoBaixa(rs.getString("Motivo_Baixa"));
            bx.setObsBaixa(rs.getString("Observacao"));
            bx.setMatriculaFunc(rs.getInt("Cod_Matricula"));
            bx.setCodEmprestimo(rs.getInt("Cod_Emprestimo"));
            bx.setCodLivro(rs.getInt("Cod_Livro"));
        }
        rs.close();
        ps.close();
        return bx;
    }

    public List<Baixa> getListaLike(String palavra, String tipo) throws SQLException, ClassNotFoundException {
        cnn = c.getConexao();
        if (palavra == "") {
            palavra = "0";
        }
        if (palavra == "0") {
            ps = cnn.prepareStatement("select * from Baixa ");
        } else {
            ps = cnn.prepareStatement("select * from Baixa where " + tipo + "  = ?");
            ps.setInt(1, Integer.parseInt(palavra));
        }
       
        ResultSet rs = ps.executeQuery();
        List<Baixa> Baix = new ArrayList<Baixa>();
        while (rs.next()) {
            // Criando o objeto e setando valores:
            Baixa bx = new Baixa();
            bx.setCodBaixa(rs.getInt("Cod_Baixa"));
            bx.setMotivoBaixa(rs.getString("Motivo_Baixa"));
            bx.setObsBaixa(rs.getString("Observacao"));
            bx.setMatriculaFunc(rs.getInt("Cod_Matricula"));
            bx.setCodEmprestimo(rs.getInt("Cod_Emprestimo"));
            bx.setCodLivro(rs.getInt("Cod_Livro"));

            // Adicionando o objeto à lista:
            Baix.add(bx);
        }
        rs.close();
        ps.close();
        return Baix;
    }

}
