<%@page import="java.io.File"%>
<%@page import="java.util.List"%>
<%@page import="br.com.Modelagem.Livro"%>
<%@page import="br.com.DAO.LivroDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>


<!DOCTYPE html>
<html lang="pt-br">
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">

        <!-- As 3 meta tags acima *devem* vir em primeiro lugar dentro do `head`; qualquer outro conteúdo deve  vir *após* essas tags -->
        <title>Livros</title>
        <link rel="icon" type="image/png" href="img/iconLivro.png">

        <!-- Bootstrap -->
        <link href="css/bootstrap.min.css" rel="stylesheet">

        <!-- HTML5 shim e Respond.js para suporte no IE8 de elementos HTML5 e media queries -->
        <!-- ALERTA: Respond.js não funciona se você visualizar uma página file:// -->
        <!--[if lt IE 9]>
          <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
          <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
        <![endif]-->


        <!--CSS do index.jsp -->
        <link href="css/livros.css" rel="stylesheet">
         <!-- Menu -->
          <%@include file="menu.jsp" %>

    </head>
    <body>
        <!-- Cabeçalho da pagina com o menu, logo e nome -->
        <header id="cabecalivros">    

         

            <!-- logo e titulo -->
            <div class="row" id="tituloLivros">

                <div class="col-xs-5 col-md-4">
                    <img src="img/logo.png" alt="Biblioteca" id="logo" class="img-responsive">
                </div>

                <hgroup class="col-xs-6 col-xs-offset-1 col-md-7 col-md-offset-1">
                    <h1>Livros</h1>
                </hgroup>

            </div>       



        </header>
        <!-- Artigo com ele tem o conteudo da pagina -->
        <article id="pesquisaLivros"  class="row">
            <div class="col-xs-10 col-xs-offset-1 col-md12 col-md-offset-1">

                <form class="form-inline" action="livros.jsp" method="get">

                    <div class="form-group">

                        <label for="slcTipoPesquisa">Pesquisar livro pelo: </label>

                        <select class="form-control" id="slcTipoPesquisa" name="slcTipoPesquisa">
                            <option value="Titulo">Título</option>
                            <option value="ISBN">ISBN</option>
                            <option value="Autor">Nome do Autor </option>
                            <option value="Editora">Editora</option>
                        </select>

                    </div>  

                    <input type="text" class="form-control" id="txtpesquisa" name="txtpesquisa" placeholder="Palavra Chave"> 

                    <input name="botao" type="submit" value="" class="btn botao">

                    <!-- Botao por barra de pesquisa sem icone
                    <div class="col-xs-4 col-md-2  col-md-offset-0"> 
                    <button type="button" class="btn btn-default btn-lg btn-block" id="btnPesquisa" >Pesquisar</button> 
                    </div>  -->

                    <!--Referencia para chamar icone de botao pesquisar -->

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
            <div class="row" >
               <div class="col-xs-10 col-xs-offset-1">
                    
                            <%
                                String sDestaque = "onMouseOver=\"this.style.backgroundColor='#ECECFF'; this.style.cursor='hand';\"";
                                sDestaque += "onMouseOut=\"this.style.backgroundColor='';\"";

                                int cor = 0;
                                for (Livro liv : livro) {
                                    String sCor = "cor" + (cor % 2);
                                    cor++;

                                    // Fazer da linha da tabela, um link para exibição:
                                    //out.print("");

                                   // out.print("<tr id='" + sCor + "' " + sDestaque + ">");
                          
                                    //out.print("<td>" + liv.getTituloLivro() + "</td>");
                                    //out.print("<td>" + "<img src='capa" + liv.getCodLivro() + ".jpg'/>" + "</td>");
                                    //out.print("<td>" + "<img src='capa " + liv.getCodLivro() + ".jpg'height='40px' width='40px' align='left' />" + "</td>");
                                    //out.print("<td>" + "<img src='newimage.jpg' "+ liv.getImagem()+ "/>" + "</td>");
                                    out.print("<div class='col-xs-3'>");
                                    //out.print("<img src='img/livros.png' height='90px' width='90px'/><a href='verLivro.jsp?CodLivro=" +liv.getCodLivro() + "&TituloLivro=" + liv.getTituloLivro() + "'>" + liv.getTituloLivro() + "</a>");
                                    out.print("<a class='capa' href='verLivro.jsp?CodLivro=" +liv.getCodLivro() + "'><img class='img-responsive' src='"+liv.getImagem()+"' height='150' width='150'/> <br/> <span class='col-xs-12 nomecapa'>"  + liv.getTituloLivro() + "</span></a>");//<img src='"+liv.getImagem()+"' height='150' width='150'/><a clas href='verLivro.jsp?CodLivro=" +liv.getCodLivro() + "'>" + liv.getTituloLivro() + "</a>
                                    out.print("</div>");
                                    
                                    
                                }
                            %>
                            
                    
                </div>
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