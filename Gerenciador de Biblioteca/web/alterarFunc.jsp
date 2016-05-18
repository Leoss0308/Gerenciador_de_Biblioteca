<!DOCTYPE html>
<html lang="pt-br">
    <%@page import="br.com.Modelagem.Funcionario, br.com.DAO.FuncionarioDAO" %>
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- As 3 meta tags acima *devem* vir em primeiro lugar dentro do `head`; qualquer outro conteúdo deve vir *após* essas tags -->
    <title>Alterar Funcionario</title>

    <!-- Bootstrap -->
    <link href="css/bootstrap.min.css" rel="stylesheet">
      
    <!-- HTML5 shim e Respond.js para suporte no IE8 de elementos HTML5 e media queries -->
    <!-- ALERTA: Respond.js não funciona se você visualizar uma página file:// -->
    <!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
    
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

    
    <style>
        body{
            background: url(../img/fundo.jpg) no-repeat center top fixed;
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
            cod = Integer.parseInt(request.getParameter("MatriculaFunc"));
            func = new FuncionarioDAO().getFunc(cod);  // Obtem o item do BD que foi solicitado via parâmetro.            
            
        %>
        
        <article id="Alteracao"  class="row">         
            <div class="col-xs-9 col-xs-offset-3 col-md8 col-md-offset-2">
                <form class="form-horizontal"  action="FuncionarioServletAlterar" method="post">
                    
                    <div class="form-group">
                        <label for="txtMatricula" class="col-xs-6 col-md-3 control-label">Matricula: </label>
                        <div class="col-xs-8 col-md-6">
                            <input type="text" class="form-control" id="txtMatricula" name="txtMatricula" required="" readonly="" value="<%=func.getMatriculaFunc()%>">
                        </div>
                    </div>
                    
                    <div class="form-group">
                        <label for="txtNome" class="col-xs-6 col-md-3 control-label">Nome Completo: </label>
                        <div class="col-xs-8 col-md-6">
                            <input type="text" class="form-control" id="txtNome" name="txtNome" required="" value="<%=func.getNome()%>">
                        </div>
                    </div>
                                                          
                    <div class="form-group">
                        <label for="txtDataNasc" class="col-xs-6 col-md-3 control-label">Data De Nascimento: </label>
                        <div class="col-xs-8 col-md-6">
                            <input type="date" class="form-control" id="txtDataNasc" name="txtDataNasc" required="" value="<%=func.getDtNasc()%>">
                        </div>
                    </div>
                    
                    <div class="form-group">
                        <label for="txtEmail" class="col-xs-6 col-md-3 control-label">Email: </label>
                        <div class="col-xs-8 col-md-6">
                            <input type="email" class="form-control" id="txtEmail" name="txtEmail" required="" value="<%=func.getEmail()%>">
                        </div>
                    </div>
                    
                    <div class="form-group">
                        <label for="txtTelefone" class="col-xs-6 col-md-3 control-label">Telefone: </label>
                        <div class="col-xs-8 col-md-6">
                            <input type="tel" class="form-control" id="txtTelefone" name="txtTelefone" required="" value="<%=func.getTelefone()%>">
                        </div>
                    </div>
                    
                    <div class="form-group">
                        <label for="txtCEP" class="col-xs-6 col-md-3 control-label">CEP: </label>
                        <div class="col-xs-8 col-md-6">
                            <input type="text" class="form-control" id="txtCEP" name="txtCEP" required="" value="<%=func.getCep()%>">
                        </div>
                    </div>
                     
                    <div class="form-group">
                        <label for="txtEndereco" class="col-xs-6 col-md-3 control-label">Endereço: </label>
                        <div class="col-xs-8 col-md-6">
                            <input type="text" class="form-control" id="txtEndereco" name="txtEndereco" required="" value="<%=func.getEnd()%>">
                        </div>
                    </div>        
                           
                    <div class="form-group">
                        <label for="txtBairro" class="col-xs-6 col-md-3 control-label">Bairro: </label>
                        <div class="col-xs-8 col-md-6">
                            <input type="text" class="form-control" id="txtBairro" name="txtBairro" required="" value="<%=func.getBairro()%>">
                        </div>
                    </div> 
                    
                    <div class="form-group">
                        <label for="txtComplemento" class="col-xs-6 col-md-3 control-label">Complemento: </label>
                        <div class="col-xs-8 col-md-6">
                            <input type="text" class="form-control" id="txtComplemento" name="txtComplemento" value="<%=func.getComplemento()%>">
                        </div>
                    </div> 
                    
                    <div class="form-group">
                        <label for="txtEstado" class="col-xs-6 col-md-3 control-label">Estado: </label>
                        <div class="col-xs-8 col-md-6">
                            <select class="form-control" id="txtEstado" name="txtEstado" required="" value="<%=func.getEstado()%>">
                                <option selected="" value="<%=func.getEstado()%>"><%=func.getEstado()%></option>
                                <option value="ac">Acre</option> 
                                <option value="al">Alagoas</option> 
                                <option value="am">Amazonas</option> 
                                <option value="ap">Amapá</option> 
                                <option value="ba">Bahia</option> 
                                <option value="ce">Ceará</option> 
                                <option value="df">Distrito Federal</option> 
                                <option value="es">Espírito Santo</option> 
                                <option value="go">Goiás</option> 
                                <option value="ma">Maranhão</option> 
                                <option value="mt">Mato Grosso</option> 
                                <option value="ms">Mato Grosso do Sul</option> 
                                <option value="mg">Minas Gerais</option> 
                                <option value="pa">Pará</option> 
                                <option value="pb">Paraíba</option> 
                                <option value="pr">Paraná</option> 
                                <option value="pe">Pernambuco</option> 
                                <option value="pi">Piauí</option> 
                                <option value="rj">Rio de Janeiro</option> 
                                <option value="rn">Rio Grande do Norte</option> 
                                <option value="ro">Rondônia</option> 
                                <option value="rs">Rio Grande do Sul</option> 
                                <option value="rr">Roraima</option> 
                                <option value="sc">Santa Catarina</option> 
                                <option value="se">Sergipe</option> 
                                <option value="sp">São Paulo</option> 
                                <option value="to">Tocantins</option>                          
                            </select>
                        </div>
                    </div>
                    
                    <div class="form-group">
                        <label for="txtCidade" class="col-xs-6 col-md-3 control-label">Cidade: </label>
                        <div class="col-xs-8 col-md-6">
                            <input type="text" class="form-control" id="txtCidade" name="txtCidade" required="" value="<%=func.getCidade()%>">
                        </div>
                    </div>                     
                    
                    <div class="form-group">
                        <label for="txtLogin" class="col-xs-6 col-md-3 control-label">Login: </label>
                        <div class="col-xs-8 col-md-6">
                            <input type="text" class="form-control" id="txtLogin" name="txtLogin" required="" value="<%=func.getLogin()%>">
                        </div>
                    </div>
                           
                    <div class="form-group">
                        <label for="txtSenha" class="col-xs-6 col-md-3 control-label">Senha: </label>
                        <div class="col-xs-8 col-md-6">
                            <input type="password" class="form-control" id="txtSenha" name="txtSenha" required="" value="<%=func.getSenha()%>">
                        </div>
                    </div> 
                        
                    <div class="form-group">
                        <label for="txtStatus" class="col-xs-6 col-md-3 control-label">Status: </label>
                        <div class="col-xs-8 col-md-6">
                            <input type="number" class="form-control" id="txtStatus" name="txtStatus" min="0" max="1" required="" value="<%=func.getStatusFunc()%>">
                        </div>
                    </div>
                        
                    <div class="form-group">
                        <label for="txtTipo" class="col-xs-6 col-md-3 control-label">Tipo: </label>
                        <div class="col-xs-8 col-md-6">
                            <input type="number" class="form-control" id="txtTipo" name="txtTipo" min="2" max="3" required="" value="<%=func.getTipoFunc()%>">
                        </div>
                    </div>
                    
                    <div class="form-group">
                        <div class="col-xs-8 col-md-6 col-md-offset-3">
                            <input type="submit" value="Alterar" name="btnAlterar" id="btnEnviarAF" class="btn btn-success btn-lg btn-block"/>
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
