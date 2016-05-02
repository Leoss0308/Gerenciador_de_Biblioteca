<!DOCTYPE html>
<html lang="pt-br">
    <%@page import="br.com.Modelagem.Cliente, br.com.DAO.ClienteDAO,  java.util.List" %>
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- As 3 meta tags acima *devem* vir em primeiro lugar dentro do `head`; qualquer outro conteúdo deve vir *após* essas tags -->
    <title>Tabela Cliente</title>

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
            background: url(../img/fundo.jpg) no-repeat center top fixed;
            -webkit-background-size: cover;
            -moz-background-size: cover;
            -o-background-size: cover;
            background-size: cover;
            overflow: hidden;
        }   
    </style>
    
  </head>
  <body>
  
    <%
        ClienteDAO clidao = new ClienteDAO();
        List<Cliente> clientes = clidao.getLista();
    %>
      
    <table width="100%" align="center">
        <tr><th colspan="18">Clientes</tr>
        <tr>
            <th>Código</th><th>Nome</th><th>CPF</th><th>Bairro</th><th>CEP</th><th>Cidade</th><th>Estado</th><th>Telefone</th><th>Email</th><th>Login</th><th>Senha</th><th>Observacao</th><th>Data_Cadastro</th><th>Endereco</th><th>Status</th><th>Complemento</th><th>Data_Nasc</th><th></th>
        </tr>
        <%
            String sDestaque = "onMouseOver=\"this.style.backgroundColor='#ECECFF'; this.style.cursor='hand';\"";
            sDestaque += "onMouseOut=\"this.style.backgroundColor='';\"";

            int cor = 0;
            for (Cliente cli : clientes) {
                String sCor = "cor" + (cor % 2);
                cor++;

                // Fazer da linha da tabela, um link para exibição:
                out.print("");

                out.print("<tr id='" + sCor + "' " + sDestaque + ">");
                
                out.print("<td>" + cli.getCodClie() + "</td>");
                out.print("<td>" + cli.getNome() + "</td>");
                out.print("<td>" + cli.getCpfClie() + "</td>");
                out.print("<td>" + cli.getBairro() + "</td>");
                out.print("<td>" + cli.getCep() + "</td>");
                out.print("<td>" + cli.getCidade() + "</td>");
                out.print("<td>" + cli.getEstado() + "</td>");
                out.print("<td>" + cli.getTelefone() + "</td>");
                out.print("<td>" + cli.getEmail() + "</td>");
                out.print("<td>" + cli.getLogin() + "</td>");
                out.print("<td>" + cli.getSenha() + "</td>");
                out.print("<td>" + cli.getObsClie() + "</td>");
                out.print("<td>" + cli.getDtCadastroClie() + "</td>");
                out.print("<td>" + cli.getEnd() + "</td>");
                out.print("<td>" + cli.getStatusClie() + "</td>");
                out.print("<td>" + cli.getComplemento() + "</td>");
                out.print("<td>" + cli.getDtNasc() + "</td>");
                
                // Controle para manutenção:
                out.print("<td id='cmd'><a href='alterarCliente.jsp?codClie=" + cli.getCodClie() + "'><img src='../../img/delete-peq.jpg' /></a></td>");
                out.print("<td id='cmd'><a href='clienteExcluir.jsp?codClie=" + cli.getCodClie() + "'><img src='../../../img/delete-peq.jpg' /></a></td>");
                
                out.print("</tr>");

                //out.print("</a>");

            }
        %>
    </table>
    
    
    
    
    
    
    <!-- jQuery (obrigatório para plugins JavaScript do Bootstrap) -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
    <!-- Inclui todos os plugins compilados (abaixo), ou inclua arquivos separadados se necessário -->
    <script src="js/bootstrap.min.js"></script>
  </body>
</html>