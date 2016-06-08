<%-- 
    Document   : visualizaEmprestimoCli
    Created on : 27/05/2016, 22:14:34
    Author     : Erico
--%>

<!DOCTYPE html>
<html lang="pt-br">
    <%@page import="br.com.Modelagem.Emprestimo, br.com.DAO.EmprestimoDAO,  java.util.List, br.com.Modelagem.Itens_Emprestimo, br.com.DAO.ItemEmprestimoDAO" %>
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">            
        <!-- As 3 meta tags acima *devem* vir em primeiro lugar dentro do `head`; qualquer outro conteúdo deve vir *após* essas tags -->
        <title>Visualiza Emprestimo</title>

        <!-- Bootstrap -->
        <link href="../../css/bootstrap.min.css" rel="stylesheet">

        <!-- HTML5 shim e Respond.js para suporte no IE8 de elementos HTML5 e media queries -->
        <!-- ALERTA: Respond.js não funciona se você visualizar uma página file:// -->
        <!--[if lt IE 9]>
          <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
          <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
        <![endif]-->

        <style>
            body{
            background: url(../../img/fundoTabela.jpg) no-repeat center top fixed;
            -webkit-background-size: cover;
            -moz-background-size: cover;
            -o-background-size: cover;
            background-size: cover;
            /*overflow: hidden;*/
        }   
        
        td {
            white-space: nowrap;
        }
        
        th {
            white-space: nowrap;
        }   
        </style>

    </head>
    <body>

        <%
            EmprestimoDAO empdao = new EmprestimoDAO();
            List<Emprestimo> Emprestimos = empdao.getEmprestimoCli(Integer.parseInt(String.valueOf(session.getAttribute("cod"))));
        %>
        <div class="table-responsive">  
            <table class="table table-bordered">
                <!-- <tr><th colspan="18">Clientes</tr> -->
                <tr>
                    <th>Código do Emprestimo</th><th>Código do Cliente</th><th>Funcionario</th><th>Código da Reserva</th><th>Data da Retirada</th><th>Data da Entrega</th><th>Código do Livro</th><th></th>
                </tr>
                <%
                    String sDestaque = "onMouseOver=\"this.style.backgroundColor='#ECECFF'; this.style.cursor='hand';\"";
                    sDestaque += "onMouseOut=\"this.style.backgroundColor='';\"";

                    int cor = 0;
                    for (Emprestimo Emp : Emprestimos) {
                        String sCor = "cor" + (cor % 2);
                        cor++;

                        // Fazer da linha da tabela, um link para exibição:
                        out.print("");

                        out.print("<tr id='" + sCor + "' " + sDestaque + ">");

                        out.print("<td>" + Emp.getCodEmprestimo() + "</td>");
                        out.print("<td>" + Emp.getCodCliente() + "</td>");
                        out.print("<td>" + Emp.getMatriculaFunc() + "</td>");
                        out.print("<td>" + Emp.getCodReserva() + "</td>");
                        out.print("<td>" + Emp.getDataRetirada() + "</td>");
                        out.print("<td>" + Emp.getDataDevolucao() + "</td>");

                        ItemEmprestimoDAO itensdao = new ItemEmprestimoDAO();
                        List<Itens_Emprestimo> Itens = itensdao.getLista(Emp.getCodEmprestimo());

                        for (Itens_Emprestimo ItenE : Itens) {

                            out.print("<td>" + ItenE.getCodLivro() + "</td>");

                        }

                        out.print("</tr>");

                        //out.print("</a>");
                    }
                %>
            </table>
        </div>






        <!-- jQuery (obrigatório para plugins JavaScript do Bootstrap) -->
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
        <!-- Inclui todos os plugins compilados (abaixo), ou inclua arquivos separadados se necessário -->
        <script src="js/bootstrap.min.js"></script>
    </body>
</html>