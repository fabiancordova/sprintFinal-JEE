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
	    String okContacto = (String)request.getAttribute("okContacto");
	    if ("okContacto".equals(okContacto)){
	  %>
		  <h3 class="text-center bg-danger">Mensaje enviado</h3>
	  <% 
	     }
	  %>
  <div class="container ml-5 mt-3 pl-5">
  <h1>Contacto</h1>
    <form action="ServletContacto" method="post">
	  <div class="col-sm-10 col-md-8 mb-2">
	    <label for="name1" class="form-label">Nombre</label>
	    <input type="text" class="form-control" id="name1" aria-describedby="namelHelp"
	    placeholder="Nombre" name="nombre" pattern="[A-Za-z]+" required>
	   </div>
	  <div class="col-sm-10 col-md-8 mb-2">
	    <label for="apellido1" class="form-label">Apellido</label>
	    <input type="text" class="form-control" id="apellido1"
	    placeholder="apellido" name="apellido" pattern="[A-Za-z]+" required>
	  </div>	  
	  <div class="col-sm-10 col-md-8 mb-2">
		 <label for="email1" class="form-label">Email</label>
		 <input type="email" class="form-control" id="email1"
		   placeholder="juan@gmail.com" name="email" required >
	  </div>
	  <div class="col-sm-10 col-md-8 mb-2">
		 <label for="msg1" class="form-label">Mensaje</label>
		 <textarea class="form-control" aria-label="With textarea" placeholder="ingrese mensaje" name="mensaje"></textarea>
	  </div>	  	 
	   <button type="submit" class="btn btn-success mx-3">Enviar</button>
	   <button class="btn bg-secondary mx-3"> <a href="ServletHome" class="text-white text-decoration-none">Volver </a> </button>   		  
	</form>
	</div>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/js/bootstrap.bundle.min.js" integrity="sha384-pprn3073KE6tl6bjs2QrFaJGz5/SUsLqktiwsUTF55Jfv3qYSDhgCecCxMW52nD2" crossorigin="anonymous"></script>
  </body>
</html>