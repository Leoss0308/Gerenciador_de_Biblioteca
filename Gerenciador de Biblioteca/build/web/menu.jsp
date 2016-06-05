<nav class="navbar navbar-inverse navbar-fixed-top">
    <div class="container-fluid">
        <div class="navbar-header">
            <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href="#" style="cursor:default">Biblioteca</a>
        </div>
        <div id="navbar" class="navbar-collapse collapse">
            <ul class="nav navbar-nav navbar-left">
                <li><a href="index.jsp">Inicio</a></li>
                <li><a href="livros.jsp">Livros</a></li>
                <li><a href="perfil.jsp">Perfil</a></li>
                <li><a href="faleConosco.jsp">Fale conosco</a></li>
                <!--<li><a href="teste/testaConexão.jsp">Testa Conexão</a></li>-->
            </ul>

            <ul class="nav navbar-nav navbar-right">
             
                <%
                    if (session.getAttribute("permissao") == null) {
                %>
                
                <li><a href="login.jsp">Login</a></li>
                <li><a href="cadastroClie.jsp">Cadastre-se</a></li>
                
                <%
                    }
                    if (session.getAttribute("permissao") == "1") {
                %>  
                <li><a class="navbar-brand" href="#" style="cursor:default">Seja bem vindo, <%out.print(session.getAttribute("nome"));%></a></li>

                <li><a href="LogoutServlet"> logout</a></li>

                <%
                } else if (session.getAttribute("permissao") == "2" || session.getAttribute("permissao") == "3") {
                %>  
                <li><a href="#" style="cursor:default">Olá Funcionário, <%out.print(session.getAttribute("nome"));%></a></li>

                <li><a href="LogoutServlet"> logout</a></li>

                <%
                    }
                %> 

            </ul>  
        </div>
    </div>
</nav>