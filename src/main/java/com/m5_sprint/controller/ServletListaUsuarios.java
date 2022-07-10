package com.m5_sprint.controller;

import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.m5_sprint.model.Usuario;
import com.m5_sprint.services.UsuarioService;

@WebServlet("/ServletListaUsuarios")
public class ServletListaUsuarios extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public ServletListaUsuarios() {
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		UsuarioService listaUsuario = new UsuarioService();
		ArrayList<Usuario> listaUsuarios = (ArrayList<Usuario>)listaUsuario.getAllUsuario();
		
		request.setAttribute("listaUsuarios", listaUsuarios);
		System.out.println("l listauser");
		getServletContext().getRequestDispatcher("/WEB-INF/views/listaUsuarios.jsp").forward(request,response);	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
