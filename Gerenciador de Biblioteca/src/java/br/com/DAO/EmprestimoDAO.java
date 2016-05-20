package br.com.DAO;

import br.com.Conexao.Conecta;
import br.com.Modelagem.Emprestimo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class EmprestimoDAO {

    private Statement stmt;
    private Connection cnn;           // Atributo de conexao:
    private PreparedStatement ps = null;  // Objeto para SQL Preparado:

    public EmprestimoDAO() {

    }

    Conecta c = new Conecta();

    //inserir dados no banco

    public boolean inserirEmprestimo(Emprestimo Emp) throws Exception {
        try {
            cnn = c.getConexao();
            ps = cnn.prepareStatement(
                    "INSERT INTO Emprestimo (Titulo, Qtd_Livro, Cod_Reserva, Cod_Cliente, Cod_Matricula) VALUES (?,?,?,?,?)");
            ps.setString(1, Emp.getTitulo());
            ps.setInt(2, Emp.getQtdLivro());
            ps.setInt(3, Emp.getCodReserva());
            ps.setInt(4, Emp.getCodCliente());
            ps.setInt(5, Emp.getMatriculaFunc());
            ps.executeUpdate();
            ps.close();
            return true;

        } catch (Exception e) {

            System.out.println(e.toString());
            return false;
        }

    }

    //cacelar reserva

    public boolean devolucaoEmprestimo(int Emp) throws Exception {
        try {
            cnn = c.getConexao();
            ps = cnn.prepareStatement(
                    "UPDATE Emprestimo SET Data_Entrega = NOW() where Cod_Emprestimo=?");
            ps.setInt(1, Emp);
            ps.executeUpdate();
            ps.close();
            return true;
        } catch (Exception e) {
            System.out.println(e.toString());
            return false;
        }
    }

    // Este método, instancia o JavaBeans para auxiliar a montar a lista:
    public List<Emprestimo> getLista() throws SQLException, ClassNotFoundException {
        cnn = c.getConexao();
        ps = cnn.prepareStatement("select * from Emprestimo");
        ResultSet rs = ps.executeQuery();
        List<Emprestimo> Emp = new ArrayList<Emprestimo>();
        while (rs.next()) {
            // Criando o objeto e setando valores:
            Emprestimo Empr = new Emprestimo();
            Empr.setCodEmprestimo(rs.getInt("Cod_Emprestimo"));
            Empr.setTitulo(rs.getString("Titulo"));
            Empr.setQtdLivro(rs.getInt("Qtd_Livro"));
            Empr.setDataRetirada(rs.getDate("Data_Retirada"));
            Empr.setDataDevolucao(rs.getDate("Data_Entrega"));
            Empr.setCodReserva(rs.getInt("Cod_Reserva"));
            Empr.setCodCliente(rs.getInt("Cod_Cliente"));
            Empr.setMatriculaFunc(rs.getInt("Cod_Matricula"));

            // Adicionando o objeto à lista:
            Emp.add(Empr);
        }
        rs.close();
        ps.close();
        return Emp;
    }

    // Este método, instancia o JavaBeans para consulta de um registro:
    public Emprestimo getReser(int CodEmprestimo) throws SQLException, ClassNotFoundException {
        cnn = c.getConexao();
        ps = cnn.prepareStatement("select * from Emprestimo where Cod_Emprestimo=?");
        ps.setInt(1, CodEmprestimo);
        ResultSet rs = ps.executeQuery();

        Emprestimo Emp = new Emprestimo();
        if (rs.next()) {
            // Criando o objeto e setando valores:
            Emp.setCodEmprestimo(rs.getInt("Cod_Emprestimo"));
            Emp.setTitulo(rs.getString("Titulo"));
            Emp.setQtdLivro(rs.getInt("Qtd_Livro"));
            Emp.setDataRetirada(rs.getDate("Data_Retirada"));
            Emp.setDataDevolucao(rs.getDate("Data_Entrega"));
            Emp.setCodReserva(rs.getInt("Cod_Reserva"));
            Emp.setCodCliente(rs.getInt("Cod_Cliente"));
            Emp.setMatriculaFunc(rs.getInt("Cod_Matricula"));
        }
        rs.close();
        ps.close();
        return Emp;
    }

}
