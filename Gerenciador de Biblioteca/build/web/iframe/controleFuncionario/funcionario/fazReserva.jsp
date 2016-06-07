<%-- 
    Document   : fazReserva
    Created on : 06/06/2016, 21:23:38
    Author     : Erico
--%>

<%@page import="br.com.Modelagem.Reserva"%>
<%@page import="br.com.Modelagem.Itens_Reserva"%>
<html>
    <%@page import="br.com.DAO.ReservaDAO, br.com.DAO.ItemReservaDAO"%>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title></title>
    </head>
    <body>
        <%-- Instanciar a DAO para acesso a regras que depensam do banco e CRUD --%>
        <%
        //Inserir os dados na tabela Reserva
           
            //requisitando os valores para inserção na tabela;
            int codClie = Integer.parseInt(String.valueOf(session.getAttribute("cod")));
            // Instanciar o DAO para inserção dos valores
            
            ReservaDAO reservadao = new ReservaDAO();
            //Chamando o parametro de inserção do DAO, e enviando os valores
            
            Reserva reser = new Reserva();
            
            reser.setCodClie(codClie);    
                        
            boolean res = reservadao.inserirReserva(reser);
            
            //inserir os dados na tabela Itens Reserva
            ItemReservaDAO itemdao = new ItemReservaDAO();
            //Requisitando os valores para inserção na tabela
            int codReserva = reservadao.getCodReser(Integer.parseInt(request.getParameter("codClie")));
            int codLivro = Integer.parseInt(request.getParameter("CodLivro"));
            
            // Chamando o parametro de inserção do DAO, e enviando os valores
            Itens_Reserva ItemReser = new Itens_Reserva();
            
            ItemReser.setCodReserva(codReserva);
            ItemReser.setCodLivro(codLivro);
                        
            boolean ress = itemdao.inserirItemReserva(ItemReser);
            
            if (!res) {
                out.println("Falha no Emprestimo do Livro!");
                out.close();
            }
        %>
        <jsp:forward page="visualizaReservaCli"></jsp:forward>
    </body>
</html>