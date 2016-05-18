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
import javax.servlet.http.HttpSession;

/**
 *
 * @author erico
 */
public class FuncionarioServlet extends HttpServlet {

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
        String errodig = "cadastroFunc.jsp";
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
         try {
             
             FuncionarioDAO funcDAO = new FuncionarioDAO();
            if(funcDAO.verificaFuncLogin(request.getParameter("txtLogin")) == true ){
                
                
                HttpSession cadfuncvolta = request.getSession();
                cadfuncvolta.setAttribute("verificacao","1");
                cadfuncvolta.setAttribute("txtNome",request.getParameter("txtNome"));
                cadfuncvolta.setAttribute("txtBairro",request.getParameter("txtBairro"));
                cadfuncvolta.setAttribute("txtCEP",request.getParameter("txtCEP"));
                cadfuncvolta.setAttribute("txtCidade",request.getParameter("txtCidade"));
                cadfuncvolta.setAttribute("txtEstado",request.getParameter("txtEstado"));
                cadfuncvolta.setAttribute("txtTelefone",request.getParameter("txtTelefone"));
                cadfuncvolta.setAttribute("txtEmail",request.getParameter("txtEmail"));
                cadfuncvolta.setAttribute("txtEndereco",request.getParameter("txtEndereco"));
                cadfuncvolta.setAttribute("txtComplemento",request.getParameter("txtComplemento"));
                
                errodig += "?login=true";
                request.getRequestDispatcher(errodig).forward(request, response);
            }
            else{
                Funcionario func = new Funcionario();
                func.setNome(request.getParameter("txtNome"));
                func.setBairro(request.getParameter("txtBairro"));
                func.setCep(request.getParameter("txtCEP"));
                func.setCidade(request.getParameter("txtCidade"));
                func.setEstado(request.getParameter("txtEstado"));
                func.setTelefone(request.getParameter("txtTelefone"));
                func.setEmail(request.getParameter("txtEmail"));
                func.setLogin(request.getParameter("txtLogin"));
                func.setSenha(request.getParameter("txtSenha"));
                func.setEnd(request.getParameter("txtEndereco"));
                func.setComplemento(request.getParameter("txtComplemento"));
                func.setDtNasc(Date.valueOf(request.getParameter("txtDataNasc")));



                funcDAO.inserir(func);
                pagina += "?msg=Cadastrado com sucesso!";
                request.getRequestDispatcher(pagina).forward(request, response);
            }
            
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
