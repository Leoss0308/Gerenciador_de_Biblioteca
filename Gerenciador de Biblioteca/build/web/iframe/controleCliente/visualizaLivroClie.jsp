<%-- 
    Document   : visualizaLivro
    Created on : 14/05/2016, 18:59:32
    Author     : Amanda
--%>

<!DOCTYPE html>
<html lang="pt-br">
    <%@page import="br.com.Modelagem.Livro, br.com.DAO.LivroDAO,  java.util.List" %>
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <!-- As 3 meta tags acima *devem* vir em primeiro lugar dentro do `head`; qualquer outro conteúdo deve vir *após* essas tags -->
        <title>Tabela Livro</title>

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
                background: url(../../../img/fundoTabela.jpg) no-repeat center top fixed;
                -webkit-background-size: cover;
                -moz-background-size: cover;
                -o-background-size: cover;
                background-size: cover;
                /*overflow: hidden;*/
            }   

            td {
                white-space: nowrap;
            }
        </style>

    </head>
    <body>

        <%
            LivroDAO livdao = new LivroDAO();
            List<Livro> livro = livdao.getLista();
        %>
        <div class="table-responsive">  
            <table class="table table-bordered">
                <!-- <tr><th colspan="18">Livro</tr> -->
                <tr>
                    <th>Código</th><th>ISBN</th><th>Edição</th><th>Título<th><th>Autor</th><th>Editora</th><th>Resumo</th><th>Preco</th><th>Ano Publicacao</th><th>Quantidade</th><th>Categoria</th><th>Tags</th><th>Observação</th><th>Status Avaria</th><th>Status Empréstimo</th><th>Matrícula Funcionário</th><th></th>
                </tr>
                <%
                    String sDestaque = "onMouseOver=\"this.style.backgroundColor='#ECECFF'; this.style.cursor='hand';\"";
                    sDestaque += "onMouseOut=\"this.style.backgroundColor='';\"";

                    int cor = 0;
                    for (Livro liv : livro) {
                        String sCor = "cor" + (cor % 2);
                        cor++;

                        // Fazer da linha da tabela, um link para exibição:
                        out.print("");

                        out.print("<tr id='" + sCor + "' " + sDestaque + ">");

                        out.print("<td>" + liv.getCodLivro() + "</td>");
                        out.print("<td>" + liv.getISBN() + "</td>");
                        out.print("<td>" + liv.getEdicaoLivro() + "</td>");
                        out.print("<td>" + liv.getTituloLivro() + "</td>");
                        out.print("<td>" + liv.getAutorLivro() + "</td>");
                        out.print("<td>" + liv.getEditoraLivro() + "</td>");
                        out.print("<td>" + liv.getResumoLivro() + "</td>");
                        out.print("<td>" + liv.getPrecoLivro() + "</td>");
                        out.print("<td>" + liv.getAnoPublicacao() + "</td>");
                        out.print("<td>" + liv.getQuantidade() + "</td>");
                        out.print("<td>" + liv.getCategoriaLivro() + "</td>");
                        out.print("<td>" + liv.getTags() + "</td>");
                        out.print("<td>" + liv.getObsLivro() + "</td>");
                        out.print("<td>" + liv.getAvaria() + "</td>");
                        out.print("<td>" + liv.getEmprestado() + "</td>");
                        out.print("<td>" + liv.getMatriculaFunc() + "</td>");

                        // Controle para manutenção:
                        // out.print("<td id='cmd'><a href='../../../alterarLivro.jsp?codLivro=" + liv.getCodLivro() + "'><img src='../../../img/alterar.png' /></a></td>");
                        // out.print("<td id='cmd'><a href='desativarLivro.jsp?codLivro=" + liv.getCodLivro() + "'><img src='../../../img/excluir.png' /></a></td>");
                        //out.print("</tr>");
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