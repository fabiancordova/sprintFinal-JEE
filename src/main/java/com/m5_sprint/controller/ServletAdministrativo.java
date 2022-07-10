package com.m5_sprint.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.m5_sprint.model.*;
import com.m5_sprint.services.UsuarioService;

@WebServlet("/ServletAdministrativo")
public class ServletAdministrativo extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public ServletAdministrativo() {
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		getServletContext().getRequestDispatcher("/WEB-INF/views/formularioAdministrativo.jsp").forward(request,response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	  try 
	  {
		response.setContentType("text/html");
		String nombre = request.getParameter("nombre");
		String rut = request.getParameter("rut");
		String direccion = request.getParameter("direccion");
		String email = request.getParameter("email");
		String fono = request.getParameter("fono");
		String password = request.getParameter("password");
		String empresa = request.getParameter("empresa");
		String experiencia = request.getParameter("experiencia");

		UsuarioService nuevoUsuario = new UsuarioService();
		nuevoUsuario.addUsuario(new Usuario(nombre, rut, direccion, email, fono, password, empresa, experiencia, "administrativo"));
		String okUsuario = "okUsuario";
		request.setAttribute("okUsuario", okUsuario);
		
		getServletContext().getRequestDispatcher("/WEB-INF/views/formularioAdministrativo.jsp").forward(request,response);
	  }
	  catch(Exception e)
	  {
		  System.out.println("falla addUsuario"+ e.getMessage());
	  }
	}
}


