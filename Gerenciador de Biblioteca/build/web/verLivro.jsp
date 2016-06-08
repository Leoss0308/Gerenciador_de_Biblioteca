<%-- 
    Document   : verLivro
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
        <title>Ver Livro</title>
        <link rel="icon" type="image/png" href="img/iconLivro.png">

        <!-- Menu -->
        <%@include file="menu.jsp" %>
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

    <hgroup class="col-xs-6 col-xs-offset-6 col-md-6 col-md-offset-4">
        <h1></h1> 
        <h1></h1>
    </hgroup>


    <style>
        body{
            background: url(img/fundo.jpg) no-repeat center top fixed;
            -webkit-background-size: cover;
            -moz-background-size: cover;
            -o-background-size: cover;
            background-size: cover;
            overflow: auto;
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
        <div class="col-xs-10 scol-xs-offset-1 col-md-10 col-md-offset-1">
            <form class="form-group" action="" method="post">

                <br> <br>

                <div class="form-group">
                    <label for="txtCodLivro" class="col-xs-6 col-md-6 control-label">Código: </label>
                    <div class="col-xs-6 col-md-6">
                        <label class="control-label"><%=liv.getCodLivro()%></label>
                    </div>
                </div>

                <div class="form-group">
                    <label for="txtISBN" class="col-xs-6 col-md-6 control-label">ISBN: </label>
                    <div class="col-xs-6 col-md-6">
                        <label class="control-label"><%=liv.getISBN()%></label>
                    </div>
                </div>


                <div class="form-group">
                    <label for="txtEdicao" class="col-xs-6 col-md-6 control-label">Edição: </label>
                    <div class="col-xs-6 col-md-6">
                        <label class="control-label"><%=liv.getEdicaoLivro()%></label>
                    </div>
                </div>

                <div class="form-group">
                    <label for="txtTitulo" class="col-xs-6 col-md-6 control-label">Título: </label>
                    <div class="col-xs-6 col-md-6">
                        <label class="control-label"><%=liv.getTituloLivro()%></label>
                    </div>
                </div>

                <div class="form-group">
                    <label for="txtAutor" class="col-xs-6 col-md-6 control-label">Autor: </label>
                    <div class="col-xs-6 col-md-6">
                        <label class="control-label"><%=liv.getAutorLivro()%></label>
                    </div>
                </div>

                <div class="form-group">
                    <label for="txtEditora" class="col-xs-6 col-md-6 control-label">Editora: </label>
                    <div class="col-xs-6 col-md-6">
                        <label class="control-label"><%=liv.getEditoraLivro()%></label>
                    </div>
                </div>

                <div class="form-group">
                    <label for="txtResumo" class="col-xs-6 col-md-6 control-label">Resumo: </label>
                    <div class="col-xs-6 col-md-6">
                        <label class="control-label"><%=liv.getResumoLivro()%></label>
                    </div>
                </div>

                <div class="form-group">
                    <label for="txtPreco" class="col-xs-6 col-md-6 control-label">Preço: </label>
                    <div class="col-xs-6 col-md-6">
                        <label class="control-label"><%=liv.getPrecoLivro()%></label>
                    </div>
                </div>        

                <div class="form-group">
                    <label for="txtAnoPublicacao" class="col-xs-6 col-md-6 control-label">Ano de Publicação: </label>
                    <div class="col-xs-6 col-md-6">
                        <label class="control-label"><%=liv.getAnoPublicacao()%></label>
                    </div>
                </div> 

                <div class="form-group">
                    <label for="txtCategoria" class="col-xs-6 col-md-6 control-label">Categoria: </label>
                    <div class="col-xs-6 col-md-6">
                        <label class="control-label"><%=liv.getCategoriaLivro()%></label>
                    </div>
                </div> 


                <div class="form-group">
                    <label for="txtTags" class="col-xs-6 col-md-6 control-label">Tags: </label>
                    <div class="col-xs-6 col-md-6">
                        <label class="control-label"><%=liv.getTags()%></label>
                    </div>
                </div>                     

                <div class="form-group">
                    <label for="txtObs" class="col-xs-6 col-md-6 control-label">Observações: </label>
                    <div class="col-xs-6 col-md-6">
                        <label class="control-label"><%=liv.getObsLivro()%></label>
                    </div>
                </div>
                <div class="form-group">
                     <img src="<%=liv.getImagem()%>" height="190" width="190"/>
                </div> 
              <!-- <div class="form-group">
                    <img src= img/livros.png height='190px' width='190px'/>
                </div> -->
                <!--<div class="form-group">
                       <div class="col-xs-8 col-md-6 col-md-offset-3">
                            <input type="submit" value="Reservar livro" name="btnEnviar" id="btnEnviarCC" class="btn btn-success btn-lg" />    
                        </div>
                 </div> 
                -->
                  <div class="form-group">
                        <div class="col-xs-8 col-md-6 col-md-offset-3">
                            <%
                                if(session.getAttribute("permissao") == "1"){
                            %>
                            <a href="fazReserva.jsp?CodLivro=<%=liv.getCodLivro()%>" class="btn btn-success btn-lg btn-block">Reservar Livro</a>
                            <%
                                }if(session.getAttribute("permissao") != "1"){
                            %>
                                <a class="btn btn-success btn-lg btn-block" disabled="disabled">Reservar Livro</a>
                            <%
                                }
                            %>
                            
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
