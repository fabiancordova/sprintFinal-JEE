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
	    String okCapacitacion = (String)request.getAttribute("okCapacitacion");
	    if ("okCapacitacion".equals(okCapacitacion)){
	  %>
		  <h3 class="text-center bg-danger">Capacitacion registrada</h3>
	  <% 
	     }
	  %>
   <div class="container ml-5 mt-3 pl-5">
    <h1>Registar Capacitación</h1>
    <form action="ServletCapacitacion" method="post">
	  <div class="col-sm-10 col-md-8 mb-2">
	    <label for="name1" class="form-label">Nombre de la Capacitación</label>
	    <input type="text" class="form-control" id="name1" aria-describedby="namelHelp"
	    placeholder="Ingrese capacitación" name="nombre" pattern="[A-Za-z]+" required>
	  </div>
	  <div class="col-sm-10 col-md-8 mb-2">
	    <label for="fecha1" class="form-label">Fecha de la Capacitación</label>
	    <input type="date" class="form-control" id="fecha1"
	    placeholder="Ingrese fecha capacitación" name="fecha">
	  </div>
	  <div class="col-sm-10 col-md-8 mb-2">
	    <label for="hora1" class="form-label">Horario de la Capacitación</label>
	    <input type="time" class="form-control" id="hora1"
	    placeholder="Ingrese horario capacitación" name="hora">
	  </div>
	  <div class="col-sm-10 col-md-8 mb-2">
	    <label for="asistentes1" class="form-label">Número de asistentes a la Capacitación</label>
	    <input type="number" class="form-control" id="asistentes1"
	    placeholder="Ingrese cantidad" name="asistentes" required>
	  </div> 
	  <div class="col-sm-10 col-md-8 mb-2">
		 <button type="submit" class="btn btn-success mx-3">Enviar</button>
		 <button class="btn bg-secondary mx-3"> <a href="ServletHome" class="text-white text-decoration-none">Volver </a> </button>   		  
	  </div>
	</form>
	</div>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/js/bootstrap.bundle.min.js" integrity="sha384-pprn3073KE6tl6bjs2QrFaJGz5/SUsLqktiwsUTF55Jfv3qYSDhgCecCxMW52nD2" crossorigin="anonymous"></script>
  </body>
</html>