/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Codigos;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author ice
 */
@WebServlet(name = "MainServlet", urlPatterns = {"/index.html", "/intercambista.html", "/oferta.html","/adiciona.html"})
public class MainServlet extends HttpServlet {

    List<Pessoa> pessoas = new PessoasList().getInstance();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        if ("/index.html".equals(request.getServletPath())) {
            RequestDispatcher dispachante = request.getRequestDispatcher("/WEB-INF/inicial.jsp");
            dispachante.forward(request, response);
        } else if ("/intercambista.html".equals(request.getServletPath())) {
            request.setAttribute("pessoas", pessoas);
            RequestDispatcher dispachante = request.getRequestDispatcher("/WEB-INF/intercambista.jsp");
            dispachante.forward(request, response);}
           else if ("/adiciona.html".equals(request.getServletPath())) {
                String nome = request.getParameter("nome");
                String contato = request.getParameter("contato");
                Integer dias = Integer.parseInt(request.getParameter("dias"));
                Pessoa p = new Pessoa(nome, contato, 0, dias, true);
                pessoas.add(p);
            request.setAttribute("pessoas", pessoas);
            RequestDispatcher dispachante = request.getRequestDispatcher("/WEB-INF/intercambista.jsp");
            dispachante.forward(request, response);
            
        } else if ("/oferta.html".equals(request.getServletPath())) {
            if ("".equals(request.getParameter("nome"))) {
                String nome = request.getParameter("nome");
                String contato = request.getParameter("contato");
                Integer dias = Integer.parseInt(request.getParameter("dias"));
                Pessoa p = new Pessoa(nome, contato, dias, 0, false);
                pessoas.add(p);
            }
            request.setAttribute("pessoas", pessoas);
            RequestDispatcher dispachante = request.getRequestDispatcher("/WEB-INF/oferta.jsp");
            dispachante.forward(request, response);
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

}
