<!DOCTYPE html>
<html lang="pt-br">
    <%@page import="br.com.Modelagem.Cliente, br.com.DAO.ClienteDAO" %>
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <!-- As 3 meta tags acima *devem* vir em primeiro lugar dentro do `head`; qualquer outro conteúdo deve vir *após* essas tags -->
        <title>Alterar Cliente</title>

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
            Cliente cli = new Cliente();
            int cod = 0;
            cod = Integer.parseInt(request.getParameter("codClie"));
            cli = new ClienteDAO().getClie(cod);  // Obtem o item do BD que foi solicitado via parâmetro.            

        %>

        <article id="Alteracao"  class="row">         
            <div class="col-xs-9 col-xs-offset-1 col-md-9 col-md-offset-1">
                <form class="form-horizontal"  action="ClienteServletAlterar" method="post">

                    <div class="form-group">
                        <label for="txtCodigo" class="col-xs-4 col-md-4 control-label">Codigo: </label>
                        <div class="col-xs-6 col-md-6">
                            <input type="text" class="form-control" id="txtCodigo" name="txtCodigo" required="" readonly="" value="<%=cli.getCodClie()%>">
                        </div>
                    </div>

                    <div class="form-group">
                        <label for="txtNome" class="col-xs-4 col-md-4 control-label">Nome Completo: </label>
                        <div class="col-xs-6 col-md-6">
                            <input type="text" class="form-control" id="txtNome" name="txtNome" required="" value="<%=cli.getNome()%>">
                        </div>
                    </div>

                    <div class="form-group">
                        <label for="txtDataNasc" class="col-xs-4 col-md-4 control-label">Data De Nascimento: </label>
                        <div class="col-xs-6 col-md-6">
                            <input type="date" class="form-control" id="txtDataNasc" name="txtDataNasc" required="" value="<%=cli.getDtNasc()%>">
                        </div>
                    </div>

                    <div class="form-group">
                        <label for="txtCPF" class="col-xs-4 col-md-4 control-label">CPF: </label>
                        <div class="col-xs-6 col-md-6">
                            <input type="text" class="form-control" id="txtCPF" name="txtCPF" required="" value="<%=cli.getCpfClie()%>">
                        </div>
                    </div>

                    <div class="form-group">
                        <label for="txtEmail" class="col-xs-4 col-md-4 control-label">Email: </label>
                        <div class="col-xs-6 col-md-6">
                            <input type="email" class="form-control" id="txtEmail" name="txtEmail" required="" value="<%=cli.getEmail()%>">
                        </div>
                    </div>

                    <div class="form-group">
                        <label for="txtTelefone" class="col-xs-4 col-md-4 control-label">Telefone: </label>
                        <div class="col-xs-6 col-md-6">
                            <input type="tel" class="form-control" id="txtTelefone" name="txtTelefone" required="" value="<%=cli.getTelefone()%>">
                        </div>
                    </div>

                    <div class="form-group">
                        <label for="txtCEP" class="col-xs-4 col-md-4 control-label">CEP: </label>
                        <div class="col-xs-6 col-md-6">
                            <input type="text" class="form-control" id="txtCEP" name="txtCEP" required="" value="<%=cli.getCep()%>">
                        </div>
                    </div>

                    <div class="form-group">
                        <label for="txtEndereco" class="col-xs-4 col-md-4 control-label">Endereço: </label>
                        <div class="col-xs-6 col-md-6">
                            <input type="text" class="form-control" id="txtEndereco" name="txtEndereco" required="" value="<%=cli.getEnd()%>">
                        </div>
                    </div>        

                    <div class="form-group">
                        <label for="txtBairro" class="col-xs-4 col-md-4 control-label">Bairro: </label>
                        <div class="col-xs-6 col-md-6">
                            <input type="text" class="form-control" id="txtBairro" name="txtBairro" required="" value="<%=cli.getBairro()%>">
                        </div>
                    </div> 

                    <div class="form-group">
                        <label for="txtComplemento" class="col-xs-4 col-md-4 control-label">Complemento: </label>
                        <div class="col-xs-6 col-md-6">
                            <input type="text" class="form-control" id="txtComplemento" name="txtComplemento" value="<%=cli.getComplemento()%>">
                        </div>
                    </div> 

                    <div class="form-group">
                        <label for="txtEstado" class="col-xs-4 col-md-4 control-label">Estado: </label>
                        <div class="col-xs-6 col-md-6">
                            <select class="form-control" id="txtEstado" name="txtEstado" required="" value="<%=cli.getEstado()%>">
                                <option selected="" value="<%=cli.getEstado()%>"><%=cli.getEstado()%></option>
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
                        <label for="txtCidade" class="col-xs-4 col-md-4 control-label">Cidade: </label>
                        <div class="col-xs-6 col-md-6">
                            <input type="text" class="form-control" id="txtCidade" name="txtCidade" required="" value="<%=cli.getCidade()%>">
                        </div>
                    </div>                     

                    <div class="form-group">
                        <label for="txtSenha" class="col-xs-4 col-md-4 control-label">Senha: </label>
                        <div class="col-xs-6 col-md-6">
                            <input type="password" class="form-control" id="txtSenha" name="txtSenha" required="" value="<%=cli.getSenha()%>">
                        </div>
                    </div> 

                    <div class="form-group">
                        <label for="txtStatus" class="col-xs-4 col-md-4 control-label">Status: </label>
                        <div class="col-xs-6 col-md-6">
                            <select class="form-control" id="txtEstado" name="txtStatus" required="" value="<%=cli.getStatusClie()%>">
                                <option selected="" value="<%=cli.getStatusClie()%>"><%=cli.getStatusClie()%></option>
                                <option value="0">Regular</option>
                                <option value="1">Irregular</option>
                            </select>
                        </div>
                    </div>

                    <div class="form-group">
                        <label for="txtObs" class="col-xs-4 col-md-4 control-label">observação: </label>
                        <div class="col-xs-6 col-md-6">
                            <textarea class="form-control" id="txtObs" name="txtObs"><%=cli.getObsClie()%></textarea>
                        </div>
                    </div>

                    <div class="form-group">
                        <div class="col-xs-6 col-xs-offset-4 col-md-6 col-md-offset-4">
                            <input type="submit" value="Alterar" name="btnAlterar" id="btnEnviarAC" class="btn btn-success btn-lg btn-block"/>
                        </div>
                    </div>


                </form>
            </div>

        </article>





        <!-- Script para fazer as mascaras dos campos --> 
        <script>
            jQuery(function ($) {
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