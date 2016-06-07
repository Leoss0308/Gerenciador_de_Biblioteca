/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.Servlet;

import br.com.DAO.LivroDAO;
import br.com.Modelagem.Livro;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;

/**
 *
 * @author Amanda
 */
@MultipartConfig(fileSizeThreshold = 1024 * 1024 * 2, maxFileSize = 1024 * 1024 * 10, maxRequestSize = 1024 * 1024 * 50)

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
    private String getFileName(final Part part) {
        final String partHeader = part.getHeader("content-disposition");

        for (String content : part.getHeader("content-disposition").split(";")) {
            if (content.trim().startsWith("filename")) {
                return content.substring(
                        content.indexOf('=') + 1).trim().replace("\"", "");
            }
        }
        return null;
    }

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String pagina = "sucesso.jsp";
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try (PrintWriter out1 = response.getWriter()) {
            HttpSession session = request.getSession();
            //String name = request.getParameter("unname");
            Part filePart = request.getPart("filecover");

            Livro liv = new Livro();
            liv.setCodLivro(Integer.parseInt(request.getParameter("txtCodLivro")));
            liv.setISBN(request.getParameter("txtISBN"));
            liv.setEdicaoLivro(request.getParameter("txtEdicao"));
            liv.setTituloLivro(request.getParameter("txtTitulo"));
            liv.setAutorLivro(request.getParameter("txtAutor"));
            liv.setEditoraLivro(request.getParameter("txtEditora"));
            liv.setResumoLivro(request.getParameter("txtResumo"));
            liv.setPrecoLivro(request.getParameter("txtPreco"));
            liv.setAnoPublicacao(request.getParameter("txtAnoPublicacao"));
            liv.setCategoriaLivro(request.getParameter("txtCategoria"));
            liv.setTags(request.getParameter("txtTags"));
            liv.setObsLivro(request.getParameter("txtObs"));
            // liv.setAvaria(Integer.parseInt(request.getParameter("txtAvaria")));
            liv.setMatriculaFunc(Integer.parseInt(request.getParameter("Matricula_Func")));

            String photo = "";
            String usuario = System.getProperty("user.name");
            String path = "C:\\Users\\" + usuario + "\\Documents\\projeto 5 semestre\\trunk\\Gerenciador de Biblioteca\\web\\capaslivros";

            File file = new File(path);
            boolean v = file.mkdir();
            String fileName = getFileName(filePart);

            OutputStream outs = null;

            InputStream filecontent = null;

            PrintWriter writer = response.getWriter();
            try {
                outs = new FileOutputStream(new File(path + File.separator + fileName));

                filecontent = filePart.getInputStream();

                int read = 0;
                final byte[] bytes = new byte[1024];

                while ((read = filecontent.read(bytes)) != -1) {
                    outs.write(bytes, 0, read);

                    photo = path + "/" + fileName;

                }
                String teste = "capaslivros/" + fileName;

                //stmt.executeUpdate("insert into livro(imagem) values('" + photo + "')");
                
                LivroDAO livDAO = new LivroDAO();
                livDAO.atualizar(liv,teste);
                pagina += "?msg=Alterado com sucesso!";

            } catch (Exception ex) {
                pagina += "?msg=Descupe, mas ocorreu um erro: " + ex.getMessage();
            } finally {
                request.getRequestDispatcher(pagina).forward(request, response);
                out.close();
            }

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
