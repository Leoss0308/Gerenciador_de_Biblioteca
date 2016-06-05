
<html>
    <%@page import="br.com.DAO.FaleConoscoDAO"%>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title></title>
    </head>
    <body>
        <%-- Instanciar a DAO para acesso a regras que depensam do banco e CRUD --%>
        <%
        int codfc = Integer.parseInt(request.getParameter("codfc"));
        // Instanciar DAO para CRUD:
        FaleConoscoDAO fcDAO = new FaleConoscoDAO();
        // Inserir (enviando objeto que coletou dados pelo Java Beans:
        boolean res = fcDAO.excluirMsg(codfc);
        if (!res) {
            out.println ("Falha na exclusao do registro!");
            out.close();
        }
        %>
        <jsp:forward page="VisualizarFaleConosco.jsp"></jsp:forward>
    </body>
</html>