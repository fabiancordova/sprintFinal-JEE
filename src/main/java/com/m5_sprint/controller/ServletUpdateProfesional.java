package com.m5_sprint.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.m5_sprint.model.Usuario;
import com.m5_sprint.services.UsuarioService;

@WebServlet("/ServletUpdateProfesional")
public class ServletUpdateProfesional extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private UsuarioService cs = new UsuarioService();
	
    public ServletUpdateProfesional() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id");
		String estado = request.getParameter("estado");

	
		if (id == null) {
			request.setAttribute("listaUsuarios", cs.getAllUsuario());
			getServletContext().getRequestDispatcher("/WEB-INF/views/listaUsuarios.jsp").forward(request, response);	
		} else {
			
			if (estado.equals("administrativo")) {
				request.setAttribute("country", cs.getUsuario(Integer.parseInt(id)));
				getServletContext().getRequestDispatcher("/WEB-INF/views/formularioUpdateProfesional.jsp").forward(request, response);				
			}
		}			
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id");
		String nombre = request.getParameter("nombre");

		String rut = request.getParameter("rut");
		String direccion = request.getParameter("direccion");
		String email = request.getParameter("email");
		String fono = request.getParameter("fono");
		String password = request.getParameter("password");
		String empresa = request.getParameter("empresa");
		String experiencia = request.getParameter("experiencia");
		try {
			String okUsuario = "okUsuario";
			request.setAttribute("okUsuario", okUsuario);
			UsuarioService updateUser = new UsuarioService();
			updateUser.update(new Usuario(Integer.parseInt(id), nombre, rut, direccion, email, fono, password, empresa, experiencia, "profesional"));

			getServletContext().getRequestDispatcher("/WEB-INF/views/formularioUpdateProfesional.jsp").forward(request,response);
			System.out.println(" no falla get updateUser");
		
		} 
		catch (Exception e) {
			e.printStackTrace();
			System.out.println("falla get updateUser"+ e.getMessage());
		}

		
	}

}
