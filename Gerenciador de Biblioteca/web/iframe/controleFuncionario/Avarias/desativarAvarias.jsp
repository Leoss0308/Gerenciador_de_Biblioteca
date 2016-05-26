<%-- 
    Document   : desativarAvarias
    Created on : 24/05/2016, 20:29:44
    Author     : Amanda
--%>

<html>
    <%@page import="br.com.DAO.BaixaDAO"%>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title></title>
    </head>
    <body>
        <%-- Instanciar a DAO para acesso a regras  do banco e CRUD --%>
        <%
            int bx = Integer.parseInt(request.getParameter("CodBaixa"));
            int Liv = Integer.parseInt(request.getParameter("CodLivro"));
            // Instanciar DAO para CRUD:
            BaixaDAO bxDAO = new BaixaDAO();
            // Inserir (enviando objeto que coletou dados pelo Java Beans):
            boolean res = bxDAO.cancelarBaixa(bx,Liv);
            if (!res) {
                out.println("Falha na exclusão do registro!");
                out.close();
            }
        %>
        <jsp:forward page="visualizaAvarias.jsp"></jsp:forward>
    </body>
</html>