<!DOCTYPE html>
<html lang="pt-br">
    <%@page import="br.com.Modelagem.FaleConosco, br.com.DAO.FaleConoscoDAO" %>
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- As 3 meta tags acima *devem* vir em primeiro lugar dentro do `head`; qualquer outro conteúdo deve vir *após* essas tags -->
    <title>Visualizar Mensagem</title>

    <!-- Bootstrap -->
    <link href="../../../css/bootstrap.min.css" rel="stylesheet">
      
    <!-- HTML5 shim e Respond.js para suporte no IE8 de elementos HTML5 e media queries -->
    <!-- ALERTA: Respond.js não funciona se você visualizar uma página file:// -->
    <!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
    
        
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
            background: url(../../img/fundoTabela.jpg) no-repeat center top fixed;
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
            FaleConosco fc = new FaleConosco();
            int codfc = 0;
            codfc = Integer.parseInt(request.getParameter("codfc"));
            fc = new FaleConoscoDAO().getmsg(codfc);  // Obtem o item do BD que foi solicitado via parâmetro.            
            
        %>
        
        <article id="Alteracao"  class="row">         
            <div class="col-xs-9 col-xs-offset-1 col-md-9 col-md-offset-1">
                <form class="form-horizontal"  action="" method="post">
                    
                    <div class="form-group">
                        <label class="col-xs-4 col-md-4 control-label">Codigo: </label>
                        <div class="col-xs-8 col-md-8">
                            <label class="control-label"><%=fc.getCod_FaleConosco()%></label>
                        </div>
                    </div>
                        
                        <hr>
                        
                    <div class="form-group">
                        <label class="col-xs-4 col-md-4 control-label">Nome: </label>
                        <div class="col-xs-8 col-md-8">
                            <label class="control-label"><%=fc.getNome()%></label>
                        </div>
                    </div>
                        
                        <hr>
                                                            
                    <div class="form-group">
                        <label class="col-xs-4 col-md-4 control-label">E-mail: </label>
                        <div class="col-xs-8 col-md-8">
                            <label class="control-label"><%=fc.getEmail()%></label>
                        </div>
                    </div>
                        
                        <hr>
                    
                    <div class="form-group">
                        <label class="col-xs-4 col-md-4 control-label">Telefone: </label>
                        <div class="col-xs-8 col-md-8">
                            <label class="control-label"><%=fc.getTelefone()%></label>
                        </div>
                    </div>
                        
                        <hr>
                    
                    <div class="form-group">
                        <label class="col-xs-4 col-md-4 control-label">Assunto: </label>
                        <div class="col-xs-8 col-md-8">
                            <label class="control-label"><%=fc.getAssunto()%></label>
                        </div>
                    </div>
                        
                        <hr>
                    
                    <div class="form-group">
                        <label class="col-xs-4 col-md-4 control-label">Mensagem: </label>
                        <div class="col-xs-8 col-md-8">
                            <label class="control-label"><%=fc.getMensagem()%></label>
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