package org.apache.jsp.iframe.controleFuncionario.funcionario;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import br.com.Modelagem.Emprestimo;
import br.com.DAO.EmprestimoDAO;
import java.util.List;
import br.com.Modelagem.Itens_Emprestimo;
import br.com.DAO.ItemEmprestimoDAO;

public final class visualizaEmprestimo_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    \n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">            \n");
      out.write("        <!-- As 3 meta tags acima *devem* vir em primeiro lugar dentro do `head`; qualquer outro conteúdo deve vir *após* essas tags -->\n");
      out.write("        <title>Tabela Emprestimo</title>\n");
      out.write("\n");
      out.write("        <!-- Bootstrap -->\n");
      out.write("        <link href=\"../../../css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("        <!-- HTML5 shim e Respond.js para suporte no IE8 de elementos HTML5 e media queries -->\n");
      out.write("        <!-- ALERTA: Respond.js não funciona se você visualizar uma página file:// -->\n");
      out.write("        <!--[if lt IE 9]>\n");
      out.write("          <script src=\"https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js\"></script>\n");
      out.write("          <script src=\"https://oss.maxcdn.com/respond/1.4.2/respond.min.js\"></script>\n");
      out.write("        <![endif]-->\n");
      out.write("\n");
      out.write("        <style>\n");
      out.write("            body{\n");
      out.write("                background: url(../img/fundo.jpg) no-repeat center top fixed;\n");
      out.write("                -webkit-background-size: cover;\n");
      out.write("                -moz-background-size: cover;\n");
      out.write("                -o-background-size: cover;\n");
      out.write("                background-size: cover;\n");
      out.write("                /*overflow: hidden;*/\n");
      out.write("            }   \n");
      out.write("        </style>\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        ");

            EmprestimoDAO empdao = new EmprestimoDAO();
            List<Emprestimo> Emprestimos = empdao.getLista();
        
      out.write("\n");
      out.write("        <div class=\"table-responsive\">  \n");
      out.write("            <table class=\"table table-bordered\">\n");
      out.write("                <!-- <tr><th colspan=\"18\">Clientes</tr> -->\n");
      out.write("                <tr>\n");
      out.write("                    <th>Código do Emprestimo</th><th>Código do Cliente</th><th>Funcionario</th><th>Código da Reserva</th><th>Titilo do Livro</th><th>Quantidade Do Livro</th><th>Data da Retirada</th><th>Data da Entrega</th><th>Código do Livro 1</th><th>Código do Livro 2</th><th>Código do Livro 3</th><th></th>\n");
      out.write("                </tr>\n");
      out.write("                ");

                    String sDestaque = "onMouseOver=\"this.style.backgroundColor='#ECECFF'; this.style.cursor='hand';\"";
                    sDestaque += "onMouseOut=\"this.style.backgroundColor='';\"";

                    int cor = 0;
                    for (Emprestimo Emp : Emprestimos) {
                        String sCor = "cor" + (cor % 2);
                        cor++;

                        // Fazer da linha da tabela, um link para exibição:
                        out.print("");

                        out.print("<tr id='" + sCor + "' " + sDestaque + ">");

                        out.print("<td>" + Emp.getCodEmprestimo() + "</td>");
                        out.print("<td>" + Emp.getCodCliente() + "</td>");
                        out.print("<td>" + Emp.getMatriculaFunc() + "</td>");
                        out.print("<td>" + Emp.getCodReserva() + "</td>");
                        out.print("<td>" + Emp.getTitulo() + "</td>");
                        out.print("<td>" + Emp.getDataRetirada() + "</td>");
                        out.print("<td>" + Emp.getDataDevolucao() + "</td>");

                        ItemEmprestimoDAO itensdao = new ItemEmprestimoDAO();
                        List<Itens_Emprestimo> Itens = itensdao.getLista(Emp.getCodEmprestimo());

                        for (Itens_Emprestimo ItenE : Itens) {

                            out.print("<td>" + ItenE.getCodLivro() + "</td>");

                            // Controle para manutenção: Efetiva devolução do Emprestimo, colocando a data de devolução do livro
                            out.print("<td id='cmd'><a href='../../../devolucaoEmprestimo.jsp?codEmprestimo=" + Emp.getCodEmprestimo() + "'><img src='../../img/alterar.jpg' title='Livro Devolvido' /></a></td>");

                        }

                       
                    }
                
      out.write("\n");
      out.write("            </table>\n");
      out.write("        </div>\n");
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
