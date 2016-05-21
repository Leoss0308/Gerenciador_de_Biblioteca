<!DOCTYPE html>
<html lang="pt-br">
    <%@page import="br.com.Modelagem.Funcionario, br.com.DAO.FuncionarioDAO" %>
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- As 3 meta tags acima *devem* vir em primeiro lugar dentro do `head`; qualquer outro conteúdo deve vir *após* essas tags -->
    <title>Visualizar Funcionario</title>

    <!-- Bootstrap -->
    <link href="../../../css/bootstrap.min.css" rel="stylesheet">
      
    <!-- HTML5 shim e Respond.js para suporte no IE8 de elementos HTML5 e media queries -->
    <!-- ALERTA: Respond.js não funciona se você visualizar uma página file:// -->
    <!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
    
    <!-- jquery para a mascara -->
    <script src = "../../../js/jquery-1.12.3.min.js"  type = "text/javascript" ></script>
    <script src = "../../../js/jquery-2.1.3.js"  type = "text/javascript" ></script>
    <script src = "../../../js/jquery.maskedinput.js"  type = "text/javascript" ></script>
            
        
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
            background: url(../../../img/fundoTabela.jpg) no-repeat center top fixed;
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
            Funcionario func = new Funcionario();
            int cod = 0;
            cod = Integer.parseInt(String.valueOf(session.getAttribute("cod")));
            func = new FuncionarioDAO().getFunc(cod);  // Obtem o item do BD que foi solicitado via parâmetro.            
            
        %>
        
        <article id="Alteracao"  class="row">         
            <div class="col-xs-9 col-xs-offset-1 col-md-9 col-md-offset-1">
                <form class="form-horizontal"  action="FuncionarioServletAlterar" method="post">
                    
                    <div class="form-group">
                        <label for="txtMatricula" class="col-xs-4 col-md-4 control-label">Matricula: </label>
                        <div class="col-xs-8 col-md-8">
                            <label class="control-label"><%=func.getMatriculaFunc()%></label>
                        </div>
                    </div>
                    
                        <hr>
                        
                    <div class="form-group">
                        <label for="txtNome" class="col-xs-4 col-md-4 control-label">Nome Completo: </label>
                        <div class="col-xs-8 col-md-8">
                            <label class="control-label"><%=func.getNome()%></label>
                        </div>
                    </div>
                    
                        <hr>
                                                         
                    <div class="form-group">
                        <label for="txtDataNasc" class="col-xs-4 col-md-4 control-label">Data De Nascimento: </label>
                        <div class="col-xs-8 col-md-8">
                            <label class="control-label"><%=func.getDtNasc()%></label>
                        </div>
                    </div>
                    
                        <hr>
                    
                    <div class="form-group">
                        <label for="txtEmail" class="col-xs-4 col-md-4 control-label">Email: </label>
                        <div class="col-xs-8 col-md-8">
                            <label class="control-label"><%=func.getEmail()%></label>
                        </div>
                    </div>
                    
                        <hr>
                    
                    <div class="form-group">
                        <label for="txtTelefone" class="col-xs-4 col-md-4 control-label">Telefone: </label>
                        <div class="col-xs-8 col-md-8">
                            <label class="control-label"><%=func.getTelefone()%></label>
                        </div>
                    </div>
                    
                        <hr>
                    
                    <div class="form-group">
                        <label for="txtCEP" class="col-xs-4 col-md-4 control-label">CEP: </label>
                        <div class="col-xs-8 col-md-8">
                            <label class="control-label"><%=func.getCep()%></label>
                        </div>
                    </div>
                     
                        <hr>
                    
                    <div class="form-group">
                        <label for="txtEndereco" class="col-xs-4 col-md-4 control-label">Endereço: </label>
                        <div class="col-xs-8 col-md-8">
                            <label class="control-label"><%=func.getEnd()%></label>
                        </div>
                    </div>        
                    
                        <hr>
                           
                    <div class="form-group">
                        <label for="txtBairro" class="col-xs-4 col-md-4 control-label">Bairro: </label>
                        <div class="col-xs-8 col-md-8">
                            <label class="control-label"><%=func.getBairro()%></label>
                        </div>
                    </div> 
                    
                        <hr>
                    
                    <div class="form-group">
                        <label for="txtComplemento" class="col-xs-4 col-md-4 control-label">Complemento: </label>
                        <div class="col-xs-8 col-md-8">
                            <label class="control-label"><%=func.getComplemento()%></label>
                        </div>
                    </div> 
                    
                        <hr>
                    
                    <div class="form-group">
                        <label for="txtEstado" class="col-xs-4 col-md-4 control-label">Estado: </label>
                        <div class="col-xs-8 col-md-8">
                            <label class="control-label"><%=func.getEstado()%></label>
                        </div>
                    </div>
                    
                        <hr>
                    
                    <div class="form-group">
                        <label for="txtCidade" class="col-xs-4 col-md-4 control-label">Cidade: </label>
                        <div class="col-xs-8 col-md-8">
                            <label class="control-label"><%=func.getCidade()%></label>
                        </div>
                    </div>                     
                    
                        <hr>
                    
                    <div class="form-group">
                        <label for="txtLogin" class="col-xs-4 col-md-4 control-label">Login: </label>
                        <div class="col-xs-8 col-md-8">
                            <label class="control-label"><%=func.getLogin()%></label>
                        </div>
                    </div>
                    
                        <hr>
                           
                    <div class="form-group">
                        <label for="txtSenha" class="col-xs-4 col-md-4 control-label">Senha: </label>
                        <div class="col-xs-8 col-md-8">
                            <label class="control-label"><%=func.getSenha()%></label>
                        </div>
                    </div> 
                    
                        <hr>
                    
                    <%
                        if(func.getTipoFunc()==2){
                    %>   
                    <div class="form-group">
                        <label for="txtTipo" class="col-xs-4 col-md-4 control-label">Tipo: </label>
                        <div class="col-xs-8 col-md-8">
                            <label class="control-label">Funcionario</label>
                        </div>
                    </div>
                    <%
                        }if(func.getTipoFunc()==3){
                    %>
                    <div class="form-group">
                        <label for="txtTipo" class="col-xs-4 col-md-4 control-label">Tipo: </label>
                        <div class="col-xs-8 col-md-8">
                            <label class="control-label">Administrador</label>
                        </div>
                    </div>
                    <%
                        }
                    %>

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
