package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/menu.jsp");
  }

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

      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"pt-br\">\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("\n");
      out.write("        <!-- As 3 meta tags acima *devem* vir em primeiro lugar dentro do `head`; qualquer outro conteúdo deve vir *após* essas tags -->\n");
      out.write("        <title>Login</title>\n");
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
      out.write("        <!--CSS do index.jsp -->\n");
      out.write("        <link href=\"css/login.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <!-- Cabeçalho da pagina com o menu, logo e nome -->\n");
      out.write("        <header id=\"cabecalogin\"> \n");
      out.write("\n");
      out.write("            <!-- Menu -->\n");
      out.write("            ");
      out.write("<nav class=\"navbar navbar-inverse navbar-fixed-top\">\n");
      out.write("    <div class=\"container-fluid\">\n");
      out.write("        <div class=\"navbar-header\">\n");
      out.write("            <button type=\"button\" class=\"navbar-toggle collapsed\" data-toggle=\"collapse\" data-target=\"#navbar\" aria-expanded=\"false\" aria-controls=\"navbar\">\n");
      out.write("                <span class=\"sr-only\">Toggle navigation</span>\n");
      out.write("                <span class=\"icon-bar\"></span>\n");
      out.write("                <span class=\"icon-bar\"></span>\n");
      out.write("                <span class=\"icon-bar\"></span>\n");
      out.write("            </button>\n");
      out.write("            <a class=\"navbar-brand\" href=\"#\" style=\"cursor:default\">Biblioteca</a>\n");
      out.write("        </div>\n");
      out.write("        <div id=\"navbar\" class=\"navbar-collapse collapse\">\n");
      out.write("            <ul class=\"nav navbar-nav navbar-left\">\n");
      out.write("                <li><a href=\"index.jsp\">Inicio</a></li>\n");
      out.write("                <li><a href=\"livros.jsp\">Livros</a></li>\n");
      out.write("                <li><a href=\"perfil.jsp\">Perfil</a></li>\n");
      out.write("                <li><a href=\"faleConosco.jsp\">Fale conosco</a></li>\n");
      out.write("                <li><a href=\"teste/testaConexão.jsp\">Testa Conexão</a></li>\n");
      out.write("            </ul>\n");
      out.write("\n");
      out.write("            <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("             \n");
      out.write("                ");

                    if (session.getAttribute("permissao") == null) {
                
      out.write("\n");
      out.write("                \n");
      out.write("                <li><a href=\"login.jsp\">Login</a></li>\n");
      out.write("                <li><a href=\"cadastroClie.jsp\">Cadastre-se</a></li>\n");
      out.write("                \n");
      out.write("                ");

                    }
                    if (session.getAttribute("permissao") == "1") {
                
      out.write("  \n");
      out.write("                <li><a class=\"navbar-brand\" href=\"#\" style=\"cursor:default\">Seja bem vindo, ");
out.print(session.getAttribute("nome"));
      out.write("</a></li>\n");
      out.write("\n");
      out.write("                <li><a href=\"LogoutServlet\"> logout</a></li>\n");
      out.write("\n");
      out.write("                ");

                } else if (session.getAttribute("permissao") == "2" || session.getAttribute("permissao") == "3") {
                
      out.write("  \n");
      out.write("                <li><a href=\"#\" style=\"cursor:default\">Olá Funcionário, ");
out.print(session.getAttribute("nome"));
      out.write("</a></li>\n");
      out.write("\n");
      out.write("                <li><a href=\"LogoutServlet\"> logout</a></li>\n");
      out.write("\n");
      out.write("                ");

                    }
                
      out.write(" \n");
      out.write("\n");
      out.write("            </ul>  \n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</nav>");
      out.write("\n");
      out.write("\n");
      out.write("            <!-- logo e titulo -->\n");
      out.write("            <div class=\"row\" id=\"tituloLogin\">\n");
      out.write("\n");
      out.write("\n");
      out.write("                <div class=\"col-xs-5 col-md-4\">\n");
      out.write("                    <img src=\"img/logo.png\" alt=\"Biblioteca\" id=\"logo\" class=\"img-responsive\">\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <hgroup class=\"col-xs-6 col-xs-offset-1 col-md-7 col-md-offset-1\">\n");
      out.write("                    <h1>Login</h1>\n");
      out.write("                </hgroup>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </header>\n");
      out.write("        <!-- Artigo com ele tem o conteudo da pagina -->\n");
      out.write("        <article id=\"pesquisaIndex\"  class=\"row\">\n");
      out.write("\n");
      out.write("            <div class=\"col-xs-9 col-xs-offset-3 col-md-9 col-md-offset-2\">\n");
      out.write("\n");
      out.write("                <form class=\"form-horizontal\" action=\"LoginServlet\" method=\"post\">\n");
      out.write("\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label for=\"idLogin\"  class=\"col-xs-6 col-md-3 control-label\">Usuário:</label>\n");
      out.write("                        <div class=\"col-xs-8 col-md-6\">\n");
      out.write("                            <input type=\"text\" id=\"idLogin\" name=\"login\" class=\"form-control\" placeholder=\"Digite seu nome de Usuário\" required=\"\">\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label for=\"idSenha\" class=\"col-xs-6 col-md-3 control-label\">Senha:</label>\n");
      out.write("                        <div class=\"col-xs-8 col-md-6\">\n");
      out.write("                            <input type=\"password\" id=\"idSenha\" name=\"senha\" class=\"form-control\" placeholder=\"Digite sua senha\" required=\"\">\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <div class=\"col-xs-6 col-md-6 col-md-offset-3\">\n");
      out.write("                            <input type=\"submit\" value=\"Logar\" name=\"btnLogar\" class=\"btn btn-success btn-lg btn-block\" />\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                </form>\n");
      out.write("\n");
      out.write("                ");
                if (request.getParameter("erro") != null) {
                
      out.write("\n");
      out.write("                <div class=\"col-xs-6 col-md-6 col-md-offset-3\">\n");
      out.write("                    <font color=\"red\"> Login ou senha Inválida! - Tente novamente.</font>\n");
      out.write("                </div>\n");
      out.write("                ");

                    }
                
      out.write("\n");
      out.write("\n");
      out.write("            </div>       \n");
      out.write("\n");
      out.write("        </article>\n");
      out.write("        <!-- aonde deveria ficar o rodapé se tivesse um --> \n");
      out.write("        <footer class=\"footer\">\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        </footer>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!-- jQuery (obrigatório para plugins JavaScript do Bootstrap) -->\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js\"></script>\n");
      out.write("        <!-- Inclui todos os plugins compilados (abaixo), ou inclua arquivos separadados se necessário -->\n");
      out.write("        <script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("    </body>\n");
      out.write("</html>");
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
