<%@page import="com.m5_sprint.model.Usuario" %>
<%@page import="com.m5_sprint.model.*" %>
<%@page import="java.util.ArrayList" %>
<%@page import="javax.swing.JOptionPane" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Modulo5_grupal1</title>
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor" crossorigin="anonymous">
</head>
<body class="bg-primary text-white">
  
   <%
    if ("Sesión finalizada".equals(request.getAttribute("message"))) {	
  %>
	<h5 class="text-center bg-danger"> <%= request.getAttribute("message")%> </h5>
  <%
    }
  %>
  
  <%
    String noLogin = (String)request.getAttribute("msgnoLogin");
    if ("noLogin".equals(noLogin)) {	
  %>
	<h5 class="text-center bg-danger">RUT  y password incorrecta, o falta registrarse</h5>
  <%
    }
  %>	  
  <div class="container m-5">
    <h1 class="text-center">Empresa de Asesorías en Prevención de Riesgos</h1>
     <div class=" m-5">
	    <form action="ServletHome" method="post">
		    <div class="row justify-content-center">
			  <div class="col-4 mb-2">
			    <label for="rut1" class="form-label">Rut</label>
			    <input type="text" class="form-control" id="rut1" aria-describedby="rutHelp"
			    placeholder="Ingrese RUT" name="rut" >
			  </div>
			  <div class="col-4 mb-2">
			    <label for="password1" class="form-label">Password</label>
			    <input type="password" class="form-control" id="password1"
			    placeholder="Ingrese password" name="password">
		      </div>
			 </div> 
			 <div class="text-center">
			  <button type="submit" class="btn btn-secondary mx-5">Ingresar</button>
			 </div>
		</form>
	   </div>
	</div>
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/js/bootstrap.bundle.min.js" integrity="sha384-pprn3073KE6tl6bjs2QrFaJGz5/SUsLqktiwsUTF55Jfv3qYSDhgCecCxMW52nD2" crossorigin="anonymous"></script>
</body>
</html>