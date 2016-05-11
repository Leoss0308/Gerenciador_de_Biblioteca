/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.Servlet;

import br.com.DAO.LivroDAO;
import br.com.Modelagem.Livro;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Amanda
 */
public class LivroServletAlterar extends HttpServlet {

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

            Livro liv = new Livro();
            liv.setCodLivro(Integer.parseInt(request.getParameter("txtCodLivro")));
            liv.setISBN(request.getParameter("txtISBN"));
            liv.setEdicaoLivro(request.getParameter("txtEdicao"));
            liv.setTituloLivro(request.getParameter("txtTitulo"));
            liv.setAutorLivro(request.getParameter("txtAutor"));
            liv.setEditoraLivro(request.getParameter("txtEditora"));
            liv.setResumoLivro(request.getParameter("txtResumo"));
            liv.setPrecoLivro(request.getParameter("txtPreco"));
            liv.setAnoPublicacao(Date.valueOf(request.getParameter("txtAnoPublicacao")));
            liv.setQuantidade(Integer.parseInt(request.getParameter("txtQuantidade")));
            liv.setCategoriaLivro(request.getParameter("txtCategoria"));
            liv.setTags(request.getParameter("txtTags"));
            liv.setDataEntrada(Date.valueOf(request.getParameter("txtDataEntrada")));
            liv.setObsLivro(request.getParameter("txtObs"));
            liv.setAvaria(Integer.parseInt(request.getParameter("txtAvaria")));
            liv.setEmprestado(Integer.parseInt(request.getParameter("Emprestado")));
            liv.setMatriculaFunc(Integer.parseInt(request.getParameter("Matricula_Func")));

            LivroDAO livDAO = new LivroDAO();
            livDAO.atualizar(liv);
            pagina += "?msg=Alterado com sucesso!";

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
