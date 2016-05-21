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
import javax.servlet.http.HttpSession;

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
        String pagina = "sucessoPagCheia.jsp";
        String errodig = "cadastroClie.jsp";
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();        
        try {
            ClienteDAO cliDAO = new ClienteDAO();
            HttpSession cadclivolta = request.getSession();
            if(cliDAO.verificaCliLogin(request.getParameter("txtLogin")) == true ){
                
                
                
                cadclivolta.setAttribute("verificacao","1");
                cadclivolta.setAttribute("txtNome",request.getParameter("txtNome"));
                cadclivolta.setAttribute("txtCPF",request.getParameter("txtCPF"));
                cadclivolta.setAttribute("txtBairro",request.getParameter("txtBairro"));
                cadclivolta.setAttribute("txtCEP",request.getParameter("txtCEP"));
                cadclivolta.setAttribute("txtCidade",request.getParameter("txtCidade"));
                cadclivolta.setAttribute("txtEstado",request.getParameter("txtEstado"));
                cadclivolta.setAttribute("txtTelefone",request.getParameter("txtTelefone"));
                cadclivolta.setAttribute("txtEmail",request.getParameter("txtEmail"));
                cadclivolta.setAttribute("txtEndereco",request.getParameter("txtEndereco"));
                cadclivolta.setAttribute("txtComplemento",request.getParameter("txtComplemento"));
                
                errodig += "?login=true";
                request.getRequestDispatcher(errodig).forward(request, response);
            }
            else{
                Cliente cli = new Cliente();
                cli.setNome(request.getParameter("txtNome"));
                cli.setCpfClie(request.getParameter("txtCPF"));
                cli.setBairro(request.getParameter("txtBairro"));
                cli.setCep(request.getParameter("txtCEP"));
                cli.setCidade(request.getParameter("txtCidade"));
                cli.setEstado(request.getParameter("txtEstado"));
                cli.setTelefone(request.getParameter("txtTelefone"));
                cli.setEmail(request.getParameter("txtEmail"));
                cli.setLogin(request.getParameter("txtLogin"));
                cli.setSenha(request.getParameter("txtSenha"));
                cli.setEnd(request.getParameter("txtEndereco"));
                cli.setComplemento(request.getParameter("txtComplemento"));
                cli.setDtNasc(Date.valueOf(request.getParameter("txtDataNasc")));



                cliDAO.inserir(cli);
                pagina += "?msg=Cadastrado com sucesso!";
                cadclivolta.setAttribute("verificacao",null);
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
