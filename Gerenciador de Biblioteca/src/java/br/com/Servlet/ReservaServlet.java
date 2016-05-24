/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.Servlet;

import br.com.Modelagem.Itens_Reserva;
import br.com.DAO.ItemReservaDAO;
import br.com.DAO.ReservaDAO;
import br.com.Modelagem.Reserva;
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
public class ReservaServlet extends HttpServlet {

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
            Reserva reserv = new Reserva();
            reserv.setCodClie(Integer.parseInt(request.getParameter("txtCodClie")));

            ReservaDAO reservDAO = new ReservaDAO();
            reservDAO.inserirReserva(reserv);

            pagina += "?msg=Cadastrado com sucesso!";
            //inserir itens reserva
            Itens_Reserva Itens = new Itens_Reserva();
            Itens.setCodLivro(Integer.parseInt(request.getParameter("txtCodLivro")));
            //chama o parametro no DAO que seleciona o cod da reserva
            Itens.setCodReserva(reservDAO.getCodReser(Integer.parseInt(request.getParameter("CodClie"))));
            
            ItemReservaDAO ItensDAO = new ItemReservaDAO();
            ItensDAO.inserirItemReserva(Itens);
                        
            
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

