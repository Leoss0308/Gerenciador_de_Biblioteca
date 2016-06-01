<%-- 
    Document   : visualizaAvarias
    Created on : 24/05/2016, 20:29:21
    Author     : Amanda
--%>

<!DOCTYPE html>
<html lang="pt-br">
    <%@page import="br.com.Modelagem.Baixa, br.com.DAO.BaixaDAO,  java.util.List" %>
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <!-- As 3 meta tags acima *devem* vir em primeiro lugar dentro do `head`; qualquer outro conteúdo deve vir *após* essas tags -->
        <title>Tabela de Avarias </title>

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
            
            th{
                white-space: nowrap;
            }
        </style>

    </head>
    <body>
    <body>
       <div class="row">
            
                <form class="form-horizontal"  action="visualizaAvarias.jsp" method="get">

                    <div class="form-inline">
                        <label for="slcTipoPesquisa" class="col-xs-2 control-label">Pesquisar pelo: </label>
                        <div class="col-xs-2 ">
                            <select class="form-control" id="slcTipoPesquisa" name="slcTipoPesquisa" style="width: 100%">
                                <option value="Cod_Livro">Código do Livro</option>
                                <option value="Cod_Matricula">Funcionário responsável</option>
                            </select>
                        </div>
                    </div>

                    <div class="form-inline">
                        <div class="col-xs-3">
                            <input type="number" class="form-control" id="txtpesquisa" name="txtpesquisa"  min="0" style="width: 100%">
                        </div>
                    </div>

                    <div class="form-inline">
                        <div class="col-xs-1 ">
                            <input type="submit" value="Pesquisar" name="btnPesquisar" class="btn btn-default btn-sm" style="margin-top: 2px"/>
                        </div>
                    </div>

                </form>
            
        </div>
        <div class="row">
        </div>
        <%
            BaixaDAO bxdao = new BaixaDAO();
            List<Baixa>  baixa = bxdao.getLista();
            String palavra = request.getParameter("txtpesquisa");
            if (palavra == null) {
                baixa = bxdao.getLista();
            } else {
                String tipo = request.getParameter("slcTipoPesquisa");
                baixa = bxdao.getListaLike(palavra, tipo);
            }
        %>
        
        <div class="table-responsive">  
            <table class="table table-bordered">
                <!-- <tr><th colspan="18">Livro</tr> -->
                <tr>
                    <th>Código da Avaria</th><th>Motivo da Avaria</th><th>Observações</th><th>Funcionário Responsável</th><th>Código do Empréstimo</th><th>Código do Livro</th><th></th><th></th>
                </tr>
                <%
                    String sDestaque = "onMouseOver=\"this.style.backgroundColor='#ECECFF'; this.style.cursor='hand';\"";
                    sDestaque += "onMouseOut=\"this.style.backgroundColor='';\"";

                    int cor = 0;
                    for (Baixa bx : baixa) {
                        String sCor = "cor" + (cor % 2);
                        cor++;

                        // Fazer da linha da tabela, um link para exibição:
                        out.print("");

                        out.print("<tr id='" + sCor + "' " + sDestaque + ">");

                        out.print("<td>" + bx.getCodBaixa()+ "</td>");
                        out.print("<td>" + bx.getMotivoBaixa()+ "</td>");
                        out.print("<td>" + bx.getObsBaixa()+ "</td>");
                        out.print("<td>" + bx.getMatriculaFunc() + "</td>");
                        out.print("<td>" + bx.getCodEmprestimo() + "</td>");
                        out.print("<td>" + bx.getCodLivro() + "</td>");
                       
                     
                        // Controle para manutenção:
                        //Coloquei um title na tag img pro usuario ao passar em cima do ícone alterar ou excluir saber do que se trata, não só pela dedução da imagem.
                        out.print("<td id='cmd'><a href='../../../alterarAvarias.jsp?CodBaixa=" + bx.getCodBaixa()+ "&CodLivro=" + bx.getCodLivro() + "'><img src='../../../img/alterar.png' title='Alterar'/></a></td>");
                        out.print("<td id='cmd'><a href='desativarAvarias.jsp?CodBaixa=" + bx.getCodBaixa()+ "&CodLivro=" + bx.getCodLivro() + "'><img src='../../../img/retornar.png' title='Restaurar Livro'/></a></td>");

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
