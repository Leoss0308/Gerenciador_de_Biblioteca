/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.Servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import br.com.DAO.LoginDAO;
import br.com.Modelagem.Cliente;

/**
 *
 * @author i7
 */
public class LoginServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        // Por default chamarei a pagina index e passarei o parametro erro=1
        String pagina = "login.jsp?erro=1";
        
        LoginDAO l = new LoginDAO();
        Cliente cli = new Cliente();
        
        String login = request.getParameter("login");
        String senha = request.getParameter("senha");
        try {
           cli=l.loginCliente(login, senha);
           
           if (login.equals(cli.getLogin())) {
                if (senha.equals(cli.getSenha())) {

                    // Criar objeto para obter sessão do JSP:
                    HttpSession sessao = request.getSession();
                    
                    
                    String nome = cli.getNome();
                    String lnome = "";
                    for( int i = 0; i < nome.length(); i++)    
                    {    
                     if(nome.charAt(i) !=' ')   
                           lnome=lnome+nome.charAt(i);   
                     else  
                          break;    
                    }   
                    
                    // Setando um atributo da sessao:
                    sessao.setAttribute("permissao", "1");
                    sessao.setAttribute("nome", lnome);
                    String cod = Integer.toString(cli.getCodClie());
                    sessao.setAttribute("cod", cod);
                    // Como obteve sucesso, chamar a página principal:
                    pagina = "index.jsp";
                }
            }
           
           


        } catch (Exception ex) {
            ex.getMessage();
        } 
        

        response.sendRedirect(pagina);

        
     
        
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
