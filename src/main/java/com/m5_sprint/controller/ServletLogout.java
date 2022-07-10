package com.m5_sprint.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/ServletLogout")
public class ServletLogout extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public ServletLogout() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	  try 
	  {	
		HttpSession sesion = request.getSession(true);
        
        //Cerrar sesion
        sesion.invalidate();
        
        request.setAttribute("message", "Sesión finalizada");
        
        //Redirecciono al root
		getServletContext().getRequestDispatcher("/").forward(request,response);
	  }
	  catch(Exception e)
	  {
		  System.out.println(e);
	  }
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
