<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <title>Santy BarberShop</title>

   

    <link href="resources/css/bootstrap.min.css" rel="stylesheet">
    <link href="resources/css/style.css" rel="stylesheet">

  </head>
  <body>

    <div class="container-fluid">
	<div class="row">
		<div class="col-md-12">
				<img width="100%" height="100%" src="<c:url value="${imagen1['imagePath']}" />"   /> 
			
			<nav class="navbar navbar-default" role="navigation">
			
				<div class="navbar-header">
					 
					<button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
						 <span class="sr-only">Toggle navigation</span><span class="icon-bar"></span><span class="icon-bar"></span><span class="icon-bar"></span>
					</button>  <a>
								<form method="POST" action="index">
									<input type="submit" value="NOSOTROS">
								</form></a>
				</div>
				
				<div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
					<ul class="nav navbar-nav">
					
						<li >
								<a>
								<form method="POST" action="servicios">
									<input type="submit" value="SERVICIOS">
								</form>
							</a>
						</li>
						<li>
								<a>
								<form method="POST" action="barberos">
									<input type="submit" value="BARBEROS">
								</form>
							</a>
						</li>
						
						<li>
								<a>
								<form method="POST" action="reservas">
									<input type="submit" value="RESERVAS">
								</form>
							</a>
						</li>
						<li>
								<a>
								<form method="POST" action="empleados">
									<input type="submit" value="EMPLEADOS">
								</form>
							</a>
						</li>
						
						
						<li>
							<a>
								<form method="POST" action="contacto">
									<input type="submit" value="contacto">
								</form>
							</a>
						</li>
						
						
					</ul>
				
				
				</div>
				
			</nav>
			<div align="center"><img width="30%"  src="<c:url value="${imagen2['imagePath']}" />" /></div></br>
			<div class="jumbotron">
				<h3>
					<c:out value="${nuestros[0]}"/>
				</h3>
				<p>
					<c:out value="${nuestros[1]}"/>Äù
				</p>				
			</div>
			
			<div class="row">
			<c:forEach var="bar"   items="${barberosLista}">
		<div class="col-md-4">
			<h2>
				${bar['nombre']}
			</h2>
			<div>
				<img alt="211px" height="315px" src="<c:url value="${bar['fotoperfil']}" />" />
			</div>
			<blockquote>
			<p align="JUSTIFY">
			${bar['descripcion']}
			</p>
			</blockquote>
		</div>
		</c:forEach>
	
	</div>
</div>
			
		</div>
	</div>



    <script src="resources/js/jquery.min.js"></script>
    <script src="resources/js/bootstrap.min.js"></script>
    <script src="resources/js/scripts.js"></script>
  </body>
</html>