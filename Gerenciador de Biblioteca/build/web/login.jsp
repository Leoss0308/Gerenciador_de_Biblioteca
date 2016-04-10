<!DOCTYPE html>
<html lang="pt-br">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    
    <!-- As 3 meta tags acima *devem* vir em primeiro lugar dentro do `head`; qualquer outro conteúdo deve vir *após* essas tags -->
    <title>Home</title>

    <!-- Bootstrap -->
    <link href="css/bootstrap.min.css" rel="stylesheet">

    <!-- HTML5 shim e Respond.js para suporte no IE8 de elementos HTML5 e media queries -->
    <!-- ALERTA: Respond.js não funciona se você visualizar uma página file:// -->
    <!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
    
    <!--CSS do index.jsp -->
    <link href="css/index.css" rel="stylesheet">
    
    
  </head>
  <body>
    <!-- Cabeçalho da pagina com o menu, logo e nome -->
    <header id="cabecahome">          
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
              <a class="navbar-brand" href="#">Biblioteca</a>
            </div>
            <div id="navbar" class="navbar-collapse collapse">
              <ul class="nav navbar-nav navbar-left">
                <li><a href="#">Inicio</a></li>
                <li><a href="#">Livros</a></li>
                <li><a href="#">Perfil</a></li>
                <li><a href="#">Fale conosco</a></li>
              </ul>

              <ul class="nav navbar-nav navbar-right">
                  <li><a href="login.jsp">Login</a></li>
                <li><a href="#">Cadastre-se</a></li>
              </ul>  
            </div>
          </div>
        </nav>
        <!-- logo e titulo -->
        <div class="row" id="tituloIndex">


            <div class="col-xs-5 col-md-4">
                <img src="img/logo.png" alt="Biblioteca" id="logo" class="img-responsive">
            </div>

            <hgroup class="col-xs-6 col-xs-offset-1 col-md-7 col-md-offset-1">
                <h1>Login</h1>
            </hgroup>

        </div>

    </header>
        <!-- Artigo com ele tem o conteudo da pagina -->
    <article id="pesquisaIndex"  class="row">
          
        <div class="col-xs-9 col-xs-offset-3 col-md8 col-md-offset-2">

            <form class="form-horizontal">

                <div class="form-group">
                  <label  class="col-xs-6 col-md-3 control-label">Usuário:</label>
                  <div class="col-xs-2 col-md-3">
                      <input type="text" name="login" class="form-control" placeholder="Digite seu nome de Usuário">
                  </div>
                </div>

                <div class="form-group">
                    <label  class="col-xs-6 col-md-3 control-label">Senha:</label>
                  <div class="col-xs-2 col-md-3">
                       <input type="password" name="senha" class="form-control" placeholder="Digite sua senha">
                  </div>
                </div>

                <div class="form-group">
                  <div class="col-xs- col-md-4 col-md-offset-2">
                      
                      <button type="submit" class="btn btn-default btn-lg btn-block" id="btnEntrar" >Entrar</button>
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