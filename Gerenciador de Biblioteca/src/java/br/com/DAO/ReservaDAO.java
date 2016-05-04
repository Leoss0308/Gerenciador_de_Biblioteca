
package br.com.DAO;

import br.com.Conexao.Conecta;
import br.com.Modelagem.Reserva;
import br.com.Modelagem.Cliente;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Time;
import java.util.ArrayList;
import java.util.List;


public class ReservaDAO {
    
    private Statement stmt;
    private Connection cnn;           // Atributo de conexao:
    private PreparedStatement ps = null;  // Objeto para SQL Preparado:
    
    public ReservaDAO(){
        
    }
    
    Conecta c = new Conecta();
    //inserir dados no banco
    public boolean inserir(Reserva Reser, Cliente Cli) throws Exception {
        try {
            cnn = c.getConexao();
            ps = cnn.prepareStatement(
                        "INSERT INTO Reserva (Data_Reserva, Hora_Reserva, Cod_Cliente) VALUES (?, ?, ?)");
            ps.setDate(1, (Date) Reser.getDataReseva());
            ps.setTime(2, (Time) Reser.getHoraReserva());
            ps.setInt(3, Cli.getCodClie());
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
