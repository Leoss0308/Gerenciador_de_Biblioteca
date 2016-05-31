<%@page import="java.util.List"%>
<%@page import="br.com.Modelagem.Livro"%>
<%@page import="br.com.DAO.LivroDAO"%>
<!DOCTYPE html>
<html lang="pt-br">
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">

        <!-- As 3 meta tags acima *devem* vir em primeiro lugar dentro do `head`; qualquer outro conteúdo deve vir *após* essas tags -->
        <title>Home</title>

        <!-- Bootstrap -->
        <link href="css/bootstrap.min.css" rel="stylesheet">

        <!-- HTML5 shim e Respond.js para suporte no IE8 de elementos HTML5 e media queries -->
        <!-- ALERTA: Respond.js não funciona se você visualizar uma página file:// -->
        <!--[if lt IE 9]>
          <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
          <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
        <![endif]-->

        <!--CSS do index.jsp -->
        <link href="css/index.css" rel="stylesheet">


    </head>
    <body>
        <!-- Cabeçalho da pagina com o menu, logo e nome -->
        <header id="cabecahome">          

            <!-- Menu -->
            <%@include file="menu.jsp" %>


            <!-- logo e titulo -->
            <div class="row" id="tituloIndex">


                <div class="col-xs-5 col-md-4">
                    <img src="img/logo.png" alt="Biblioteca" id="logo" class="img-responsive">
                </div>

                <hgroup class="col-xs-6 col-xs-offset-1 col-md-7 col-md-offset-1">
                    <h1>Biblioteca</h1>
                </hgroup>

            </div>

        </head>
        <!-- Artigo com ele tem o conteudo da pagina -->
        <article id="pesquisaIndex"  class="row">

            <div class="col-xs-9 col-xs-offset-3  col-md-offset-2">

                <form class="form-horizontal">

                    <div class="form-group">
                        <label for="slcTipoPesquisa" class="col-xs-6 col-md-3 control-label">Pesquisar livro pelo: </label>
                        <div class="col-xs-8 col-md-6">
                            <select class="form-control" id="slcTipoPesquisa">
                                <option value="Titulo">Título</option>
                                <option value="ISBN">ISBN</option>
                                <option value="Autor">Nome do Autor </option>
                                <option value="Editora">Editora</option>
                            </select>
                        </div>
                    </div>

                    <div class="form-group">
                        <div class="col-xs-8 col-md-8 col-md-offset-1">
                            <input type="text" class="form-control" id="txtpesquisa" placeholder="Palavra Chave" style="width: 100%">
                        </div>
                    </div>

                    <div class="form-group">
                        <div class="col-xs-8 col-md-8 col-md-offset-1">
                            <input type="submit" value="Pesquisar" name="btnPesquisar" class="btn btn-default btn-lg btn-block" style="margin-top: 2px" />
                        </div>
                    </div>

                </form>

            </div>       
  <%
            LivroDAO livdao = new LivroDAO();
            List<Livro> livro = livdao.getLista();
            String palavra = request.getParameter("txtpesquisa");
            if (palavra == null) {
                livro = livdao.getLista();
            } else {
                String tipo = request.getParameter("slcTipoPesquisa");
                livro = livdao.getListaLike(palavra, tipo);
            }
        %>
        
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