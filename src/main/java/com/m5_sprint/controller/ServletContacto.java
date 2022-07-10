package com.m5_sprint.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ServletContacto")
public class ServletContacto extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ServletContacto() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		getServletContext().getRequestDispatcher("/WEB-INF/views/formularioContacto.jsp").forward(request,response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	  try 
	  {
		String okContacto = "okContacto";
		request.setAttribute("okContacto", okContacto);
		String nombre = request.getParameter("nombre");		
		String apellido = request.getParameter("apellido");
		String email = request.getParameter("email");
		String mensaje = request.getParameter("mensaje");
		System.out.println("Datos del contacto:");
		System.out.println("nombre: "+ nombre+", apellido: "+apellido+", email: "+email);
		System.out.println("Nensaje: "+ mensaje);
		getServletContext().getRequestDispatcher("/WEB-INF/views/formularioContacto.jsp").forward(request,response);
	  }
	  catch(Exception e)
	  {
		  System.out.println("error: "+e);
	  }
	}

}
