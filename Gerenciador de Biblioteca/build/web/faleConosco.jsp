<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
    
        <!-- As 3 meta tags acima *devem* vir em primeiro lugar dentro do `head`; qualquer outro conteúdo deve vir *após* essas tags -->
        <title>Fale Conosco</title>

        <!-- Bootstrap -->
        <link href="css/bootstrap.min.css" rel="stylesheet">

        <!-- HTML5 shim e Respond.js para suporte no IE8 de elementos HTML5 e media queries -->
        <!-- ALERTA: Respond.js não funciona se você visualizar uma página file:// -->
        <!--[if lt IE 9]>
          <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
          <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
        <![endif]-->

        <!--CSS do index.jsp -->
        <link href="css/faleConosco.css" rel="stylesheet">


    </head>
    <body>
        <!-- Cabeçalho da pagina com o menu, logo e nome -->
        <header id="cabecaFaleConosco">          
            <!-- menu -->
            <nav class="navbar navbar-inverse navbar-fixed-top">
          <div class="container-fluid">
            <div class="navbar-header">
              <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
              </button>
              <a class="navbar-brand" href="#" style="cursor:default">Biblioteca</a>
            </div>
            <div id="navbar" class="navbar-collapse collapse">
              <ul class="nav navbar-nav navbar-left">
                <li><a href="#">Inicio</a></li>
                <li><a href="livros.jsp">Livros</a></li>
                <li><a href="perfil.jsp">Perfil</a></li>
                <li><a href="faleConosco.jsp">Fale conosco</a></li>
                <li><a href="teste/testaConexão.jsp">Testa Conexão</a></li>
              </ul>

              <ul class="nav navbar-nav navbar-right">
                  
                <%
                    if (session.getAttribute("permissao") == null) {
                %>
                  
                  <li><a href="login.jsp">Login</a></li>
                  <li><a href="cadastroClie.jsp">Cadastre-se</a></li>
                  
                <%
                    }
                    if (session.getAttribute("permissao") == "1") {
                %>  
                    <li><a href="#" style="cursor:default">Seja bem vindo, <%out.print(session.getAttribute("nome"));%></a></li>
                    
                    <li><a href="LogoutServlet"> logout</a></li>
                    
                <%
                    }
                    else    
                    if (session.getAttribute("permissao") == "2" || session.getAttribute("permissao") == "3") {
                %>  
                    <li><a href="#" style="cursor:default">Olá, funcionario <%out.print(session.getAttribute("nome"));%></a></li>
                    
                    <li><a href="LogoutServlet"> logout</a></li>
                    
                <%
                    }
                %> 
                  
              </ul>  
            </div>
          </div>
        </nav>
            <!-- Logo e Titulo -->
            <div class="row" id="faleConosco">


                <div class="col-xs-5 col-md-4">
                    <img src="img/logo.png" alt="Biblioteca" id="logo" class="img-responsive">
                </div>

                <hgroup class="col-xs-6 col-xs-offset-1 col-md-7 col-md-offset-1">
                    <h1>Fale Conosco</h1>
                </hgroup>

            </div>

        </header>

        <!-- Conteudo da Pagina -->

        <article id="faleConosco"  class="row">         
            <div class="col-xs-9 col-xs-offset-3 col-md8 col-md-offset-2">
                <form class="form-horizontal">
                    
                    <div class="form-group">
                        <label for="txtNome" class="col-xs-6 col-md-3 control-label">Nome: </label>
                        <div class="col-xs-8 col-md-6">
                            <input type="text" class="form-control" id="txtNome">
                        </div>
                    </div>
                                
                    
                    <div class="form-group">
                        <label for="txtEmail" class="col-xs-6 col-md-3 control-label">Email: </label>
                        <div class="col-xs-8 col-md-6">
                            <input type="email" class="form-control" id="txtEmail">
                        </div>
                    </div>
                      
                    <div class="form-group">
                        <label for="txtTelefone" class="col-xs-6 col-md-3 control-label">Telefone: </label>
                        <div class="col-xs-8 col-md-6">
                            <input type="tel" class="form-control" id="txtTelefone">
                        </div>
                    </div>    
                    
                    <div class="form-group">
                        <label for="txtWebsite" class="col-xs-6 col-md-3 control-label">Website: </label>
                        <div class="col-xs-8 col-md-6">
                            <input type="website" class="form-control" id="txtWebsite">
                        </div>
                    </div>
                    
                    <div class="form-group">
                        <label for="txtMensagem" class="col-xs-6 col-md-3 control-label">Mensagem: </label>
                        <div class="col-xs-8 col-md-6">
                            <textarea type="Mensagem" class="form-control" id="txtMensagem"></textarea>
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

        <!-- jQuery (obrigatório para plugins JavaScript do Bootstrap) -->
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
        <!-- Inclui todos os plugins compilados (abaixo), ou inclua arquivos separadados se necessário -->
        <script src="js/bootstrap.min.js"></script>
    </body>
</html>
