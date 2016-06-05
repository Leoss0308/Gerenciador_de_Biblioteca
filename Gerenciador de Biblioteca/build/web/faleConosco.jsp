<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
    
        <!-- As 3 meta tags acima *devem* vir em primeiro lugar dentro do `head`; qualquer outro conteúdo deve vir *após* essas tags -->
        <title>Fale Conosco</title>
        <link rel="icon" type="image/png" href="img/iconLivro.png">
        
        <!-- Bootstrap -->
        <link href="css/bootstrap.min.css" rel="stylesheet">

        <!-- HTML5 shim e Respond.js para suporte no IE8 de elementos HTML5 e media queries -->
        <!-- ALERTA: Respond.js não funciona se você visualizar uma página file:// -->
        <!--[if lt IE 9]>
          <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
          <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
        <![endif]-->

        <!--CSS do faleConosco.jsp -->
        <link href="css/faleConosco.css" rel="stylesheet">
        <!-- jquery para a mascara -->
        <script src = "js/jquery-1.12.3.min.js"  type = "text/javascript" ></script>
        <script src = "js/jquery-2.1.3.js"  type = "text/javascript" ></script>
        <script src = "js/jquery.maskedinput.js"  type = "text/javascript" ></script>
          

    </head>
    <body>
        <!-- Cabeçalho da pagina com o menu, logo e nome -->
        <header id="cabecaFaleConosco">          
            
            <!-- Menu -->
            <%@include file="menu.jsp" %>
            
            
            <!-- Logo e Titulo -->
            <div class="row" id="faleConosco">


                <div class="col-xs-5 col-md-4">
                    <img src="img/faleConosco.png" alt="Biblioteca" id="logo" class="img-responsive">
                </div>

                <hgroup class="col-xs-6 col-xs-offset-1 col-md-7 col-md-offset-1">
                    <h1>Fale Conosco</h1>
                </hgroup>

            </div>

        </header>

        <!-- Conteudo da Pagina -->

        <article id="faleConosco"  class="row">         
            <div class="col-xs-9 col-xs-offset-3 col-md8 col-md-offset-2">
                <form class="form-horizontal" action="FaleConoscoServlet" method="post">
                    
                    <div class="form-group">
                        <label for="txtNome" class="col-xs-6 col-md-3 control-label">Nome: </label>
                        <div class="col-xs-8 col-md-6">
                            <input type="text" class="form-control" id="txtNome" name="txtNome" maxlength="40" required="">
                        </div>
                    </div>
                                
                    
                    <div class="form-group">
                        <label for="txtEmail" class="col-xs-6 col-md-3 control-label">Email: </label>
                        <div class="col-xs-8 col-md-6">
                            <input type="email" class="form-control" id="txtEmail" name="txtEmail" maxlength="40" required="">
                        </div>
                    </div>
                      
                    <div class="form-group">
                        <label for="txtTelefone" class="col-xs-6 col-md-3 control-label">Telefone: </label>
                        <div class="col-xs-8 col-md-6">
                            <input type="text" class="form-control" id="txtTelefone" name="txtTelefone" required="">
                        </div>
                    </div>    
                    
                    <div class="form-group">
                        <label for="txtAssunto" class="col-xs-6 col-md-3 control-label">Assunto: </label>
                        <div class="col-xs-8 col-md-6">
                            <input type="text" class="form-control" id="txtAssunto" name="txtAssunto" maxlength="40">
                        </div>
                    </div>
                    
                    <div class="form-group">
                        <label for="txtMensagem" class="col-xs-6 col-md-3 control-label">Mensagem: </label>
                        <div class="col-xs-8 col-md-6">
                            <textarea type="text" class="form-control" id="txtMensagem" name="txtMensagem" required="" maxlength="400"></textarea>
                        </div>
                    </div>
                    
                    <div class="form-group">
                        <div class="col-xs-8 col-md-6 col-md-offset-3">
                            <input type="submit" value="Enviar Mensagem" name="btnEnviar" class="btn btn-default btn-lg btn-block"/>
                        </div>
                    </div>
                            
                      
                </form>
            </div>       
        </article>
        <!-- aonde deveria ficar o rodapé se tivesse um --> 
        <footer class="footer">

        </footer>
        <!-- Script para fazer as mascaras dos campos --> 
        <script>
            jQuery(function($){
                $("#txtTelefone").mask("(99)9999-9999");
            });
        </script>

        <!-- jQuery (obrigatório para plugins JavaScript do Bootstrap) -->
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
        <!-- Inclui todos os plugins compilados (abaixo), ou inclua arquivos separadados se necessário -->
        <script src="js/bootstrap.min.js"></script>
    </body>
</html>
