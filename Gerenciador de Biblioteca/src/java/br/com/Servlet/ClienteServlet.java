/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.Servlet;

import br.com.DAO.ClienteDAO;
import br.com.Modelagem.Cliente;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author i7
 */
public class ClienteServlet extends HttpServlet {

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
        String pagina = "cadastroClie.jsp";
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();        
        try {
            
            Cliente cli = new Cliente();
            cli.setNome(request.getParameter("txtNome"));
            cli.setCpfClie(Integer.parseInt(request.getParameter("txtCPF".replaceAll("\\D", ""))));
            cli.setBairro(request.getParameter("txtBairro"));
            cli.setCep(Integer.parseInt(request.getParameter("txtCEP".replaceAll("\\D", ""))));
            cli.setCidade(request.getParameter("txtCidade"));
            cli.setEstado(request.getParameter("txtEstado"));
            cli.setTelefone(Integer.parseInt(request.getParameter("txtTelefone".replaceAll("\\D", ""))));
            cli.setEmail(request.getParameter("txtEmail"));
            cli.setLogin(request.getParameter("txtLogin"));
            cli.setSenha(request.getParameter("txtSenha"));
            cli.setDtCadastroClie(null);//arrumar isso
            cli.setEnd(request.getParameter("txtEndereco"));
            cli.setComplemento(request.getParameter("txtComplemento"));
            cli.setDtNasc(Date.valueOf(request.getParameter("txtDataNasc".replaceAll("\\D", ""))));

            
            ClienteDAO cliDAO = new ClienteDAO();
            cliDAO.inserir(cli);
            pagina += "?msg=Sucesso ";
            
        } catch (Exception ex) {
            pagina += "?msg=Erro: " + ex.getMessage();
        } finally {
            request.getRequestDispatcher(pagina).forward(request, response);
            out.close();
        }
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
