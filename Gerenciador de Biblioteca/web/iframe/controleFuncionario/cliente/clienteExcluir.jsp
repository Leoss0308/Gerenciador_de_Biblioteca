
<html>
    <%@page import="br.com.DAO.ClienteDAO"%>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title></title>
    </head>
    <body>
        <%-- Instanciar a DAO para acesso a regras que depensam do banco e CRUD --%>
        <%
        int cli = Integer.parseInt(request.getParameter("codClie"));
        // Instanciar DAO para CRUD:
        ClienteDAO cliDAO = new ClienteDAO();
        // Inserir (enviando objeto que coletou dados pelo Java Beans:
        boolean res = cliDAO.desativarcli(cli);
        if (!res) {
            out.println ("Falha na exclusao do registro!");
            out.close();
        }
        %>
        <jsp:forward page="visualizaCliente.jsp"></jsp:forward>
    </body>
</html>