package com.m5_sprint.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.m5_sprint.model.*;
import com.m5_sprint.services.CapacitacionService;

@WebServlet("/ServletCapacitacion")
public class ServletCapacitacion extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public ServletCapacitacion() {
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		getServletContext().getRequestDispatcher("/WEB-INF/views/formularioCapacitacion.jsp").forward(request,response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	  try 
	  {
		response.setContentType("text/html");
			
		String nombre = request.getParameter("nombre");
		String fecha = request.getParameter("fecha");
		String hora = request.getParameter("hora");
		String asistentes = request.getParameter("asistentes");
	
		CapacitacionService nuevaCapacitacion = new CapacitacionService();
		nuevaCapacitacion.addCapacitacion(new Capacitacion(nombre, fecha, hora, asistentes));

		//habilitar mensaje en registro.jsp
		String okCapacitacion = "okCapacitacion";
		request.setAttribute("okCapacitacion", okCapacitacion);
		getServletContext().getRequestDispatcher("/WEB-INF/views/formularioCapacitacion.jsp").forward(request,response);
	  }
	  catch(Exception e)
	  {
		  System.out.println(e);
	  }
	}

}


