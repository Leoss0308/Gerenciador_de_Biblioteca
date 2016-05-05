/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.DAO;

import br.com.Conexao.Conecta;
import br.com.Modelagem.Emprestimo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;

/**
 *
 * @author Amanda
 */
public class EmprestimoDAO {
    
    private Statement stmt;
    private Connection cnn;           // Atributo de conexao:
    private PreparedStatement ps = null;  // Objeto para SQL Preparado:
    
    
    public EmprestimoDAO(){
}
    Conecta c = new Conecta();
    //inserir dados no banco
    
     public boolean inserir(Emprestimo emp) throws Exception {
        try {
            cnn = c.getConexao();
            ps = cnn.prepareStatement(
                    "INSERT INTO Emprestimo ( ) VALUES (?, ?)");
            
            ps.executeUpdate();
            ps.close();
            return true;

        } catch (Exception e) {

            System.out.println(e.toString());
            return false;
        }

    }
    
}
