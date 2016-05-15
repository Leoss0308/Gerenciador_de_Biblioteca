<%-- 
    Document   : cadastroLivro
    Created on : 14/05/2016, 20:00:52
    Author     : Amanda
--%>

<!DOCTYPE html>
<html lang="pt-br">
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">

        <!-- As 3 meta tags acima *devem* vir em primeiro lugar dentro do `head`; qualquer outro conteúdo deve vir *após* essas tags -->
        <title>Cadastro de Livros</title>

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
            <%@include file="menu.jsp" %>

            <!-- Logo e Titulo -->
            <div class="row" id="cadastroLivro">


                <div class="col-xs-5 col-md-4">
                    <img src="img/logo.png" alt="Biblioteca" id="logo" class="img-responsive">
                </div>

                <hgroup class="col-xs-6 col-xs-offset-1 col-md-7 col-md-offset-1">
                    <h1>Cadastro de Livros</h1>
                </hgroup>

            </div>


        </header>

        <!-- Conteudo da Pagina -->

        <article id="Cadastro"  class="row">         
            <div class="col-xs-9 col-xs-offset-3 col-md8 col-md-offset-2">
                <form class="form-horizontal"  action="LivroServlet" method="post">

                    <div class="form-group">
                        <label for="txtISBN" class="col-xs-6 col-md-3 control-label">ISBN: </label>
                        <div class="col-xs-8 col-md-6">
                            <input type="text" class="form-control" id="txtISBN" name="txtISBN" required="">
                        </div>
                    </div>

                    <div class="form-group">
                        <label for="txtEdicao" class="col-xs-6 col-md-3 control-label">Edição: </label>
                        <div class="col-xs-8 col-md-6">
                            <input type="text" class="form-control" id="txtEdicao" name="txtEdicao" required="">
                        </div>
                    </div>

                    <div class="form-group">
                        <label for="txtTitulo" class="col-xs-6 col-md-3 control-label">Título: </label>
                        <div class="col-xs-8 col-md-6">
                            <input type="text" class="form-control" id="txtTitulo" name="txtTitulo" required="">
                        </div>
                    </div>

                    <div class="form-group">
                        <label for="txtAutor" class="col-xs-6 col-md-3 control-label">Autor: </label>
                        <div class="col-xs-8 col-md-6">
                            <input type="txt" class="form-control" id="txtAutor" name="txtAutor" required="">
                        </div>
                    </div>

                    <div class="form-group">
                        <label for="txtEditora" class="col-xs-6 col-md-3 control-label">Editora: </label>
                        <div class="col-xs-8 col-md-6">
                            <input type="text" class="form-control" id="txtEditora" name="txtEditora" required="">
                        </div>
                    </div>

                    <div class="form-group">
                        <label for="txtResumo" class="col-xs-6 col-md-3 control-label">Resumo: </label>
                        <div class="col-xs-8 col-md-6">
                            <input type="text" class="form-control" id="txtResumo" name="txtResumo" required="">
                        </div>
                    </div>

                    <div class="form-group">
                        <label for="txtPreco" class="col-xs-6 col-md-3 control-label">Preço: </label>
                        <div class="col-xs-8 col-md-6">
                            <input type="text" class="form-control" id="txtPreco" name="txtPreco" required="">
                        </div>
                    </div>        

                    <div class="form-group">
                        <label for="txtAnoPublicacao" class="col-xs-6 col-md-3 control-label">Ano de Publicação: </label>
                        <div class="col-xs-8 col-md-6">
                            <input type="text" class="form-control" id="txtAnoPublicacao" name="txtAnoPublicacao" required="">
                        </div>
                    </div> 

                    <div class="form-group">
                        <label for="txtQuantidade" class="col-xs-6 col-md-3 control-label">Quantidade de Exemplares: </label>
                        <div class="col-xs-8 col-md-6">
                            <input type="text" class="form-control" id="txtQuantidade" name="txtQuantidade">
                        </div>
                    </div> 

                    <div class="form-group">
                        <label for="txtCategoria" class="col-xs-6 col-md-3 control-label">Categoria: </label>
                        <div class="col-xs-8 col-md-6">
                            <input type="text" class="form-control" id="txtCategoria" name="txtCategoria">
                        </div>
                    </div> 


                    <div class="form-group">
                        <label for="txtTags" class="col-xs-6 col-md-3 control-label">Tags: </label>
                        <div class="col-xs-8 col-md-6">
                            <input type="text" class="form-control" id="txtTags" name="txtTags" required="">
                        </div>
                    </div>                     

                    <div class="form-group">
                        <label for="txtObs" class="col-xs-6 col-md-3 control-label">Observações: </label>
                        <div class="col-xs-8 col-md-6">
                            <input type="text" class="form-control" id="txtObs" name="txtObs" required="">
                        </div>
                    </div>



                    <div class="form-group">
                        <div class="col-xs-8 col-md-6 col-md-offset-3">
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

        <!-- Script para fazer as mascaras dos campos  -->
        <script>
            jQuery(function ($) {

                $("#txtAnoPublicacao").mask("9999");

            });
        </script> 

        <!-- jQuery (obrigatório para plugins JavaScript do Bootstrap) -->
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
        <!-- Inclui todos os plugins compilados (abaixo), ou inclua arquivos separadados se necessário -->
        <script src="js/bootstrap.min.js"></script>
    </body>
</html>
