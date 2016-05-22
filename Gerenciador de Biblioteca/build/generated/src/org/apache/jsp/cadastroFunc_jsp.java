package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class cadastroFunc_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"pt-br\">\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("\n");
      out.write("        <!-- As 3 meta tags acima *devem* vir em primeiro lugar dentro do `head`; qualquer outro conteúdo deve vir *após* essas tags -->\n");
      out.write("        <title>Cadastro De Funcionário</title>\n");
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
      out.write("        \n");
      out.write("        <!-- jquery para a mascara -->\n");
      out.write("        <script src = \"js/jquery-1.12.3.min.js\"  type = \"text/javascript\" ></script>\n");
      out.write("        <script src = \"js/jquery-2.1.3.js\"  type = \"text/javascript\" ></script>\n");
      out.write("        <script src = \"js/jquery.maskedinput.js\"  type = \"text/javascript\" ></script>\n");
      out.write("            \n");
      out.write("        \n");
      out.write("        <!-- Para funcionar no mozila -->\n");
      out.write("        <!-- cdn for modernizr, if you haven't included it already -->\n");
      out.write("        <script src=\"http://cdn.jsdelivr.net/webshim/1.12.4/extras/modernizr-custom.js\"></script>\n");
      out.write("        <!-- polyfiller file to detect and load polyfills -->\n");
      out.write("        <script src=\"http://cdn.jsdelivr.net/webshim/1.12.4/polyfiller.js\"></script>\n");
      out.write("        <script>\n");
      out.write("          webshims.setOptions('waitReady', false);\n");
      out.write("          webshims.setOptions('forms-ext', {types: 'date'});\n");
      out.write("          webshims.polyfill('forms forms-ext');\n");
      out.write("        </script>\n");
      out.write("        \n");
      out.write("        <style>\n");
      out.write("        body{\n");
      out.write("            background: url(../../../img/fundoTabela.jpg) no-repeat center top fixed;\n");
      out.write("            -webkit-background-size: cover;\n");
      out.write("            -moz-background-size: cover;\n");
      out.write("            -o-background-size: cover;\n");
      out.write("            background-size: cover;\n");
      out.write("            /*overflow: hidden;*/\n");
      out.write("        }\n");
      out.write("        input#btnLimparCF, input#btnEnviarCF{\n");
      out.write("            width: 48%;\n");
      out.write("        }\n");
      out.write("           \n");
      out.write("    </style>\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <!-- Cabeçalho da pagina com o menu, logo e nome -->\n");
      out.write("        <header id=\"cabecahome\">          \n");
      out.write("            <!-- menu -->\n");
      out.write("           \n");
      out.write("            <!-- Logo e Titulo -->\n");
      out.write("            <div class=\"row\">\n");
      out.write("\n");
      out.write("                <hgroup class=\"col-xs-9 col-xs-offset-3 col-md-9 col-md-offset-4\">\n");
      out.write("                    <h1>Cadastro de Funcionário</h1>\n");
      out.write("                </hgroup>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </header>\n");
      out.write("        \n");
      out.write("        <!-- Conteudo da Pagina -->\n");
      out.write("        ");

            if(session.getAttribute("verificacao")==null){
            HttpSession cadfuncvolta = request.getSession();
            cadfuncvolta.setAttribute("txtNome","");
            cadfuncvolta.setAttribute("txtBairro","");
            cadfuncvolta.setAttribute("txtCEP","");
            cadfuncvolta.setAttribute("txtCidade","");
            cadfuncvolta.setAttribute("txtEstado","");
            cadfuncvolta.setAttribute("txtTelefone","");
            cadfuncvolta.setAttribute("txtEmail","");
            cadfuncvolta.setAttribute("txtEndereco","");
            cadfuncvolta.setAttribute("txtComplemento","");
                
            }
        
      out.write("\n");
      out.write("\n");
      out.write("        <!-- Conteudo da Pagina -->\n");
      out.write("\n");
      out.write("        <article id=\"Cadastro\"  class=\"row\">         \n");
      out.write("            <div class=\"col-xs-9 col-xs-offset-1 col-md9 col-md-offset-1\">\n");
      out.write("                <form class=\"form-horizontal\"  action=\"FuncionarioServlet\" method=\"post\">\n");
      out.write("   \n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label for=\"txtNome\" class=\"col-xs-4 col-md-4 control-label\">Nome Completo: </label>\n");
      out.write("                        <div class=\"col-xs-6 col-md-6\">\n");
      out.write("                            <input type=\"text\" class=\"form-control\" id=\"txtNome\" name=\"txtNome\" required=\"\" value=\"");
out.print(session.getAttribute("txtNome"));
      out.write("\">\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    \n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label for=\"txtDataNasc\" class=\"col-xs-4 col-md-4 control-label\">Data De Nascimento: </label>\n");
      out.write("                        <div class=\"col-xs-6 col-md-6\">\n");
      out.write("                            <input type=\"date\" class=\"form-control\" id=\"txtDataNasc\" name=\"txtDataNasc\" required=\"\">\n");
      out.write("                        </div>\n");
      out.write("                    </div> \n");
      out.write("                    \n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label for=\"txtEndereco\" class=\"col-xs-4 col-md-4 control-label\">Endereço: </label>\n");
      out.write("                        <div class=\"col-xs-6 col-md-6\">\n");
      out.write("                            <input type=\"text\" class=\"form-control\" id=\"txtEndereco\" name=\"txtEndereco\" required=\"\" value=\"");
out.print(session.getAttribute("txtEndereco"));
      out.write("\">\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    \n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label for=\"txtComplemento\" class=\"col-xs-4 col-md-4 control-label\">Complemento: </label>\n");
      out.write("                        <div class=\"col-xs-6 col-md-6\">\n");
      out.write("                            <input type=\"text\" class=\"form-control\" id=\"txtComplemento\" name=\"txtComplemento\"value=\"");
out.print(session.getAttribute("txtComplemento"));
      out.write("\">\n");
      out.write("                        </div>\n");
      out.write("                    </div> \n");
      out.write("                    \n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label for=\"txtBairro\" class=\"col-xs-4 col-md-4 control-label\">Bairro: </label>\n");
      out.write("                        <div class=\"col-xs-6 col-md-6\">\n");
      out.write("                            <input type=\"text\" class=\"form-control\" id=\"txtBairro\" name=\"txtBairro\" required=\"\" value=\"");
out.print(session.getAttribute("txtBairro"));
      out.write("\">\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    \n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label for=\"txtCEP\" class=\"col-xs-4 col-md-4 control-label\">CEP: </label>\n");
      out.write("                        <div class=\"col-xs-6 col-md-6\">\n");
      out.write("                            <input type=\"text\" class=\"form-control\" id=\"txtCEP\" name=\"txtCEP\" required=\"\" value=\"");
out.print(session.getAttribute("txtCEP"));
      out.write("\">\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    \n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label for=\"txtCidade\" class=\"col-xs-4 col-md-4 control-label\">Cidade: </label>\n");
      out.write("                        <div class=\"col-xs-6 col-md-6\">\n");
      out.write("                            <input type=\"text\" class=\"form-control\" id=\"txtCidade\" name=\"txtCidade\" required=\"\" value=\"");
out.print(session.getAttribute("txtCidade"));
      out.write("\">\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    \n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label for=\"txtEstado\" class=\"col-xs-4 col-md-4 control-label\">Estado: </label>\n");
      out.write("                        <div class=\"col-xs-6 col-md-6\">\n");
      out.write("                            <select class=\"form-control\" id=\"txtEstado\" name=\"txtEstado\" required=\"\" value=\"");
out.print(session.getAttribute("txtEstado"));
      out.write("\">\n");
      out.write("                                <option value=\"ac\">Acre</option> \n");
      out.write("                                    <option value=\"al\">Alagoas</option> \n");
      out.write("                                    <option value=\"am\">Amazonas</option> \n");
      out.write("                                    <option value=\"ap\">Amapá</option> \n");
      out.write("                                    <option value=\"ba\">Bahia</option> \n");
      out.write("                                    <option value=\"ce\">Ceará</option> \n");
      out.write("                                    <option value=\"df\">Distrito Federal</option> \n");
      out.write("                                    <option value=\"es\">Espírito Santo</option> \n");
      out.write("                                    <option value=\"go\">Goiás</option> \n");
      out.write("                                    <option value=\"ma\">Maranhão</option> \n");
      out.write("                                    <option value=\"mt\">Mato Grosso</option> \n");
      out.write("                                    <option value=\"ms\">Mato Grosso do Sul</option> \n");
      out.write("                                    <option value=\"mg\">Minas Gerais</option> \n");
      out.write("                                    <option value=\"pa\">Pará</option> \n");
      out.write("                                    <option value=\"pb\">Paraíba</option> \n");
      out.write("                                    <option value=\"pr\">Paraná</option> \n");
      out.write("                                    <option value=\"pe\">Pernambuco</option> \n");
      out.write("                                    <option value=\"pi\">Piauí</option> \n");
      out.write("                                    <option value=\"rj\">Rio de Janeiro</option> \n");
      out.write("                                    <option value=\"rn\">Rio Grande do Norte</option> \n");
      out.write("                                    <option value=\"ro\">Rondônia</option> \n");
      out.write("                                    <option value=\"rs\">Rio Grande do Sul</option> \n");
      out.write("                                    <option value=\"rr\">Roraima</option> \n");
      out.write("                                    <option value=\"sc\">Santa Catarina</option> \n");
      out.write("                                    <option value=\"se\">Sergipe</option> \n");
      out.write("                                    <option value=\"sp\">São Paulo</option> \n");
      out.write("                                    <option value=\"to\">Tocantins</option>                          \n");
      out.write("                            </select>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    \n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label for=\"txtTelefone\" class=\"col-xs-4 col-md-4 control-label\">Telefone: </label>\n");
      out.write("                        <div class=\"col-xs-6 col-md-6\">\n");
      out.write("                            <input type=\"text\" class=\"form-control\" id=\"txtTelefone\" name=\"txtTelefone\" required=\"\" value=\"");
out.print(session.getAttribute("txtTelefone"));
      out.write("\">\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    \n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label for=\"txtEmail\" class=\"col-xs-4 col-md-4 control-label\">Email: </label>\n");
      out.write("                        <div class=\"col-xs-6 col-md-6\">\n");
      out.write("                            <input type=\"email\" class=\"form-control\" id=\"txtEmail\" name=\"txtEmail\" required=\"\" value=\"");
out.print(session.getAttribute("txtEmail"));
      out.write("\">\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    \n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label for=\"txtLogin\" class=\"col-xs-4 col-md-4 control-label\">Login: </label>\n");
      out.write("                        <div class=\"col-xs-6 col-md-6\">\n");
      out.write("                            <input type=\"text\" class=\"form-control\" id=\"txtLogin\" name=\"txtLogin\" required=\"\">\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                        \n");
      out.write("                        ");
                    
                        if(request.getParameter("login") != null){
                    
      out.write(" \n");
      out.write("                        \n");
      out.write("                        \n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label class=\"col-xs-6 col-xs-offset-2 col-md-6 col-md-offset-2 control-label\" style=\"color: red\">Login já existe!</label>                      \n");
      out.write("                    </div>\n");
      out.write("                    \n");
      out.write("                    ");

                        }
                    
      out.write("\n");
      out.write("                           \n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label for=\"txtSenha\" class=\"col-xs-4 col-md-4 control-label\">Senha: </label>\n");
      out.write("                        <div class=\"col-xs-6 col-md-6\">\n");
      out.write("                            <input type=\"password\" class=\"form-control\" id=\"txtSenha\" name=\"txtSenha\" required=\"\">\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    \n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label for=\"txtTipo\" class=\"col-xs-4 col-md-4 control-label\">Tipo: </label>\n");
      out.write("                        <div class=\"col-xs-6 col-md-6\">                            \n");
      out.write("                            <select class=\"form-control\" id=\"txtTipo\" name=\"txtTipo\" required=\"\">\n");
      out.write("                                <option value=\"2\">Funcioario</option>\n");
      out.write("                                <option value=\"3\">Administrador</option>\n");
      out.write("                            </select>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <div class=\"col-xs-6 col-xs-offset-4 col-md-6 col-md-offset-4\">\n");
      out.write("                            <input type=\"submit\" value=\"Enviar\" name=\"btnEnviar\" id=\"btnEnviarCF\" class=\"btn btn-success btn-lg\" />\n");
      out.write("                            <input type=\"reset\" value=\"Limpar\" name=\"btnLimpar\" id=\"btnLimparCF\" class=\"btn btn-danger btn-lg\" />\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                            \n");
      out.write("                      \n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("        </article>\n");
      out.write("        <!-- aonde deveria ficar o rodapé se tivesse um --> \n");
      out.write("        <footer class=\"footer\">\n");
      out.write("            \n");
      out.write("        </footer>\n");
      out.write("        \n");
      out.write("        <!-- Script para fazer as mascaras dos campos --> \n");
      out.write("        <script>\n");
      out.write("            jQuery(function($){\n");
      out.write("                $(\"#txtTelefone\").mask(\"(99)9999-9999\");\n");
      out.write("                $(\"#txtCPF\").mask(\"999.999.999-99\");\n");
      out.write("                $(\"#txtCEP\").mask(\"99999-999\");\n");
      out.write("                //$(\"#txtDataNasc\").mask(\"99/99/9999\");\n");
      out.write("            });\n");
      out.write("        </script>\n");
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
