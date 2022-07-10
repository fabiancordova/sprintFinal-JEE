package com.m5_sprint.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.m5_sprint.model.*;
import com.m5_sprint.services.UsuarioService;

@WebServlet("/ServletCliente")
public class ServletCliente extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public ServletCliente() {
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		getServletContext().getRequestDispatcher("/WEB-INF/views/formularioCliente.jsp").forward(request,response);
	}
	

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	  try 
	  {
		response.setContentType("text/html");

		//guardar parametros del formulario en variables.
		String nombre = request.getParameter("nombre");
		String rut = request.getParameter("rut");
		String direccion = request.getParameter("direccion");
		String email = request.getParameter("email");
		String fono = request.getParameter("fono");
		String password = request.getParameter("password");

		UsuarioService nuevoUsuario = new UsuarioService();
		nuevoUsuario.addUsuario(new Usuario(nombre, rut, direccion, email, fono, password, nombre, "", "cliente"));
		String okUsuario = "okUsuario";
		request.setAttribute("okUsuario", okUsuario);
		
		getServletContext().getRequestDispatcher("/WEB-INF/views/formularioCliente.jsp").forward(request,response);
	  }
	  catch(Exception e)
	  {
		  System.out.println("falla addUsuario: "+e);
	  }
	}
}


