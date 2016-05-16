package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class cadastroLivro_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"pt-br\">\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("\n");
      out.write("        <!-- As 3 meta tags acima *devem* vir em primeiro lugar dentro do `head`; qualquer outro conteúdo deve vir *após* essas tags -->\n");
      out.write("        <title>Cadastro de Livros</title>\n");
      out.write("\n");
      out.write("        <!-- Bootstrap -->\n");
      out.write("        <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("        <!-- HTML5 shim e Respond.js para suporte no IE8 de elementos HTML5 e media queries -->\n");
      out.write("        <!-- ALERTA: Respond.js não funciona se você visualizar uma página file:// -->\n");
      out.write("        <!--[if lt IE 9]>\n");
      out.write("          <script src=\"https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js\"></script>\n");
      out.write("          <script src=\"https://oss.maxcdn.com/respond/1.4.2/respond.min.js\"></script>\n");
      out.write("        <![endif]-->\n");
      out.write("\n");
      out.write("        <!--CSS do cadastroClie.jsp -->\n");
      out.write("        <link href=\"css/cadastroClie.css\" rel=\"stylesheet\">\n");
      out.write("        <!-- jquery para a mascara -->\n");
      out.write("        <script src = \"js/jquery-1.12.3.min.js\"  type = \"text/javascript\" ></script>\n");
      out.write("        <script src = \"js/jquery-2.1.3.js\"  type = \"text/javascript\" ></script>\n");
      out.write("        <script src = \"js/jquery.maskedinput.js\"  type = \"text/javascript\" ></script>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!-- Para funcionar no mozila -->\n");
      out.write("        <!-- cdn for modernizr, if you haven't included it already -->\n");
      out.write("        <script src=\"http://cdn.jsdelivr.net/webshim/1.12.4/extras/modernizr-custom.js\"></script>\n");
      out.write("        <!-- polyfiller file to detect and load polyfills -->\n");
      out.write("        <script src=\"http://cdn.jsdelivr.net/webshim/1.12.4/polyfiller.js\"></script>\n");
      out.write("        <script>\n");
      out.write("            webshims.setOptions('waitReady', false);\n");
      out.write("            webshims.setOptions('forms-ext', {types: 'date'});\n");
      out.write("            webshims.polyfill('forms forms-ext');\n");
      out.write("        </script>\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <!-- Cabeçalho da pagina com o menu, logo e nome -->\n");
      out.write("        <header id=\"cabecahome\">          \n");
      out.write("            <!-- menu -->\n");
      out.write("            \n");
      out.write("            <!-- Menu -->\n");
      out.write("            \n");
      out.write("\n");
      out.write("            <!-- Logo e Titulo -->\n");
      out.write("            <div class=\"row\" id=\"cadastroLivro\">\n");
      out.write("\n");
      out.write("\n");
      out.write("                <div class=\"col-xs-5 col-md-4\">\n");
      out.write("                    <img src=\"img/logo.png\" alt=\"Biblioteca\" id=\"logo\" class=\"img-responsive\">\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <hgroup class=\"col-xs-6 col-xs-offset-1 col-md-7 col-md-offset-1\">\n");
      out.write("                    <h1>Cadastro de Livros</h1>\n");
      out.write("                </hgroup>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("        </header>\n");
      out.write("\n");
      out.write("        <!-- Conteudo da Pagina -->\n");
      out.write("\n");
      out.write("        <article id=\"Cadastro\"  class=\"row\">         \n");
      out.write("            <div class=\"col-xs-9 col-xs-offset-3 col-md8 col-md-offset-2\">\n");
      out.write("                <form class=\"form-horizontal\"  action=\"LivroServlet\" method=\"post\">\n");
      out.write("\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label for=\"txtISBN\" class=\"col-xs-6 col-md-3 control-label\">ISBN: </label>\n");
      out.write("                        <div class=\"col-xs-8 col-md-6\">\n");
      out.write("                            <input type=\"text\" class=\"form-control\" id=\"txtISBN\" name=\"txtISBN\" required=\"\">\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label for=\"txtEdicao\" class=\"col-xs-6 col-md-3 control-label\">Edição: </label>\n");
      out.write("                        <div class=\"col-xs-8 col-md-6\">\n");
      out.write("                            <input type=\"text\" class=\"form-control\" id=\"txtEdicao\" name=\"txtEdicao\" required=\"\">\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label for=\"txtTitulo\" class=\"col-xs-6 col-md-3 control-label\">Título: </label>\n");
      out.write("                        <div class=\"col-xs-8 col-md-6\">\n");
      out.write("                            <input type=\"text\" class=\"form-control\" id=\"txtTitulo\" name=\"txtTitulo\" required=\"\">\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label for=\"txtAutor\" class=\"col-xs-6 col-md-3 control-label\">Autor: </label>\n");
      out.write("                        <div class=\"col-xs-8 col-md-6\">\n");
      out.write("                            <input type=\"txt\" class=\"form-control\" id=\"txtAutor\" name=\"txtAutor\" required=\"\">\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label for=\"txtEditora\" class=\"col-xs-6 col-md-3 control-label\">Editora: </label>\n");
      out.write("                        <div class=\"col-xs-8 col-md-6\">\n");
      out.write("                            <input type=\"text\" class=\"form-control\" id=\"txtEditora\" name=\"txtEditora\" required=\"\">\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label for=\"txtResumo\" class=\"col-xs-6 col-md-3 control-label\">Resumo: </label>\n");
      out.write("                        <div class=\"col-xs-8 col-md-6\">\n");
      out.write("                            <input type=\"text\" class=\"form-control\" id=\"txtResumo\" name=\"txtResumo\" required=\"\">\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label for=\"txtPreco\" class=\"col-xs-6 col-md-3 control-label\">Preço: </label>\n");
      out.write("                        <div class=\"col-xs-8 col-md-6\">\n");
      out.write("                            <input type=\"text\" class=\"form-control\" id=\"txtPreco\" name=\"txtPreco\" required=\"\">\n");
      out.write("                        </div>\n");
      out.write("                    </div>        \n");
      out.write("\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label for=\"txtAnoPublicacao\" class=\"col-xs-6 col-md-3 control-label\">Ano de Publicação: </label>\n");
      out.write("                        <div class=\"col-xs-8 col-md-6\">\n");
      out.write("                            <input type=\"text\" class=\"form-control\" id=\"txtAnoPublicacao\" name=\"txtAnoPublicacao\" required=\"\">\n");
      out.write("                        </div>\n");
      out.write("                    </div> \n");
      out.write("\n");
      out.write("\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label for=\"txtCategoria\" class=\"col-xs-6 col-md-3 control-label\">Categoria: </label>\n");
      out.write("                        <div class=\"col-xs-8 col-md-6\">\n");
      out.write("                            <input type=\"text\" class=\"form-control\" id=\"txtCategoria\" name=\"txtCategoria\">\n");
      out.write("                        </div>\n");
      out.write("                    </div> \n");
      out.write("\n");
      out.write("\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label for=\"txtTags\" class=\"col-xs-6 col-md-3 control-label\">Tags: </label>\n");
      out.write("                        <div class=\"col-xs-8 col-md-6\">\n");
      out.write("                            <input type=\"text\" class=\"form-control\" id=\"txtTags\" name=\"txtTags\" required=\"\">\n");
      out.write("                        </div>\n");
      out.write("                    </div>                     \n");
      out.write("\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label for=\"txtObs\" class=\"col-xs-6 col-md-3 control-label\">Observações: </label>\n");
      out.write("                        <div class=\"col-xs-8 col-md-6\">\n");
      out.write("                            <input type=\"text\" class=\"form-control\" id=\"txtObs\" name=\"txtObs\" required=\"\">\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <div class=\"col-xs-8 col-md-6 col-md-offset-3\">\n");
      out.write("                            <input type=\"submit\" value=\"Enviar\" name=\"btnEnviar\" id=\"btnEnviarCC\" class=\"btn btn-success btn-lg\" />\n");
      out.write("                            <input type=\"reset\" value=\"Limpar\" name=\"btnLimpar\" id=\"btnLimparCC\" class=\"btn btn-danger btn-lg\" />\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </article>\n");
      out.write("        <!-- aonde deveria ficar o rodapé se tivesse um --> \n");
      out.write("        <footer class=\"footer\">\n");
      out.write("\n");
      out.write("        </footer>\n");
      out.write("\n");
      out.write("        <!-- Script para fazer as mascaras dos campos  -->\n");
      out.write("        <script>\n");
      out.write("            jQuery(function ($) {\n");
      out.write("\n");
      out.write("                $(\"#txtAnoPublicacao\").mask(\"9999\");\n");
      out.write("\n");
      out.write("            });\n");
      out.write("        </script> \n");
      out.write("\n");
      out.write("        <!-- jQuery (obrigatório para plugins JavaScript do Bootstrap) -->\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js\"></script>\n");
      out.write("        <!-- Inclui todos os plugins compilados (abaixo), ou inclua arquivos separadados se necessário -->\n");
      out.write("        <script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
