<!DOCTYPE html>
<html lang="pt-br">
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">

        <!-- As 3 meta tags acima *devem* vir em primeiro lugar dentro do `head`; qualquer outro conteúdo deve vir *após* essas tags -->
        <title>Cadastro De Cliente</title>

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
                            <li><a href="index.jsp">Inicio</a></li>
                            <li><a href="livros.jsp">Livros</a></li>
                            <li><a href="perfil.jsp">Perfil</a></li>
                            <li><a href="faleConosco.jsp">Fale conosco</a></li>
                        </ul>

                        <ul class="nav navbar-nav navbar-right">
                            <li><a href="login.jsp">Login</a></li>
                            <li><a href="cadastroClie.jsp">Cadastre-se</a></li>
                        </ul>  
                    </div>
                </div>
            </nav>
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

        <article id="Cadastro"  class="row">         
            <div class="col-xs-9 col-xs-offset-3 col-md8 col-md-offset-2">
                <form class="form-horizontal">
                    
                    <div class="form-group">
                        <label for="txtNome" class="col-xs-6 col-md-3 control-label">Nome Completo: </label>
                        <div class="col-xs-8 col-md-6">
                            <input type="text" class="form-control" id="txtNome" required="">
                        </div>
                    </div>
                                                          
                    <div class="form-group">
                        <label for="txtDataNasc" class="col-xs-6 col-md-3 control-label">Data De Nascimento: </label>
                        <div class="col-xs-8 col-md-6">
                            <input type="date" class="form-control" id="txtDataNasc" required="">
                        </div>
                    </div>
                    
                    <div class="form-group">
                        <label for="txtCPF" class="col-xs-6 col-md-3 control-label">CPF: </label>
                        <div class="col-xs-8 col-md-6">
                            <input type="text" class="form-control" id="txtCPF" required="">
                        </div>
                    </div>
                    
                    <div class="form-group">
                        <label for="txtEmail" class="col-xs-6 col-md-3 control-label">Email: </label>
                        <div class="col-xs-8 col-md-6">
                            <input type="email" class="form-control" id="txtEmail" required="">
                        </div>
                    </div>
                    
                    <div class="form-group">
                        <label for="txtTelefone" class="col-xs-6 col-md-3 control-label">Telefone: </label>
                        <div class="col-xs-8 col-md-6">
                            <input type="tel" class="form-control" id="txtTelefone" required="">
                        </div>
                    </div>
                    
                    <div class="form-group">
                        <label for="txtCEP" class="col-xs-6 col-md-3 control-label">CEP: </label>
                        <div class="col-xs-8 col-md-6">
                            <input type="text" class="form-control" id="txtCEP" required="">
                        </div>
                    </div>
                     
                    <div class="form-group">
                        <label for="txtEndereco" class="col-xs-6 col-md-3 control-label">Endereço: </label>
                        <div class="col-xs-8 col-md-6">
                            <input type="text" class="form-control" id="txtEndereco" required="">
                        </div>
                    </div>        
                           
                    <div class="form-group">
                        <label for="txtBairro" class="col-xs-6 col-md-3 control-label">Bairro: </label>
                        <div class="col-xs-8 col-md-6">
                            <input type="text" class="form-control" id="txtBairro" required="">
                        </div>
                    </div> 
                    
                    <div class="form-group">
                        <label for="txtComplemento" class="col-xs-6 col-md-3 control-label">Complemento: </label>
                        <div class="col-xs-8 col-md-6">
                            <input type="text" class="form-control" id="txtComplemento">
                        </div>
                    </div> 
                    
                    <div class="form-group">
                        <label for="txtEstado" class="col-xs-6 col-md-3 control-label">Estado: </label>
                        <div class="col-xs-8 col-md-6">
                            <select class="form-control" id="txtEstado" required="">
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
                            <input type="text" class="form-control" id="txtCidade" required="">
                        </div>
                    </div>                     
                    
                    <div class="form-group">
                        <label for="txtLogin" class="col-xs-6 col-md-3 control-label">Login: </label>
                        <div class="col-xs-8 col-md-6">
                            <input type="text" class="form-control" id="txtLogin" required="">
                        </div>
                    </div>
                           
                    <div class="form-group">
                        <label for="txtSenha" class="col-xs-6 col-md-3 control-label">Senha: </label>
                        <div class="col-xs-8 col-md-6">
                            <input type="password" class="form-control" id="txtSenha" required="">
                        </div>
                    </div>   
                    
                    <div class="form-group">
                        <div class="col-xs-8 col-md-6 col-md-offset-3">
                            <input type="submit" value="Enviar" name="btnEnviar" id="btnEnviarCC" class="btn btn-success btn-lg" />
                            <input type="reset" value="Limpar" name="btnLimpar" id="btnLimparCC" class="btn btn-danger btn-lg" />
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