<%--
    Document   : efetivaEmprestimo
    Created on : 24/05/2016, 19:20:11
    Author     : Erico
--%>

<%@page import="br.com.Modelagem.Emprestimo"%>
<%@page import="br.com.Modelagem.Itens_Emprestimo"%>
<html>
    <%@page import="br.com.DAO.EmprestimoDAO, br.com.DAO.ItemEmprestimoDAO, br.com.DAO.LivroDAO, br.com.DAO.ReservaDAO, br.com.DAO.ItemReservaDAO"%>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title></title>
    </head>
    <body>
        <%-- Instanciar a DAO para acesso a regras que depensam do banco e CRUD --%>
        <%
        //Inserir os dados na tabela Emprestimo
            
            LivroDAO livrodao = new LivroDAO();
            //requisitando os valores para inserção na tabela;
            String titulo = livrodao.getTituloLivro(Integer.parseInt(request.getParameter("codLivro")));
            int codReserva = Integer.parseInt(request.getParameter("codReserva"));
            int codClie  = Integer.parseInt(request.getParameter("codClie"));
            int matricula = Integer.parseInt(String.valueOf(session.getAttribute("cod")));
            
            // Instanciar o DAO para inserção dos valores
            
            EmprestimoDAO emprestimodao = new EmprestimoDAO();
            //Chamando o parametro de inserção do DAO, e enviando os valores
            
            Emprestimo emp = new Emprestimo();
            
            emp.setTitulo(titulo);
            emp.setCodReserva(codReserva);
            emp.setCodCliente(codClie);
            emp.setMatriculaFunc(matricula);        
                        
            boolean res = emprestimodao.inserirEmprestimo(emp);
            
            //inserir os dados na tabela Itens Emprestimo
            
            ItemEmprestimoDAO itemdao = new ItemEmprestimoDAO();
            //Requisitando os valores para inserção na tabela
            int codEmprestimo = emprestimodao.getCodEmpr(Integer.parseInt(request.getParameter("codClie")));
            int codLivro = Integer.parseInt(request.getParameter("codLivro"));
            
            // Chamando o parametro de inserção do DAO, e enviando os valores
            
            Itens_Emprestimo ItemEmp = new Itens_Emprestimo();
            
            ItemEmp.setCodEmprestimo(codEmprestimo);
            ItemEmp.setCodLivro(codLivro);
            
            boolean ress = itemdao.inserirItemEmprestimo(ItemEmp);
            //deletar reserva
            
            ItemReservaDAO itensDAO = new ItemReservaDAO();
            res = itensDAO.cancelarItemReserva(codReserva);
            //deletar os dados da tabela reserva
            // Instanciar DAO para CRUD:
            ReservaDAO reservDAO = new ReservaDAO();
            // Inserir (enviando objeto que coletou dados pelo Java Beans:
            res = reservDAO.cancelarReserva(codReserva);
            
            if (!res) {
                out.println("Falha no Emprestimo do Livro!");
                out.close();
            }
        %>
        <jsp:forward page="visualizaEmprestimo.jsp"></jsp:forward>
    </body>
</html>