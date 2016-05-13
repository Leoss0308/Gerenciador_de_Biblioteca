<!DOCTYPE html>
<html lang="pt-br">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    
    <!-- As 3 meta tags acima *devem* vir em primeiro lugar dentro do `head`; qualquer outro conteúdo deve vir *após* essas tags -->
    <title>Login</title>

    <!-- Bootstrap -->
    <link href="css/bootstrap.min.css" rel="stylesheet">

    <!-- HTML5 shim e Respond.js para suporte no IE8 de elementos HTML5 e media queries -->
    <!-- ALERTA: Respond.js não funciona se você visualizar uma página file:// -->
    <!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
    
    <!--CSS do index.jsp -->
    <link href="css/login.css" rel="stylesheet">
    
    
  </head>
  <body>
    <!-- Cabeçalho da pagina com o menu, logo e nome -->
    <header id="cabecalogin"> 
        
        <!-- Menu -->
        <%@include file="menu.jsp" %>
        
        <!-- logo e titulo -->
        <div class="row" id="tituloLogin">


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

            <form class="form-horizontal" action="LoginServlet" method="post">

                <div class="form-group">
                    <label for="idLogin"  class="col-xs-6 col-md-3 control-label">Usuário:</label>
                  <div class="col-xs-8 col-md-6">
                      <input type="text" id="idLogin" name="login" class="form-control" placeholder="Digite seu nome de Usuário">
                  </div>
                </div>

                <div class="form-group">
                    <label for="idSenha" class="col-xs-6 col-md-3 control-label">Senha:</label>
                  <div class="col-xs-8 col-md-6">
                      <input type="password" id="idSenha" name="senha" class="form-control" placeholder="Digite sua senha">
                  </div>
                </div>

                <div class="form-group">
                  <div class="col-xs-6 col-md-6 col-md-offset-3">
                      <input type="submit" value="Logar" name="btnLogar" class="btn btn-default btn-lg btn-block" />
                  </div>
                </div>

            </form>
            
            <% 
                if (request.getParameter("erro") != null) {
            %>
            <div class="col-xs-6 col-md-6 col-md-offset-3">
                <font color="red"> Login ou senha Inválida! - Tente novamente.</font>
            </div>
            <%        
                }
            %>

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