/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.Servlet;

import br.com.DAO.FuncionarioDAO;
import br.com.Modelagem.Funcionario;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Gustavo Rabelo
 */
public class FuncionarioServletAlterar extends HttpServlet {

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
        String pagina = "sucesso.jsp";
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
         
            Funcionario func = new Funcionario();
            func.setMatriculaFunc(Integer.parseInt(request.getParameter("txtMatricula")));
            func.setNome(request.getParameter("txtNome"));
            func.setDtNasc(Date.valueOf(request.getParameter("txtDataNasc")));
            func.setEmail(request.getParameter("txtEmail"));
            func.setTelefone(request.getParameter("txtTelefone"));
            func.setCep(request.getParameter("txtCEP"));
            func.setEnd(request.getParameter("txtEndereco"));
            func.setBairro(request.getParameter("txtBairro"));
            func.setComplemento(request.getParameter("txtComplemento"));
            func.setEstado(request.getParameter("txtEstado"));
            func.setCidade(request.getParameter("txtCidade"));
            func.setLogin(request.getParameter("txtLogin"));
            func.setSenha(request.getParameter("txtSenha"));
            func.setStatusFunc(Integer.getInteger(request.getParameter("txtStatus")));
            func.setTipoFunc(Integer.getInteger(request.getParameter("txtTipo")));
            
            FuncionarioDAO funcDAO = new FuncionarioDAO();
            funcDAO.atualizar(func);
            pagina += "?msg=Alterado com sucesso!";
            
        } catch (Exception ex) {
            pagina += "?msg=Desculpe, mas ocorreu um erro: " + ex.getMessage();
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