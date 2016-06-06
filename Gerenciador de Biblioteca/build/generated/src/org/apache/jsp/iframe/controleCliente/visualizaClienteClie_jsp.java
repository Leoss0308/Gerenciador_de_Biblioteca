package org.apache.jsp.iframe.controleCliente;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import br.com.Modelagem.Cliente;
import br.com.DAO.ClienteDAO;

public final class visualizaClienteClie_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    \n");
      out.write("  <head>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("    <!-- As 3 meta tags acima *devem* vir em primeiro lugar dentro do `head`; qualquer outro conteúdo deve vir *após* essas tags -->\n");
      out.write("    <title>Visualizar Cliente</title>\n");
      out.write("\n");
      out.write("    <!-- Bootstrap -->\n");
      out.write("    <link href=\"../../css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("      \n");
      out.write("    <!-- HTML5 shim e Respond.js para suporte no IE8 de elementos HTML5 e media queries -->\n");
      out.write("    <!-- ALERTA: Respond.js não funciona se você visualizar uma página file:// -->\n");
      out.write("    <!--[if lt IE 9]>\n");
      out.write("      <script src=\"https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js\"></script>\n");
      out.write("      <script src=\"https://oss.maxcdn.com/respond/1.4.2/respond.min.js\"></script>\n");
      out.write("    <![endif]-->\n");
      out.write("    \n");
      out.write("    <!-- jquery para a mascara -->\n");
      out.write("    <script src = \"../../js/jquery-1.12.3.min.js\"  type = \"text/javascript\" ></script>\n");
      out.write("    <script src = \"../../js/jquery-2.1.3.js\"  type = \"text/javascript\" ></script>\n");
      out.write("    <script src = \"../../js/jquery.maskedinput.js\"  type = \"text/javascript\" ></script>\n");
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
      out.write("\n");
      out.write("    \n");
      out.write("    <style>\n");
      out.write("        body{\n");
      out.write("            background: url(../../img/fundoTabela.jpg) no-repeat center top fixed;\n");
      out.write("            -webkit-background-size: cover;\n");
      out.write("            -moz-background-size: cover;\n");
      out.write("            -o-background-size: cover;\n");
      out.write("            background-size: cover;\n");
      out.write("            /*overflow: hidden;*/\n");
      out.write("        }   \n");
      out.write("    </style>\n");
      out.write("    \n");
      out.write("  </head>\n");
      out.write("  <body>\n");
      out.write("      \n");
      out.write("        ");

            Cliente cli = new Cliente();
            int cod = 0;
            cod = Integer.parseInt(String.valueOf(session.getAttribute("cod")));
            cli = new ClienteDAO().getClie(cod);  // Obtem o item do BD que foi solicitado via parâmetro.            
            
        
      out.write("\n");
      out.write("        \n");
      out.write("        <article id=\"Alteracao\"  class=\"row\">         \n");
      out.write("            <div class=\"col-xs-9 col-xs-offset-1 col-md-9 col-md-offset-1\">\n");
      out.write("                <form class=\"form-group\"  action=\"\" method=\"post\">\n");
      out.write("                    \n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label for=\"txtCodigo\" class=\"col-xs-6 col-md-6 control-label\">Codigo: </label>\n");
      out.write("                        <div class=\"col-xs-6 col-md-6\">\n");
      out.write("                            <label class=\"control-label\">");
      out.print(cli.getCodClie());
      out.write("</label>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                        \n");
      out.write("                        <hr>\n");
      out.write("                        \n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label for=\"txtNome\" class=\"col-xs-6 col-md-6 control-label\">Nome Completo: </label>\n");
      out.write("                        <div class=\"col-xs-6 col-md-6\">\n");
      out.write("                            <label class=\"control-label\">");
      out.print(cli.getNome());
      out.write("</label>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                        \n");
      out.write("                        <hr>\n");
      out.write("                                                            \n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label for=\"txtDataNasc\" class=\"col-xs-6 col-md-6 control-label\">Data De Nascimento: </label>\n");
      out.write("                        <div class=\"col-xs-6 col-md-6\">\n");
      out.write("                            <label class=\"control-label\">");
      out.print(cli.getDtNasc());
      out.write("</label>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                        \n");
      out.write("                        <hr>\n");
      out.write("                    \n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label for=\"txtCPF\" class=\"col-xs-6 col-md-6 control-label\">CPF: </label>\n");
      out.write("                        <div class=\"col-xs-6 col-md-6\">\n");
      out.write("                            <label class=\"control-label\">");
      out.print(cli.getCpfClie());
      out.write("</label>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                        \n");
      out.write("                        <hr>\n");
      out.write("                    \n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label for=\"txtEmail\" class=\"col-xs-6 col-md-6 control-label\">Email: </label>\n");
      out.write("                        <div class=\"col-xs-6 col-md-6\">\n");
      out.write("                            <label class=\"control-label\">");
      out.print(cli.getEmail());
      out.write("</label>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                        \n");
      out.write("                        <hr>\n");
      out.write("                    \n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label for=\"txtTelefone\" class=\"col-xs-6 col-md-6 control-label\">Telefone: </label>\n");
      out.write("                        <div class=\"col-xs-6 col-md-6\">\n");
      out.write("                            <label class=\"control-label\">");
      out.print(cli.getTelefone());
      out.write("</label>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                        \n");
      out.write("                        <hr>\n");
      out.write("                    \n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label for=\"txtCEP\" class=\"col-xs-6 col-md-6 control-label\">CEP: </label>\n");
      out.write("                        <div class=\"col-xs-6 col-md-6\">\n");
      out.write("                            <label class=\"control-label\">");
      out.print(cli.getCep());
      out.write("</label>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                        \n");
      out.write("                        <hr>\n");
      out.write("                     \n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label for=\"txtEndereco\" class=\"col-xs-6 col-md-6 control-label\">Endereço: </label>\n");
      out.write("                        <div class=\"col-xs-6 col-md-6\">\n");
      out.write("                            <label class=\"control-label\">");
      out.print(cli.getEnd());
      out.write("</label>\n");
      out.write("                        </div>\n");
      out.write("                    </div>        \n");
      out.write("                        \n");
      out.write("                        <hr>\n");
      out.write("                           \n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label for=\"txtBairro\" class=\"col-xs-6 col-md-6 control-label\">Bairro: </label>\n");
      out.write("                        <div class=\"col-xs-6 col-md-6\">\n");
      out.write("                            <label class=\"control-label\">");
      out.print(cli.getBairro());
      out.write("</label>\n");
      out.write("                        </div>\n");
      out.write("                    </div> \n");
      out.write("                        \n");
      out.write("                        <hr>\n");
      out.write("                    \n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label for=\"txtComplemento\" class=\"col-xs-6 col-md-6 control-label\">Complemento: </label>\n");
      out.write("                        <div class=\"col-xs-6 col-md-6\">\n");
      out.write("                            <label class=\"control-label\">");
      out.print(cli.getComplemento());
      out.write("</label>\n");
      out.write("                        </div>\n");
      out.write("                    </div> \n");
      out.write("                        \n");
      out.write("                        <hr>\n");
      out.write("                    \n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label for=\"txtEstado\" class=\"col-xs-6 col-md-6 control-label\">Estado: </label>\n");
      out.write("                        <div class=\"col-xs-6 col-md-6\">\n");
      out.write("                            <label class=\"control-label\">");
      out.print(cli.getEstado());
      out.write("</label>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                        \n");
      out.write("                        <hr>\n");
      out.write("                    \n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label for=\"txtCidade\" class=\"col-xs-6 col-md-6 control-label\">Cidade: </label>\n");
      out.write("                        <div class=\"col-xs-6 col-md-6\">\n");
      out.write("                            <label class=\"control-label\">");
      out.print(cli.getCidade());
      out.write("</label>\n");
      out.write("                        </div>\n");
      out.write("                    </div>                     \n");
      out.write("                        \n");
      out.write("                        <hr>\n");
      out.write("                    \n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label for=\"txtLogin\" class=\"col-xs-6 col-md-6 control-label\">Login: </label>\n");
      out.write("                        <div class=\"col-xs-6 col-md-6\">\n");
      out.write("                            <label class=\"control-label\">");
      out.print(cli.getLogin());
      out.write("</label>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                        \n");
      out.write("                        <hr>\n");
      out.write("                           \n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label for=\"txtSenha\" class=\"col-xs-6 col-md-6 control-label\">Senha: </label>\n");
      out.write("                        <div class=\"col-xs-6 col-md-6\">\n");
      out.write("                            <label class=\"control-label\">");
      out.print(cli.getSenha());
      out.write("</label>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                        \n");
      out.write("                        <hr>\n");
      out.write("                    \n");
      out.write("                    ");

                        if(cli.getStatusClie()==0){
                    
      out.write("   \n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label for=\"txtStatus\" class=\"col-xs-6 col-md-6 control-label\">Status: </label>\n");
      out.write("                        <div class=\"col-xs-6 col-md-6\">\n");
      out.write("                            <label class=\"control-label\">Regular</label>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    ");

                        }if(cli.getStatusClie()==1){
                    
      out.write("\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label for=\"txtStatus\" class=\"col-xs-6 col-md-6 control-label\">Status: </label>\n");
      out.write("                        <div class=\"col-xs-6 col-md-6\">\n");
      out.write("                            <label class=\"control-label\">Irregular</label>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    ");

                        }
                    
      out.write("\n");
      out.write("                        \n");
      out.write("                        <hr>\n");
      out.write("                       \n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label for=\"txtObs\" class=\"col-xs-6 col-md-6 control-label\">Observação: </label>\n");
      out.write("                        <div class=\"col-xs-6 col-md-6\">\n");
      out.write("                            <label class=\"control-label\">");
      out.print(cli.getObsClie());
      out.write("</label>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                        <hr>\n");
      out.write("                       \n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <div class=\"col-xs-8 col-md-6 col-md-offset-3\">\n");
      out.write("                            <a href=\"../../alterarAutoCliente.jsp?codClie=+");
      out.print(cod);
      out.write("\" class=\"btn btn-success btn-lg btn-block\">Alterar</a>\n");
      out.write("                            \n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                            \n");
      out.write("                      \n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("        </article>\n");
      out.write("      \n");
      out.write("      \n");
      out.write("      \n");
      out.write("\n");
      out.write("    \n");
      out.write("    <!-- Script para fazer as mascaras dos campos --> \n");
      out.write("    <script>\n");
      out.write("        jQuery(function($){\n");
      out.write("            $(\"#txtTelefone\").mask(\"(99)9999-9999\");\n");
      out.write("            $(\"#txtCPF\").mask(\"999.999.999-99\");\n");
      out.write("            $(\"#txtCEP\").mask(\"99999-999\");\n");
      out.write("            //$(\"#txtDataNasc\").mask(\"99/99/9999\");\n");
      out.write("        });\n");
      out.write("    </script>\n");
      out.write("    <!-- jQuery (obrigatório para plugins JavaScript do Bootstrap) -->\n");
      out.write("    <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js\"></script>\n");
      out.write("    <!-- Inclui todos os plugins compilados (abaixo), ou inclua arquivos separadados se necessário -->\n");
      out.write("    <script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("  </body>\n");
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
