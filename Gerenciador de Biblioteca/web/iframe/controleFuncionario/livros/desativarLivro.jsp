<%-- 
    Document   : desativarLivro
    Created on : 14/05/2016, 19:33:04
    Author     : Amanda
--%>

<html>
    <%@page import="br.com.DAO.LivroDAO"%>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title></title>
    </head>
    <body>
        <%-- Instanciar a DAO para acesso a regras  do banco e CRUD --%>
        <%
            int liv = Integer.parseInt(request.getParameter("CodLivro"));
            // Instanciar DAO para CRUD:
            LivroDAO livDAO = new LivroDAO();
            // Inserir (enviando objeto que coletou dados pelo Java Beans):
            boolean res = livDAO.desativarLivro(liv);
            if (!res) {
                out.println("Falha na exclusão do registro!");
                out.close();
            }
        %>
        <jsp:forward page="visualizaLivro.jsp"></jsp:forward>
    </body>
</html>