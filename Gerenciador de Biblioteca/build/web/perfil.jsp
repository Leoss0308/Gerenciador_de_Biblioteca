<!DOCTYPE html>
<html lang="pt-br" class="aumenta">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    
    <!-- As 3 meta tags acima *devem* vir em primeiro lugar dentro do `head`; qualquer outro conteúdo deve vir *após* essas tags -->
    <title>Perfil</title>

    <!-- Bootstrap -->
    <link href="css/bootstrap.min.css" rel="stylesheet">

    <!-- HTML5 shim e Respond.js para suporte no IE8 de elementos HTML5 e media queries -->
    <!-- ALERTA: Respond.js não funciona se você visualizar uma página file:// -->
    <!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
    
    <!--CSS do index.jsp -->
    <link href="css/perfil.css" rel="stylesheet">
    
    
  </head>
  <body class="aumenta">
    <!-- Cabeçalho da pagina com o menu, logo e nome -->
    <header id="cabecaperfil">          
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
    </header>
        
    <article class="container-fluid aumenta">
        
        <div class="row aumenta" id="conteudoFrame">
            <div class="col-xs-3 col-md-2 sidebar">
              <ul class="nav nav-sidebar">
                <li class="active"><a href="#">Cliente <span class="sr-only">(current)</span></a></li>
                <li><a href="iframe/controleFuncionario/cliente/visualizaCliente.jsp" target="frmConteudo">Ver Cliente</a></li>
                                    
              </ul>
            </div>
         
        
            <div class="col-xs-9 col-xs-offset-3 col-md-10 col-md-offset-2 main aumenta">
                
                <iframe class="embed-responsive-item" id="frmConteudo" name="frmConteudo" src="iframe/default.jsp"></iframe>
                
            </div>
            
        </div>
           
    </article>
    

    

    <!-- jQuery (obrigatório para plugins JavaScript do Bootstrap) -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
    <!-- Inclui todos os plugins compilados (abaixo), ou inclua arquivos separadados se necessário -->
    <script src="js/bootstrap.min.js"></script>
  </body>
</html>