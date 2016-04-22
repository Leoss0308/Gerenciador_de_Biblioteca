<%@page import="br.com.Conexao.Conecta" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Testa Conexão</title>
    </head>
    <body>
        <%
           Conecta c = new Conecta(); 
        %>
        <h1>Será que está conectando?</h1>
        <br/>
        <h2><p>Antes de conectar:
                <%
                    out.println(c.statusConection());  
                %>            
        </p></h2>
        <br/>
        <h2><p>Depois de conectar:
                <%
                    c.getConexao();
                    out.println(c.statusConection());
                    c.FecharConexao();
                %>                
        </p></h2>
        <br/>        
        <p> <a href="../index.jsp">Voltar</a> </p>
    </body>
</html>
