package com.m5_sprint.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.m5_sprint.services.UsuarioService;

@WebServlet("/ServletHome")
public class ServletHome extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public ServletHome() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		getServletContext().getRequestDispatcher("/WEB-INF/views/home.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	  try 
	  {
		response.setContentType("text/html");		
		String rut = request.getParameter("rut");
		String password = request.getParameter("password");
				
		//Validar la existencia de rut y password en la BD
		UsuarioService loginUser = new UsuarioService();
		
		if (loginUser.validar(rut, password)) {

			getServletContext().getRequestDispatcher("/WEB-INF/views/home.jsp").forward(request,response);
		} else {
			String noLogin = "noLogin";
			request.setAttribute("msgnoLogin", noLogin);
			getServletContext().getRequestDispatcher("/WEB-INF/views/index.jsp").forward(request,response);
		}
	  }
	  catch(Exception e)
	  {
		  System.out.println(e);
	  }
	}	
}

