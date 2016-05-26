<%-- 
    Document   : cadastrarAvarias
    Created on : 24/05/2016, 20:53:34
    Author     : Amanda
--%>

<!DOCTYPE html>
<html lang="pt-br">
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">

        <!-- As 3 meta tags acima *devem* vir em primeiro lugar dentro do `head`; qualquer outro conteúdo deve vir *após* essas tags -->
        <title>Cadastro de Avarias</title>

        <!-- Bootstrap -->
        <link href="css/bootstrap.min.css" rel="stylesheet">

        <!-- HTML5 shim e Respond.js para suporte no IE8 de elementos HTML5 e media queries -->
        <!-- ALERTA: Respond.js não funciona se você visualizar uma página file:// -->
        <!--[if lt IE 9]>
          <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
          <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
        <![endif]-->

        <!--CSS do cadastroClie.jsp -->
        <link href="css/cadastroClie.css" rel="stylesheet">
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

    </head>
    <body>
        <!-- Cabeçalho da pagina com o menu, logo e nome -->
        <header id="cabecahome">          
            <!-- menu -->

            <!-- Menu -->


            <!-- Logo e Titulo -->
            <div class="row">

                <hgroup class="col-xs-6 col-xs-offset-6 col-md-6 col-md-offset-4">
                    <h1>Cadastro de Avarias</h1> 
                    <h1></h1>
                </hgroup>

            </div>

        </header>

        <!-- Conteudo da Pagina -->

        <article id="Cadastro"  class="row">         
            <div class="col-xs-9 col-xs-offset-1 col-md-9 col-md-offset-1">
                <form class="form-horizontal"  action="BaixaServlet" method="post">

                    <div class="form-group">
                        <label for="txtMotivoBaixa" class="col-xs-4 col-md-4 control-label">Motivo da Avaria: </label>
                        <div class="col-xs-6 col-md-6">
                            <input type="text" class="form-control" id="txtMotivoBaixa" maxlength="250" name="txtMotivoBaixa" required="">
                        </div>
                    </div>

                    <div class="form-group">
                        <label for="txtObsBaixa" class="col-xs-4 col-md-4 control-label">Observações: </label>
                        <div class="col-xs-6 col-md-6">
                            <input type="text" class="form-control" id="txtObsBaixa" maxlength="250" name="txtObsBaixa" required="">
                        </div>
                    </div>

                    <input type="hidden" value="<%out.print(session.getAttribute("cod"));%>" maxlength="11" name="txtMatriculaFunc">
                    
                    <input type="hidden" value="<%out.print(request.getParameter("CodLivro"));%>" maxlength="11" name="txtCodLivro">
                    
                    <div class="form-group">
                        <div class="col-xs-6 col-xs-offset-4 col-md-6 col-md-offset-4">
                            <input type="submit" value="Enviar" name="btnEnviar" id="btnEnviarCC" class="btn btn-success btn-lg" />
                            <input type="reset" value="Limpar" name="btnLimpar" id="btnLimparCC" class="btn btn-danger btn-lg" />
                        </div>
                    </div>


                </form>
            </div>

        </article>
        <!-- aonde deveria ficar o rodapé se tivesse um --> 
        <footer class="footer">

        </footer>

       
        

        <!-- jQuery (obrigatório para plugins JavaScript do Bootstrap) -->
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
        <!-- Inclui todos os plugins compilados (abaixo), ou inclua arquivos separadados se necessário -->
        <script src="js/bootstrap.min.js"></script>
    </body>
</html>

