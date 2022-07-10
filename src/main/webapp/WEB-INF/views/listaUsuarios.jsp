<%@page import="com.m5_sprint.model.Usuario" %>
<%@page import="com.m5_sprint.model.*" %>
<%@page import="java.util.ArrayList" %>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Modulo5_grupal1</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor" crossorigin="anonymous">
  </head>
  <body>  
  <%@ include file="/WEB-INF/views/navbar.jsp" %>
  <div class="container">
    <h1 class="text-center bg-info my-3">Listado de usuarios registrados</h1>
  	 <table class="table table-info table-striped">
	  <thead>
	    <tr>
	      <th scope="col">id</th>
	      <th scope="col">Nombre</th>
	      <th scope="col">Rut</th>
	      <th scope="col">Direccion</th>
	      <th scope="col">Email</th>
	      <th scope="col">Fono</th>
	      <th scope="col">Password</th>
	      <th scope="col">Estado</th>
	      <th scope="col">Acciones</th>
	    </tr>
	  </thead>
	  <tbody>  
		<%
		for(Usuario fila: (ArrayList<Usuario>)request.getAttribute("listaUsuarios")) {
		 %>
		 <tr>
			<td><%=fila.getId() %></td>
			<td><%=fila.getNombre() %></td>
			<td><%=fila.getRut() %></td>
			<td><%=fila.getDireccion() %></td>
			<td><%=fila.getEmail() %></td>
			<td><%=fila.getFono() %></td>
			<td><%=fila.getPassword() %></td>
			<td><%=fila.getEstado() %></td>
			<td>
			  <a href="${pageContext.request.contextPath}/ServletUpdateUser?id=<%=fila.getId()%>&estado=<%=fila.getEstado()%>">
				 Editar
			  </a>			
			</td>
		 </tr>
		 <%
	   }
	   %>		
	  </tbody>
	</table>
   </div>  

    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/js/bootstrap.bundle.min.js" integrity="sha384-pprn3073KE6tl6bjs2QrFaJGz5/SUsLqktiwsUTF55Jfv3qYSDhgCecCxMW52nD2" crossorigin="anonymous"></script>
  </body>
</html>