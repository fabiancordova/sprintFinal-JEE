package com.m5_sprint.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.m5_sprint.model.Capacitacion;
import com.m5_sprint.services.CapacitacionService;

@WebServlet("/ServletListaCapacitaciones")
public class ServletListaCapacitaciones extends HttpServlet {
	private static final long serialVersionUID = 1L;


    public ServletListaCapacitaciones() {
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		CapacitacionService listaCapacitacion = new CapacitacionService();
		ArrayList<Capacitacion> listaCapacitaciones = (ArrayList<Capacitacion>)listaCapacitacion.getAllCapacitacion();
		
		request.setAttribute("capacitaciones", listaCapacitaciones);
			
		getServletContext().getRequestDispatcher("/WEB-INF/views/listaCapacitaciones.jsp").forward(request,response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
