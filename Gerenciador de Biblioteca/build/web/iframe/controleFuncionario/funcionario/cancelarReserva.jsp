<%-- 
    Document   : cancelarReserva
    Created on : 14/05/2016, 19:10:23
    Author     : Erico
--%>

<html>
    <%@page import="br.com.DAO.ReservaDAO, br.com.DAO.ItemReservaDAO"%>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title></title>
    </head>
    <body>
        <%-- Instanciar a DAO para acesso a regras que depensam do banco e CRUD --%>
        <%
        //deletar os dados da tabela reserva
        int reserv = Integer.parseInt(request.getParameter("codReserva"));
        // Instanciar DAO para CRUD:
        ReservaDAO reservDAO = new ReservaDAO();
        // Inserir (enviando objeto que coletou dados pelo Java Beans:
        boolean res = reservDAO.cancelarReserva(reserv);
        //deletar os dados da tabela itens reserva
        int itensReserv = Integer.parseInt(request.getParameter("codReserva"));
        ItemReservaDAO itensDAO = new ItemReservaDAO();
        boolean itens = itensDAO.cancelarItemReserva(itensReserv);
        
        if (!res) {
            out.println ("Falha na exclusao do registro!");
            out.close();
        }
        %>
        <jsp:forward page="visualizaReserva.jsp"></jsp:forward>
    </body>
</html>