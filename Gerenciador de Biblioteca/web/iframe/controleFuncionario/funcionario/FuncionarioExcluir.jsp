<html>
    <%@page import="br.com.DAO.FuncionarioDAO"%>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title></title>
    </head>
    <body>
        <%-- Instanciar a DAO para acesso a regras que depensam do banco e CRUD --%>
        <%
        int func = Integer.parseInt(request.getParameter("MatriculaFunc"));
        // Instanciar DAO para CRUD:
        FuncionarioDAO funcDAO = new FuncionarioDAO();
        // Inserir (enviando objeto que coletou dados pelo Java Beans:
        boolean res = funcDAO.desativarfunc(func);
        if (!res) {
            out.println ("Falha na exclusao do registro!");
            out.close();
        }
        %>
        <jsp:forward page="visualizaFuncionario.jsp"></jsp:forward>
    </body>
</html>