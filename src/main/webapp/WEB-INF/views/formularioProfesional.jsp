<%@page import="com.m5_sprint.model.*" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Modulo5_grupal1</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor" crossorigin="anonymous">
  </head>
  <body class="text-white bg-primary">
           <%
	    String okUsuario = (String)request.getAttribute("okUsuario");
	    if ("okUsuario".equals(okUsuario)){
	  %>
		  <h3 class="text-center bg-danger">Usuario registrado</h3>
	  <% 
	     }
	    Usuario updateUser = (Usuario)request.getAttribute("updateUser");
	  %>
	  
     <div class="container ml-5 mt-3 pl-5">
	    <h1>Formulario Profesional</h1>
	    <form action="ServletProfesional" method="post">
	    
	      <div class="col-sm-10 col-md-8 mb-2">
		    <input type="hidden" class="form-control" id="id1" placeholder="id" 
		      name="id" value="${updateUser.getId()}" required >
		  </div>
		  
		  <div class="col-sm-10 col-md-8 mb-2">
		    <label for="name1" class="form-label">Nombre</label>
		    <input type="text" class="form-control" id="name1" placeholder="Empresa" 
		      name="nombre" pattern="[A-Za-z A-Za-z 0-9]+" value="${updateUser.getNombre()}" required >
		  </div>
		  
          	  <div class="col-sm-10 col-md-8 mb-2">
		    <label for="rut1" class="form-label">Rut</label>
		    <input type="tex" class="form-control" id="rut1"
		      placeholder="17456789-1" name="rut" pattern="[0-9]+\-[0-9]+" value="${updateUser.getRut()}" required>
		  </div>
		  
		  <div class="col-sm-10 col-md-8 mb-2">
		    <label for="direccion1" class="form-label">Dirección</label>
		    <input type="text" class="form-control" id="direccion1" placeholder="Los Carrera 100" 
		      name="direccion" pattern="[A-Za-z A-Za-z 0-9]+" value="${updateUser.getNombre()}" required>
		  </div>
		  
		  <div class="col-sm-10 col-md-8 mb-2">
		    <label for="email1" class="form-label">Email</label>
		    <input type="email" class="form-control" id="email1" placeholder="ventas@entel.com" 
	              name="email" value="${updateUser.getEmail()}" required >
		   </div>
		     	
		  <div class="col-sm-10 col-md-8 mb-2">
	    	    <label for="fono1" class="form-label">Fono</label>
	   	    <input type="tex" class="form-control" id="fono1" placeholder="915263625" 
		     name="fono" value="${updateUser.getFono()}" required >
	 	  </div>

	 	  <div class="col-sm-10 col-md-8 mb-2">
	    	    <label for="empresa1" class="form-label">Empresa</label>
	   	    <input type="text" class="form-control" id="empresa1" placeholder="Adalid" 
		      name="empresa" pattern="[A-Za-z]+" value="${updateUser.getEmpresa()}" required >
	 	  </div>
	 	  
	 	  <div class="col-sm-10 col-md-8 mb-2">
	    	    <label for="Experiencia1" class="form-label">Años de Experiencia</label>
	   	    <input type="text" class="form-control" id="Experiencia1" placeholder="5" 
		      name="experiencia" pattern="[0-9]+" value="${updateUser.getExperiencia()}" required >
	 	  </div>
	 	  
	 	  <div class="col-sm-10 col-md-8 mb-2">
	    	    <label for="exampleInputPassword1" class="form-label">Password</label>
	   	    <input type="password" class="form-control" id="exampleInputPassword1" placeholder="password" 
                       name="password" value="${updateUser.getPassword()}" required >
	 	  </div>	 	  
	 	 
	 	  <div class="col-sm-10 col-md-8 mb-2">
		    <button type="submit" class="btn btn-success mx-3">Enviar</button>
		     <button class="btn bg-secondary mx-3"> <a href="ServletHome" class="text-white text-decoration-none">Volver </a> </button>   		  
		  </div>
		  
		</form>
	   </div>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/js/bootstrap.bundle.min.js" integrity="sha384-pprn3073KE6tl6bjs2QrFaJGz5/SUsLqktiwsUTF55Jfv3qYSDhgCecCxMW52nD2" crossorigin="anonymous"></script>
  </body>
</html>l>