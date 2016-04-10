<%-- 
    Document   : CadastroClie
    Created on : 05/04/2016, 16:27:11
    Author     : Erico Luiz Frank
--%>

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
                            <li><a href="#">Inicio</a></li>
                            <li><a href="#">Livros</a></li>
                            <li><a href="#">Perfil</a></li>
                            <li><a href="#">Fale conosco</a></li>
                        </ul>

                        <ul class="nav navbar-nav navbar-right">
                            <li><a href="#">Login</a></li>
                            <li><a href="#">Cadastre-se</a></li>
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
                    <table>
                        <tr>
                            <td>Nome Completo:</td>
                            <td><input type="text" id="nomecli" name="nomecli" required></td>                    
                        </tr>
                        <tr>
                            <td>CPF:</td>
                            <td><input type="text" id="cpfcli" name="cpfcli" required pattern="[0-9]{11}"></td>
                        </tr>
                        <tr>
                            <td>Data De Nascimento:</td>
                            <td><input type="date" id="datanascimentocli" name="datanascimentocli" required></td>
                        </tr>
                        <tr>
                            <td>Email:</td>
                            <td><input type="emailcli" id="email" name="emailcli" required></td>
                        </tr>
                        <tr>
                            <td>CEP:</td>
                            <td><input type="Number" id="cepcli" name="cepcli" required></td>
                        </tr>
                        <tr>
                            <td>Endereço:</td>
                            <td><input type="text" id="enderecocli" name="enderecocli" required></td>
                        </tr>
                        <tr>
                            <td>Bairro:</td>
                            <td><input type="text" id="bairrocli" name="bairrocli" required></td>
                        </tr>
                        <tr>
                            <td>Complemento:</td>
                            <td><input type="text" id="complementocli" name="complementocli"></td>
                        </tr>
                        <tr>                   
                            <td>Estado:</td>
                            <td>
                                <select name="estadocli" id="estadocli"> 
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
                            </td>
                        </tr>
                        <tr>
                            <td>Cidade:</td>
                            <td><input type="text" id="cidadecli" name="cidadecli" required></td>
                        </tr>
                        <tr>
                            <td>Telefone:</td>
                            <td><input type="tel" id="telefonecli" name="telefonecli" required></td>
                        </tr>
                        <tr>
                            <td>Login:</td>
                            <td><input type="text" id="logincli" name="logincli" required></td>
                        </tr>
                        <tr>
                            <td>Senha:</td>
                            <td><input type="text" id="senhacli" name="senhacli" required></td>
                        </tr>
                        <tr>
                            <td><input type="submit" value="Enviar" /></td>
                        </tr>
                    </table>
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