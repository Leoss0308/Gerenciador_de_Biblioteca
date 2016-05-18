<!DOCTYPE html>
<html lang="pt-br">
    <%@page import="br.com.Modelagem.Funcionario, br.com.DAO.FuncionarioDAO,  java.util.List" %>
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- As 3 meta tags acima *devem* vir em primeiro lugar dentro do `head`; qualquer outro conteúdo deve vir *após* essas tags -->
    <title>Tabela Funcionário</title>

    <!-- Bootstrap -->
    <link href="../../../css/bootstrap.min.css" rel="stylesheet">

    <!-- HTML5 shim e Respond.js para suporte no IE8 de elementos HTML5 e media queries -->
    <!-- ALERTA: Respond.js não funciona se você visualizar uma página file:// -->
    <!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
    
    <style>
        body{
            background: url(../../../img/fundoTabela.jpg) no-repeat center top fixed;
            -webkit-background-size: cover;
            -moz-background-size: cover;
            -o-background-size: cover;
            background-size: cover;
            /*overflow: hidden;*/
        }   
    </style>
    
  </head>
  <body>
      <div class="row">
            
                <form class="form-horizontal"  action="visualizaFuncionario.jsp" method="get">

                    <div class="form-inline">
                        <label for="slcTipoPesquisa" class="col-xs-2 control-label">Pesquisar pelo: </label>
                        <div class="col-xs-2 ">
                            <select class="form-control" id="slcTipoPesquisa" name="slcTipoPesquisa" style="width: 100%">
                                <option value="Nome">Nome</option>
                                <option value="CPF">CPF</option>
                            </select>
                        </div>
                    </div>

                    <div class="form-inline">
                        <div class="col-xs-3">
                            <input type="text" class="form-control" id="txtpesquisa" name="txtpesquisa" placeholder="Palavra Chave" style="width: 100%">
                        </div>
                    </div>

                    <div class="form-inline">
                        <div class="col-xs-1 ">
                            <input type="submit" value="Pesquisar" name="btnPesquisar" class="btn btn-default btn-sm" style="margin-top: 2px"/>
                        </div>
                    </div>

                </form>
            
        </div>
      <div class="row">
        </div>
  
    <%
        List<Funcionario> funcionarios = null;
        FuncionarioDAO funcdao = new FuncionarioDAO();
        String palavra = request.getParameter("txtpesquisa");
        if(palavra == null){ 
        funcionarios = funcdao.getLista();
        }else{
        String tipo = request.getParameter("slcTipoPesquisa");
        funcionarios = funcdao.getListaLike(palavra, tipo);
        }
    %>

    <div class="table-responsive">  
        <table class="table table-bordered">
           <!-- <tr><th colspan="18">Clientes</tr> -->
            <tr>
                <th>Código</th><th>Nome</th><th>Endereço</th><th>Complemento</th><th>Bairro</th><th>CEP</th><th>Cidade</th><th>Estado</th><th>Telefone</th><th>E-mail</th><th>Login</th><th>Senha</th><th>Data_Nascimentoo</th><th>Status</th><th>Tipo</th><th></th><th></th>
            </tr>
            <%
                String sDestaque = "onMouseOver=\"this.style.backgroundColor='#ECECFF'; this.style.cursor='hand';\"";
                sDestaque += "onMouseOut=\"this.style.backgroundColor='';\"";

                int cor = 0;
                for (Funcionario func : funcionarios) {
                    String sCor = "cor" + (cor % 2);
                    cor++;

                    // Fazer da linha da tabela, um link para exibição:
                    out.print("");

                    out.print("<tr id='" + sCor + "' " + sDestaque + ">");

                    out.print("<td>" + func.getMatriculaFunc()+ "</td>");
                    out.print("<td>" + func.getNome() + "</td>");
                    out.print("<td>" + func.getEnd() + "</td>");
                    out.print("<td>" + func.getComplemento() + "</td>");
                    out.print("<td>" + func.getBairro() + "</td>");
                    out.print("<td>" + func.getCep() + "</td>");
                    out.print("<td>" + func.getCidade() + "</td>");
                    out.print("<td>" + func.getEstado() + "</td>");
                    out.print("<td>" + func.getTelefone() + "</td>");
                    out.print("<td>" + func.getEmail() + "</td>");
                    out.print("<td>" + func.getLogin() + "</td>");
                    out.print("<td>" + func.getSenha() + "</td>");
                    out.print("<td>" + func.getDtNasc()+ "</td>");
                    out.print("<td>" + func.getStatusFunc()+ "</td>");
                    out.print("<td>" + func.getTipoFunc()+ "</td>");

                    // Controle para manutenção:
                    out.print("<td id='cmd'><a href='../../../alterarFunc.jsp?MatriculaFunc=" + func.getMatriculaFunc()+ "'><img src='../../../img/alterar.png' /></a></td>");
                    out.print("<td id='cmd'><a href='FuncionarioExcluir.jsp?MatriculaFunc=" + func.getMatriculaFunc()+ "'><img src='../../../img/excluir.png' /></a></td>");

                    //.print("</tr>");

                    //out.print("</a>");

                }
            %>
        </table>
    </div>
        
    
    
    
    <!-- jQuery (obrigatório para plugins JavaScript do Bootstrap) -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
    <!-- Inclui todos os plugins compilados (abaixo), ou inclua arquivos separadados se necessário -->
    <script src="js/bootstrap.min.js"></script>
  </body>
</html>
