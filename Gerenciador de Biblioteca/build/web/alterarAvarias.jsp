<%-- 
    Document   : alterarAvarias
    Created on : 24/05/2016, 20:54:12
    Author     : Amanda
--%>

<!DOCTYPE html>
<html lang="pt-br">
    <%@page import="br.com.Modelagem.Baixa, br.com.DAO.BaixaDAO" %>
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <!-- As 3 meta tags acima *devem* vir em primeiro lugar dentro do `head`; qualquer outro conteúdo deve vir *após* essas tags -->
        <title>Alterar Avarias</title>

        <!-- Bootstrap -->
        <link href="css/bootstrap.min.css" rel="stylesheet">

        <!-- HTML5 shim e Respond.js para suporte no IE8 de elementos HTML5 e media queries -->
        <!-- ALERTA: Respond.js não funciona se você visualizar uma página file:// -->
        <!--[if lt IE 9]>
          <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
          <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
        <![endif]-->

        <!-- jquery para a mascara -->
        <script src = "js/jquery-1.12.3.min.js"  type = "text/javascript" ></script>
        <script src = "js/jquery-2.1.3.js"  type = "text/javascript" ></script>
        <script src = "js/jquery.maskedinput.js"  type = "text/javascript" ></script>


        <!-- Para funcionar no mozila -->
        <!-- cdn for modernizr, if you haven't included it already -->
        <script src="http://cdn.jsdelivr.net/webshim/1.12.4/extras/modernizr-custom.js"></script>
        <!-- polyfiller file to detect and load polyfills -->
        <script src="http://cdn.jsdelivr.net/webshim/1.12.4/polyfiller.js"></script>
        <script>
            webshims.setOptions('waitReady', false);
            webshims.setOptions('forms-ext', {types: 'date'});
            webshims.polyfill('forms forms-ext');
        </script>


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
            Baixa bx = new Baixa();
            int cod = 0;
            cod = Integer.parseInt(request.getParameter("CodBaixa"));
            bx = new BaixaDAO().getBaixa(cod);  // Obtem o item do BD que foi solicitado via parâmetro.            
            
        %>

        <article id="Alteracao"  class="row">         
            <div class="col-xs-9 col-xs-offset-1 col-md-9 col-md-offset-1">
                <form class="form-horizontal"  action="BaixaServletAlterar" method="post">

                    <div class="form-group">
                        <label for="txtCodBaixa" class="col-xs-4 col-md-4 control-label">Código da Avaria: </label>
                        <div class="col-xs-6 col-md-6">
                            <input type="text" class="form-control" id="txtCodBaixa" name="txtCodBaixa" required="" readonly="" value="<%=bx.getCodBaixa()%>">
                        </div>
                    </div>


                    <div class="form-group">
                        <label for="txtMotivoBaixa" class="col-xs-4 col-md-4 control-label">Motivo da Avaria: </label>
                        <div class="col-xs-6 col-md-6">
                            <input type="text" class="form-control" id="txtMotivoBaixa" maxlength="250" name="txtMotivoBaixa" required="" value="<%=bx.getMotivoBaixa()%>">
                        </div>
                    </div>


                    <div class="form-group">
                        <label for="txtObsBaixa" class="col-xs-4 col-md-4 control-label">Observações: </label>
                        <div class="col-xs-6 col-md-6">
                            <input type="text" class="form-control" id="txtObsBaixa" maxlength="250" name="txtObsBaixa" required="" value="<%=bx.getObsBaixa()%>">
                        </div>
                    </div>

                    <div class="form-group">
                        <label for="txtMatriculaFunc" class="col-xs-4 col-md-4 control-label">Funcionário responsável: </label>
                        <div class="col-xs-6 col-md-6">
                            <input type="text" class="form-control" maxlength="11"  id="txtMatriculaFunc" name="txtMatriculaFunc" required="" readonly="" value="<%=bx.getMatriculaFunc()%>">

                        </div>
                    </div>

                    <div class="form-group">
                        <label for="txtCodEmprestimo" class="col-xs-4 col-md-4 control-label">Código do Empréstimo: </label>
                        <div class="col-xs-6 col-md-6">
                            <input type="text" class="form-control" maxlength="11"  id="txtCodEmprestimo" name="txtCodEmprestimo" required="" readonly="" value="<%=bx.getCodEmprestimo()%>">

                        </div>
                    </div>
                    <div class="form-group">
                        <label for="txtCodLivro" class="col-xs-4 col-md-4 control-label">Código do Livro: </label>
                        <div class="col-xs-6 col-md-6">
                            <input type="text" class="form-control" maxlength="11"  id="txtCodLivro" name="txtCodLivro" required="" readonly="" value="<%=bx.getCodLivro()%>">

                        </div>
                    </div>

                    <div class="form-group">
                        <div class="col-xs-6 col-xs-offset-4 col-md-6 col-md-offset-4">
                            <input type="submit" value="Alterar" name="btnAlterar" id="btnEnviarAC" class="btn btn-success btn-lg btn-block"/>
                        </div>
                    </div>


                </form>
            </div>

        </article>


        <!-- jQuery (obrigatório para plugins JavaScript do Bootstrap) -->
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
        <!-- Inclui todos os plugins compilados (abaixo), ou inclua arquivos separadados se necessário -->
        <script src="js/bootstrap.min.js"></script>
    </body>
</html>