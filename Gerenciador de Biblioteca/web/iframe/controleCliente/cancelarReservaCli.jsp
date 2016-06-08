<%-- 
    Document   : cancelarReservaCli
    Created on : 07/06/2016, 20:30:01
    Author     : erico
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
        int itensReserv = Integer.parseInt(request.getParameter("codReserva"));
        ItemReservaDAO itensDAO = new ItemReservaDAO();
        boolean itens = itensDAO.cancelarItemReserva(itensReserv);
        //deletar os dados da tabela reserva
        int reserv = Integer.parseInt(request.getParameter("codReserva"));
        // Instanciar DAO para CRUD:
        ReservaDAO reservDAO = new ReservaDAO();
        // Inserir (enviando objeto que coletou dados pelo Java Beans:
        boolean res = reservDAO.cancelarReserva(reserv);
        //deletar os dados da tabela itens reserva
        
        
        if (!res) {
            out.println ("Falha na exclusao do registro!");
            out.close();
        }
        %>
        <jsp:forward page="visualizaReservaCli.jsp"></jsp:forward>
    </body>
</html>