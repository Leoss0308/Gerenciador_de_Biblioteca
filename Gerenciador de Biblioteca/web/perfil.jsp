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
        
        <!-- Menu -->
        <%@include file="menu.jsp" %>
        
    </header>
        
    <article class="container-fluid aumenta">
        
        <div class="row aumenta" id="conteudoFrame">
            <div class="col-xs-3 col-md-2 sidebar">
                <ul class="nav nav-sidebar">
                    <li class="active"><a href="#">Cliente <span class="sr-only">(current)</span></a></li>
                    <li><a href="iframe/controleFuncionario/cliente/visualizaCliente.jsp" target="frmConteudo">Ver Cliente</a></li>
                    <li><a href="iframe/controleFuncionario/funcionario/visualizaFuncionario.jsp" target="frmConteudo">Ver Funcionario</a></li>
                    <li><a href="iframe/controleCliente/visualizaClienteClie.jsp" target="frmConteudo">Visualizar Cliente</a></li>
                    <!-- Criar arquivo visualizaFuncionarioFunc.jsp
                    <li><a href="iframe/controleFuncionario/funcionario/visualizaFuncionarioFunc.jsp" target="frmConteudo">Visualizar Funcionario</a></li>-->
                    <li><a href="cadastroFunc.jsp" target="frmConteudo">Cadastro funcionario</a></li>
                    <li><a href="cadastroLivro.jsp" target="frmConteudo">Cadastrar Livro</a></li>
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