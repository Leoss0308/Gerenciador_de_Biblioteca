/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.Servlet;

import br.com.Modelagem.Itens_Emprestimo;
import br.com.DAO.ItemEmprestimoDAO;
import br.com.DAO.EmprestimoDAO;
import br.com.Modelagem.Emprestimo;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Erico
 */
public class EmprestimoServlet extends HttpServlet {

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
            Emprestimo Emp = new Emprestimo();
            Emp.setCodCliente(Integer.parseInt(request.getParameter("txtCodClie")));

            EmprestimoDAO EmpDAO = new EmprestimoDAO();
            EmpDAO.inserirEmprestimo(Emp);
            //inserir itens Emprestimo
            Itens_Emprestimo ItenE = new Itens_Emprestimo();
            ItenE.setCodLivro(Integer.parseInt(request.getParameter("txtCodLivro")));
            //chama o parametro no DAO que seleciona o cod do Emprestimo
            ItenE.setCodEmprestimo(EmpDAO.getCodEmpr(Integer.parseInt(request.getParameter("CodClie"))));
            
            ItemEmprestimoDAO ItensDAO = new ItemEmprestimoDAO();
            ItensDAO.inserirItemEmprestimo(ItenE);
            
            pagina += "?msg=Cadastrado com sucesso!";            
            
        } catch (Exception ex) {
            pagina += "?msg=Descupe, mas ocorreu um erro: " + ex.getMessage();
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

