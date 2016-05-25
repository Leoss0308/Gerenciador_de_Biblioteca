<%-- 
    Document   : visualizaReserva
    Created on : 06/05/2016, 20:16:03
    Author     : Erico
--%>

<!DOCTYPE html>
<html lang="pt-br">
    <%@page import="br.com.Modelagem.Reserva, br.com.DAO.ReservaDAO, java.util.List, br.com.Modelagem.Itens_Reserva,br.com.DAO.ItemReservaDAO" %>
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <!-- As 3 meta tags acima *devem* vir em primeiro lugar dentro do `head`; qualquer outro conteúdo deve vir *após* essas tags -->
        <title>Tabela Reserva</title>

        <!-- Bootstrap -->
        <link href="../../../css/bootstrap.min.css" rel="stylesheet">

        <!-- HTML5 shim e Respond.js para suporte no IE8 de elementos HTML5 e media queries -->
        <!-- ALERTA: Respond.js não funciona se você visualizar uma página file:// -->
        <!--[if lt IE 9]>
          <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
          <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
        <![endif]-->

        <style>
            body{
                background: url(../img/fundo.jpg) no-repeat center top fixed;
                -webkit-background-size: cover;
                -moz-background-size: cover;
                -o-background-size: cover;
                background-size: cover;
                /*overflow: hidden;*/
            }   
        </style>

    </head>
    <body>

        <%
            ReservaDAO reserdao = new ReservaDAO();
            List<Reserva> reservas = reserdao.getLista();
        %>
        <div class="table-responsive">  
            <table class="table table-bordered">
                <!-- <tr><th colspan="18">Clientes</tr> -->
                <tr>
                    <th>Código da Reserva</th><th>Código do Cliente</th><th>Data Reserva</th><th>Código do Livro 1</th><th>Código do Livro 2</th><th>Código do Livro 3</th><th>Efetivar Emprestimo Livro 1</th><th>Efetivar Emprestimo Livro 2</th><th>Efetivar Emprestimo Livro 3</th><th></th>
                </tr>
                <%
                    String sDestaque = "onMouseOver=\"this.style.backgroundColor='#ECECFF'; this.style.cursor='hand';\"";
                    sDestaque += "onMouseOut=\"this.style.backgroundColor='';\"";

                    int cor = 0;
                    for (Reserva reserv : reservas) {
                        String sCor = "cor" + (cor % 2);
                        cor++;

                        // Fazer da linha da tabela, um link para exibição:
                        out.print("");

                        out.print("<tr id='" + sCor + "' " + sDestaque + ">");

                        out.print("<td>" + reserv.getCodReserva() + "</td>");
                        out.print("<td>" + reserv.getCodClie() + "</td>");
                        out.print("<td>" + reserv.getDataReseva() + "</td>");

                        ItemReservaDAO itensdao = new ItemReservaDAO();
                        List<Itens_Reserva> Itens = itensdao.getLista(reserv.getCodReserva());

                        for (Itens_Reserva ItensR : Itens) {

                            out.print("<td>" + ItensR.getCodLivro() + "<td>");
                            // Controle para manutenção: Efetiva Emprestimo, para colocar o livro como emprestado
                            out.print("<td id='cmd'><a href='../../../efetivaEmprestimo.jsp?codClie=" + reserv.getCodClie() + "&codReserva=" + reserv.getCodReserva() + "&codLivro=" + ItensR.getCodLivro() + "'><img src='../../img/alterar.jpg' title='Alterar' /></a></td>");

                        }
                        //passagem de parametros para cancelar a reserva
                        out.print("<td id='cmd'><a href='cancelarReserva.jsp?codReserva=" + reserv.getCodReserva() + "'><img src='../../../img/delete-peq.jpg' title='Excluir'/></a></td>");

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