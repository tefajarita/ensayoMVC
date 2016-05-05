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
			
			<jsp:include page="menu.jsp" />
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
			<c:forEach var="bar"   items="${barberInfo.barberosLista}">
		<div class="col-md-4">
			<h2>
				${barberInfo.bar['nombre']}
			</h2>
			<div>
				<img alt="211px" height="315px" src="<c:url value="${barberInfo.bar['fotoperfil']}" />" />
			</div>
			<blockquote>
			<p align="JUSTIFY">
			${barberInfo.bar['descripcion']}
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