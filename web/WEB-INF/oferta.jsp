<%-- 
    Document   : oferta
    Created on : 27/04/2018, 21:22:35
    Author     : ice
--%>

<%@page import="java.util.List"%>
<%@page import="Codigos.Pessoa"%>
<%@page import="Codigos.Pessoa"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Oferta</title>
    </head>
    <body>
        <h1>Cadastre para oferecer hospedagem!</h1>
        <form  method="POST">
            <label> Nome:</label>
            <input type="text" name="nome" value="" /><br>
            <label> Contato:</label>
            <input type="text" name="contato" value="" /><br>
            <label> Quantidade de dias disponiveis para hospedagem:</label>
            <input type="number" name="dias" value="" /><br>
            <input type="submit" value="Enviar" name="enviar" />
            <input type="reset" value="Limpar" name="limpar" />
        </form>
        <table  border=1 >
            <thead>
                <tr>
                    <th>
                        Nome
                    </th>
                    <th>
                        Contato
                    </th>
                    <th>
                        Quantidade de dias necessitados
                    </th>

                </tr>
            </thead>
            <tbody>
        <%if((List<Pessoa>) request.getAttribute("pessoas")!=null){
            for (Pessoa pessoas : (List<Pessoa>) request.getAttribute("pessoas")) {
                //Esse if iria servir para mostrar apenas as pessoas com demanda igual a quem esta fornecendo
            //if(pessoas.getDisponibilidade()==Integer.parseInt(request.getParameter("dias"))){
        if(pessoas.getIntercambista()){%>
        <tr>
            <td><%=pessoas.getNome()%></td>
            <td><%=pessoas.getTelefone()%></td>
            <td><%=pessoas.getDisponibilidade()%></td>            
        </tr>
        <%}}}%>
            </tbody></table>
    
        <a href="index.html">Voltar</a>
    </body>
</html>
