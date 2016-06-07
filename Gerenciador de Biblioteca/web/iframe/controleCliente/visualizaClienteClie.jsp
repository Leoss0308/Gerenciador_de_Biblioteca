<!DOCTYPE html>
<html lang="pt-br">
    <%@page import="br.com.Modelagem.Cliente, br.com.DAO.ClienteDAO" %>
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- As 3 meta tags acima *devem* vir em primeiro lugar dentro do `head`; qualquer outro conteúdo deve vir *após* essas tags -->
    <title>Visualizar Cliente</title>

    <!-- Bootstrap -->
    <link href="../../css/bootstrap.min.css" rel="stylesheet">
      
    <!-- HTML5 shim e Respond.js para suporte no IE8 de elementos HTML5 e media queries -->
    <!-- ALERTA: Respond.js não funciona se você visualizar uma página file:// -->
    <!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
    
    <!-- jquery para a mascara -->
    <script src = "../../js/jquery-1.12.3.min.js"  type = "text/javascript" ></script>
    <script src = "../../js/jquery-2.1.3.js"  type = "text/javascript" ></script>
    <script src = "../../js/jquery.maskedinput.js"  type = "text/javascript" ></script>
            
        
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
            Cliente cli = new Cliente();
            int cod = 0;
            cod = Integer.parseInt(String.valueOf(session.getAttribute("cod")));
            cli = new ClienteDAO().getClie(cod);  // Obtem o item do BD que foi solicitado via parâmetro.            
            
        %>
        
        <article id="Alteracao"  class="row">         
            <div class="col-xs-9 col-xs-offset-1 col-md-9 col-md-offset-1">
                <form class="form-group"  action="" method="post">
                    
                    <div class="form-group">
                        <label for="txtCodigo" class="col-xs-6 col-md-6 control-label">Codigo: </label>
                        <div class="col-xs-6 col-md-6">
                            <label class="control-label"><%=cli.getCodClie()%></label>
                        </div>
                    </div>
                        
                        
                        
                    <div class="form-group">
                        <label for="txtNome" class="col-xs-6 col-md-6 control-label">Nome Completo: </label>
                        <div class="col-xs-6 col-md-6">
                            <label class="control-label"><%=cli.getNome()%></label>
                        </div>
                    </div>
                        
                                                            
                    <div class="form-group">
                        <label for="txtDataNasc" class="col-xs-6 col-md-6 control-label">Data De Nascimento: </label>
                        <div class="col-xs-6 col-md-6">
                            <label class="control-label"><%=cli.getDtNasc()%></label>
                        </div>
                    </div>
                        
                        
                    
                    <div class="form-group">
                        <label for="txtCPF" class="col-xs-6 col-md-6 control-label">CPF: </label>
                        <div class="col-xs-6 col-md-6">
                            <label class="control-label"><%=cli.getCpfClie()%></label>
                        </div>
                    </div>
                        
                        
                    
                    <div class="form-group">
                        <label for="txtEmail" class="col-xs-6 col-md-6 control-label">Email: </label>
                        <div class="col-xs-6 col-md-6">
                            <label class="control-label"><%=cli.getEmail()%></label>
                        </div>
                    </div>
                        
                        
                    
                    <div class="form-group">
                        <label for="txtTelefone" class="col-xs-6 col-md-6 control-label">Telefone: </label>
                        <div class="col-xs-6 col-md-6">
                            <label class="control-label"><%=cli.getTelefone()%></label>
                        </div>
                    </div>
                        
                        
                    
                    <div class="form-group">
                        <label for="txtCEP" class="col-xs-6 col-md-6 control-label">CEP: </label>
                        <div class="col-xs-6 col-md-6">
                            <label class="control-label"><%=cli.getCep()%></label>
                        </div>
                    </div>
                        
                       
                     
                    <div class="form-group">
                        <label for="txtEndereco" class="col-xs-6 col-md-6 control-label">Endereço: </label>
                        <div class="col-xs-6 col-md-6">
                            <label class="control-label"><%=cli.getEnd()%></label>
                        </div>
                    </div>        
                        
                        
                           
                    <div class="form-group">
                        <label for="txtBairro" class="col-xs-6 col-md-6 control-label">Bairro: </label>
                        <div class="col-xs-6 col-md-6">
                            <label class="control-label"><%=cli.getBairro()%></label>
                        </div>
                    </div> 
                        
                        
                    
                    <div class="form-group">
                        <label for="txtComplemento" class="col-xs-6 col-md-6 control-label">Complemento: </label>
                        <div class="col-xs-6 col-md-6">
                            <label class="control-label"><%=cli.getComplemento()%></label>
                        </div>
                    </div> 
                        
                        
                    
                    <div class="form-group">
                        <label for="txtEstado" class="col-xs-6 col-md-6 control-label">Estado: </label>
                        <div class="col-xs-6 col-md-6">
                            <label class="control-label"><%=cli.getEstado()%></label>
                        </div>
                    </div>
                        
                        
                    
                    <div class="form-group">
                        <label for="txtCidade" class="col-xs-6 col-md-6 control-label">Cidade: </label>
                        <div class="col-xs-6 col-md-6">
                            <label class="control-label"><%=cli.getCidade()%></label>
                        </div>
                    </div>                     
                        
                       
                    
                    <div class="form-group">
                        <label for="txtLogin" class="col-xs-6 col-md-6 control-label">Login: </label>
                        <div class="col-xs-6 col-md-6">
                            <label class="control-label"><%=cli.getLogin()%></label>
                        </div>
                    </div>
                        
                        
                           
                    <div class="form-group">
                        <label for="txtSenha" class="col-xs-6 col-md-6 control-label">Senha: </label>
                        <div class="col-xs-6 col-md-6">
                            <label class="control-label"><%=cli.getSenha()%></label>
                        </div>
                    </div>
                        
                       
                    
                    <%
                        if(cli.getStatusClie()==0){
                    %>   
                    <div class="form-group">
                        <label for="txtStatus" class="col-xs-6 col-md-6 control-label">Status: </label>
                        <div class="col-xs-6 col-md-6">
                            <label class="control-label">Regular</label>
                        </div>
                    </div>
                    <%
                        }if(cli.getStatusClie()==1){
                    %>
                    <div class="form-group">
                        <label for="txtStatus" class="col-xs-6 col-md-6 control-label">Status: </label>
                        <div class="col-xs-6 col-md-6">
                            <label class="control-label">Irregular</label>
                        </div>
                    </div>
                    <%
                        }
                    %>
                        
                       
                       
                    <div class="form-group">
                        <label for="txtObs" class="col-xs-6 col-md-6 control-label">Observação: </label>
                        <div class="col-xs-6 col-md-6">
                            <label class="control-label"><%=cli.getObsClie()%></label>
                        </div>
                    </div>
                       
                       
                    <div class="form-group">
                        <div class="col-xs-8 col-md-6 col-md-offset-3">
                            <a href="../../alterarAutoCliente.jsp?codClie=+<%=cod%>" class="btn btn-success btn-lg btn-block">Alterar</a>
                            
                        </div>
                    </div>
                            
                      
                </form>
            </div>
            
        </article>
      
      
      

    
    <!-- Script para fazer as mascaras dos campos --> 
    <script>
        jQuery(function($){
            $("#txtTelefone").mask("(99)9999-9999");
            $("#txtCPF").mask("999.999.999-99");
            $("#txtCEP").mask("99999-999");
            //$("#txtDataNasc").mask("99/99/9999");
        });
    </script>
    <!-- jQuery (obrigatório para plugins JavaScript do Bootstrap) -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
    <!-- Inclui todos os plugins compilados (abaixo), ou inclua arquivos separadados se necessário -->
    <script src="js/bootstrap.min.js"></script>
  </body>
</html>