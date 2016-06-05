<!DOCTYPE html>
<html lang="pt-br">
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">

        <!-- As 3 meta tags acima *devem* vir em primeiro lugar dentro do `head`; qualquer outro conteúdo deve vir *após* essas tags -->
        <title>Cadastro De Cliente</title>
        <link rel="icon" type="image/png" href="img/iconLivro.png">

        <!-- Bootstrap -->
        <link href="css/bootstrap.min.css" rel="stylesheet">

        <!-- HTML5 shim e Respond.js para suporte no IE8 de elementos HTML5 e media queries -->
        <!-- ALERTA: Respond.js não funciona se você visualizar uma página file:// -->
        <!--[if lt IE 9]>
          <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
          <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
        <![endif]-->

        <!--CSS do cadastroClie.jsp -->
        <link href="css/cadastroClie.css" rel="stylesheet">
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
        <script language="Javascript">
            function limpar(){
                document.getElementById("txtNome").value="";
                document.getElementById("txtCPF").value="";
                document.getElementById("txtBairro").value="";
                document.getElementById("txtCEP").value="";
                document.getElementById("txtCidade").value="";
                document.getElementById("txtEstado").value="";
                document.getElementById("txtTelefone").value="";
                document.getElementById("txtEmail").value="";
                document.getElementById("txtEndereco").value="";
                document.getElementById("txtComplemento").value="";
            }
        </script>

    </head>
    <body>
        <!-- Cabeçalho da pagina com o menu, logo e nome -->
        <header id="cabecahome">          
            <!-- menu -->
            
            <!-- Menu -->
            <%@include file="menu.jsp" %>
            
            <!-- Logo e Titulo -->
            <div class="row" id="cadastroClie">


                <div class="col-xs-5 col-md-4">
                    <img src="img/logo.png" alt="Biblioteca" id="logo" class="img-responsive">
                </div>

                <hgroup class="col-xs-6 col-xs-offset-1 col-md-7 col-md-offset-1">
                    <h1>Cadastro De Cliente</h1>
                </hgroup>

            </div>

        </header>

        <!-- Conteudo da Pagina -->
        <%
            if(session.getAttribute("verificacao")==null){
            HttpSession cadclivolta = request.getSession();
            cadclivolta.setAttribute("txtNome","");
            cadclivolta.setAttribute("txtCPF","");
            cadclivolta.setAttribute("txtBairro","");
            cadclivolta.setAttribute("txtCEP","");
            cadclivolta.setAttribute("txtCidade","");
            cadclivolta.setAttribute("txtEstado","");
            cadclivolta.setAttribute("txtTelefone","");
            cadclivolta.setAttribute("txtEmail","");
            cadclivolta.setAttribute("txtEndereco","");
            cadclivolta.setAttribute("txtComplemento","");
                
            }
        %>
        
        
        <article id="Cadastro"  class="row">         
            <div class="col-xs-9 col-xs-offset-3 col-md8 col-md-offset-2">
                <form class="form-horizontal"  action="ClienteServlet" method="post">
                    
                    <div class="form-group">
                        <label for="txtNome" class="col-xs-6 col-md-3 control-label">Nome Completo: </label>
                        <div class="col-xs-8 col-md-6">
                            <input type="text" class="form-control" id="txtNome" name="txtNome" required="" maxlength="40" value="<%out.print(session.getAttribute("txtNome"));%>">
                        </div>
                    </div>
                                                          
                    <div class="form-group">
                        <label for="txtDataNasc" class="col-xs-6 col-md-3 control-label">Data De Nascimento: </label>
                        <div class="col-xs-8 col-md-6">
                            <input type="date" class="form-control" id="txtDataNasc" name="txtDataNasc" required="">
                        </div>
                    </div>
                    
                    <div class="form-group">
                        <label for="txtCPF" class="col-xs-6 col-md-3 control-label">CPF: </label>
                        <div class="col-xs-8 col-md-6">
                            <input type="text" class="form-control" id="txtCPF" name="txtCPF" required="" value="<%out.print(session.getAttribute("txtCPF"));%>">
                        </div>
                    </div>
                    
                    <div class="form-group">
                        <label for="txtEmail" class="col-xs-6 col-md-3 control-label">Email: </label>
                        <div class="col-xs-8 col-md-6">
                            <input type="email" class="form-control" id="txtEmail" name="txtEmail" required="" maxlength="40" value="<%out.print(session.getAttribute("txtEmail"));%>">
                        </div>
                    </div>
                    
                    <div class="form-group">
                        <label for="txtTelefone" class="col-xs-6 col-md-3 control-label">Telefone: </label>
                        <div class="col-xs-8 col-md-6">
                            <input type="text" class="form-control" id="txtTelefone" name="txtTelefone" required="" value="<%out.print(session.getAttribute("txtTelefone"));%>">
                        </div>
                    </div>
                    
                    <div class="form-group">
                        <label for="txtCEP" class="col-xs-6 col-md-3 control-label">CEP: </label>
                        <div class="col-xs-8 col-md-6">
                            <input type="text" class="form-control" id="txtCEP" name="txtCEP" required="" value="<%out.print(session.getAttribute("txtCEP"));%>">
                        </div>
                    </div>
                     
                    <div class="form-group">
                        <label for="txtEndereco" class="col-xs-6 col-md-3 control-label">Endereço: </label>
                        <div class="col-xs-8 col-md-6">
                            <input type="text" class="form-control" id="txtEndereco" name="txtEndereco" required="" max="60" placeholder="ex: Rua das flores, 987" value="<%out.print(session.getAttribute("txtEndereco"));%>">
                        </div>
                    </div>        
                           
                    <div class="form-group">
                        <label for="txtBairro" class="col-xs-6 col-md-3 control-label">Bairro: </label>
                        <div class="col-xs-8 col-md-6">
                            <input type="text" class="form-control" id="txtBairro" name="txtBairro" required="" maxlength="30" placeholder="ex: Vila Maria" value="<%out.print(session.getAttribute("txtBairro"));%>">
                        </div>
                    </div> 
                    
                    <div class="form-group">
                        <label for="txtComplemento" class="col-xs-6 col-md-3 control-label">Complemento: </label>
                        <div class="col-xs-8 col-md-6">
                            <input type="text" class="form-control" id="txtComplemento" name="txtComplemento" maxlength="20" placeholder="ex: apto 10" value="<%out.print(session.getAttribute("txtComplemento"));%>">
                        </div>
                    </div> 
                    
                    <div class="form-group">
                        <label for="txtEstado" class="col-xs-6 col-md-3 control-label">Estado: </label>
                        <div class="col-xs-8 col-md-6">
                            <select class="form-control" id="txtEstado" name="txtEstado" required="">
                                    <option value="<%out.print(session.getAttribute("txtEstado"));%>"><%out.print(session.getAttribute("txtEstado"));%></option> 
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
                            <input type="text" class="form-control" id="txtCidade" name="txtCidade" required="" maxlength="30" placeholder="ex: São paulo" value="<%out.print(session.getAttribute("txtCidade"));%>">
                        </div>
                    </div>                     
                    
                    <div class="form-group">
                        <label for="txtLogin" class="col-xs-6 col-md-3 control-label">Login: </label>
                        <div class="col-xs-8 col-md-6">
                            <input type="text" class="form-control" id="txtLogin" name="txtLogin" maxlength="30" required="">
                        </div>
                    </div>
                    
                    <%                    
                        if(request.getParameter("login") != null){
                    %> 
                        
                        
                    <div class="form-group">
                        <label class="col-xs-8 col-xs-offset-3 col-md-6 col-md-offset-1 control-label" style="color: red">Login já existe!</label>                      
                    </div>
                    
                    <%
                        }
                    %>
                    
                           
                    <div class="form-group">
                        <label for="txtSenha" class="col-xs-6 col-md-3 control-label">Senha: </label>
                        <div class="col-xs-8 col-md-6">
                            <input type="password" class="form-control" id="txtSenha" maxlength="30" name="txtSenha" required="">
                        </div>
                    </div>   
                    
                    <div class="form-group">
                        <div class="col-xs-8 col-md-6 col-md-offset-3">
                            <input type="submit" value="Enviar" name="btnEnviar" id="btnEnviarCC" class="btn btn-success btn-lg" />
                            <input type="reset" value="Limpar" name="btnLimpar" onclick="limpar()" id="btnLimparCC" class="btn btn-danger btn-lg" />
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