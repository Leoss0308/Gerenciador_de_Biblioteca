<%-- 
    Document   : alterarLivro
    Created on : 14/05/2016, 19:57:35
    Author     : Amanda
--%>

<!DOCTYPE html>
<html lang="pt-br">
    <%@page import="br.com.Modelagem.Livro, br.com.DAO.LivroDAO" %>
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <!-- As 3 meta tags acima *devem* vir em primeiro lugar dentro do `head`; qualquer outro conteúdo deve vir *após* essas tags -->
        <title>Alterar Livro</title>

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
        Livro liv = new Livro();
        int cod = 0;
        cod = Integer.parseInt(request.getParameter("CodLivro"));
        liv = new LivroDAO().getLivro(cod);  // Obtem o item do BD que foi solicitado via parâmetro.            

    %>

    <article id="Alteracao"  class="row">         
        <div class="col-xs-9 col-xs-offset-1 col-md-9 col-md-offset-1">
            <form class="form-horizontal"  action="LivroServletAlterar" method="post"  enctype="multipart/form-data">

                <div class="form-group">
                    <label for="txtCodLivro" class="col-xs-4 col-md-4 control-label">Código: </label>
                    <div class="col-xs-6 col-md-6">
                        <input type="text" class="form-control" id="txtCodigo" name="txtCodLivro" required="" readonly="" value="<%=liv.getCodLivro()%>">
                    </div>
                </div>


                <div class="form-group">
                    <label for="txtISBN" class="col-xs-4 col-md-4 control-label">ISBN: </label>
                    <div class="col-xs-6 col-md-6">
                        <input type="text" class="form-control" id="txtISBN" maxlength="30" name="txtISBN" required="" value="<%=liv.getISBN()%>">
                    </div>
                </div>


                <div class="form-group">
                    <label for="txtEdicao" class="col-xs-4 col-md-4 control-label">Edição: </label>
                    <div class="col-xs-6 col-md-6">
                        <input type="text" class="form-control" id="txtEdicao" maxlength="10" name="txtEdicao" required="" value="<%=liv.getEdicaoLivro()%>">
                    </div>
                </div>

                <div class="form-group">
                    <label for="txtTitulo" class="col-xs-4 col-md-4 control-label">Título: </label>
                    <div class="col-xs-6 col-md-6">
                        <input type="text" class="form-control" id="txtTitulo"  maxlength="100" name="txtTitulo" required="" value="<%=liv.getTituloLivro()%>">
                    </div>
                </div>

                <div class="form-group">
                    <label for="txtAutor" class="col-xs-4 col-md-4 control-label">Autor: </label>
                    <div class="col-xs-6 col-md-6">
                        <input type="txt" class="form-control" id="txtAutor" maxlength="60" name="txtAutor" required="" value="<%=liv.getAutorLivro()%>">
                    </div>
                </div>

                <div class="form-group">
                    <label for="txtEditora" class="col-xs-4 col-md-4 control-label">Editora: </label>
                    <div class="col-xs-6 col-md-6">
                        <input type="text" class="form-control" id="txtEditora" maxlength="40" name="txtEditora" required="" value="<%=liv.getEditoraLivro()%>">
                    </div>
                </div>

                <div class="form-group">
                    <label for="txtResumo" class="col-xs-4 col-md-4 control-label">Resumo: </label>
                    <div class="col-xs-6 col-md-6">
                        <input type="text" class="form-control" id="txtResumo" maxlength="1000" name="txtResumo" required="" value="<%=liv.getResumoLivro()%>">
                    </div>
                </div>

                <div class="form-group">
                    <label for="txtPreco" class="col-xs-4 col-md-4 control-label">Preço: </label>
                    <div class="col-xs-6 col-md-6">
                        <input type="text" class="form-control" id="txtPreco" maxlength="10" name="txtPreco" required="" value="<%=liv.getPrecoLivro()%>">
                    </div>
                </div>        

                <div class="form-group">
                    <label for="txtAnoPublicacao" class="col-xs-4 col-md-4 control-label">Ano de Publicação: </label>
                    <div class="col-xs-6 col-md-6">
                        <input type="text" class="form-control" id="txtAnoPublicacao" maxlength="4" name="txtAnoPublicacao" required="" value="<%=liv.getAnoPublicacao()%>">
                    </div>
                </div> 



                <div class="form-group">
                    <label for="txtCategoria" class="col-xs-4 col-md-4 control-label">Categoria: </label>
                    <div class="col-xs-6 col-md-6">
                        <input type="text" class="form-control" id="txtCategoria" maxlength="60" name="txtCategoria" value="<%=liv.getCategoriaLivro()%>">
                    </div>
                </div> 


                <div class="form-group">
                    <label for="txtTags" class="col-xs-4 col-md-4 control-label">Tags: </label>
                    <div class="col-xs-6 col-md-6">
                        <input type="text" class="form-control" id="txtTags" maxlength="200" name="txtTags" required="" value="<%=liv.getTags()%>">
                    </div>
                </div>                     

                <div class="form-group">
                    <label for="txtObs" class="col-xs-4 col-md-4 control-label">Observações: </label>
                    <div class="col-xs-6 col-md-6">
                        <input type="text" class="form-control" id="txtObs" name="txtObs" required="" value="<%=liv.getObsLivro()%>">
                    </div>
                </div>



                <div class="form-group">
                    <label for="Matricula_Func" class="col-xs-4 col-md-4 control-label">Funcionário responsável: </label>
                    <div class="col-xs-6 col-md-6">
                        <input type="text" class="form-control" maxlength="11"  id="Matricula_Func" name="Matricula_Func" required="" readonly="" value="<%=liv.getMatriculaFunc()%>">

                    </div>
                </div>
                 <div class="form-group">
                      <label for="txtImagem" class="col-xs-4 col-md-4 control-label">Alterar Imagem: </label>
                      <div class="col-xs-6 col-md-6">
                          <input type="file" name="filecover" required=""  value="Upload"/></td>
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






    <!-- Script para fazer as mascaras dos campos  -->
    <script>
        jQuery(function ($) {

            $("#txtAnoPublicacao").mask("9999");

        });
    </script> 

    <!-- jQuery (obrigatório para plugins JavaScript do Bootstrap) -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
    <!-- Inclui todos os plugins compilados (abaixo), ou inclua arquivos separadados se necessário -->
    <script src="js/bootstrap.min.js"></script>
</body>
</html>