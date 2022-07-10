package com.m5_sprint.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.m5_sprint.model.Usuario;
import com.m5_sprint.services.UsuarioService;

@WebServlet("/ServletUpdateUser")
public class ServletUpdateUser extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private UsuarioService us = new UsuarioService();
	
    public ServletUpdateUser() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id");
		String estado = request.getParameter("estado");

		if (id == null) {
			request.setAttribute("listaUsuarios", us.getAllUsuario());
			getServletContext().getRequestDispatcher("/WEB-INF/views/listaUsuarios.jsp").forward(request, response);	
		} else {
			
			if (estado.equals("cliente")) {
								request.setAttribute("updateUser", us.getUsuario(Integer.parseInt(id)));
				getServletContext().getRequestDispatcher("/WEB-INF/views/formularioUpdateCliente.jsp").forward(request, response);
			}
			if (estado.equals("profesional")) {
				request.setAttribute("updateUser", us.getUsuario(Integer.parseInt(id)));
				getServletContext().getRequestDispatcher("/WEB-INF/views/formularioUpdateProfesional.jsp").forward(request, response);
			}
			if (estado.equals("administrativo")) {
				request.setAttribute("updateUser", us.getUsuario(Integer.parseInt(id)));
				getServletContext().getRequestDispatcher("/WEB-INF/views/formularioUpdateAdministrativo.jsp").forward(request, response);
			}
		}
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id");
		String nombre = request.getParameter("nombre");
		System.out.println("nombre en edituser post: "+ nombre+" "+id);
		
		String rut = request.getParameter("rut");
		String direccion = request.getParameter("direccion");
		String email = request.getParameter("email");
		String fono = request.getParameter("fono");
		String password = request.getParameter("password");

		try {
			UsuarioService updateUser = new UsuarioService();
			updateUser.update(new Usuario(Integer.parseInt(id),nombre, rut, direccion, email, fono, password, "empresa", "1", "cliente"));
			getServletContext().getRequestDispatcher("/WEB-INF/views/formularioCliente.jsp").forward(request,response);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("falla get update"+ e.getMessage());
		}

		
	}

}
