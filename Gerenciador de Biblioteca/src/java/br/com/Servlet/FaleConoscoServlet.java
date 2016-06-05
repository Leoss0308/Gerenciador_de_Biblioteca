/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.Servlet;

import br.com.DAO.ClienteDAO;
import br.com.DAO.FaleConoscoDAO;
import br.com.Modelagem.Cliente;
import br.com.Modelagem.FaleConosco;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author i7
 */
public class FaleConoscoServlet extends HttpServlet {

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
        String pagina = "sucessoPagCheia.jsp";
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();        
        try {         
                FaleConoscoDAO fcDAO = new FaleConoscoDAO();
                FaleConosco fc = new FaleConosco();
                
                fc.setNome(request.getParameter("txtNome"));
                fc.setEmail(request.getParameter("txtEmail"));
                fc.setTelefone(request.getParameter("txtTelefone"));
                fc.setAssunto(request.getParameter("txtAssunto"));
                fc.setMensagem(request.getParameter("txtMensagem"));
               

                fcDAO.inserir(fc);
                pagina += "?msg=Cadastrado com sucesso!";
                request.getRequestDispatcher(pagina).forward(request, response);
            
        } catch (Exception ex) {
            pagina += "?msg=Desculpe, mas ocorreu um erro: " + ex.getMessage();
            request.getRequestDispatcher(pagina).forward(request, response);
            
        } finally {
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
