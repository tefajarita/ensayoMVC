<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ page session="false" %>
<!DOCTYPE html>
<html lang="en">
  <head>
    
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <title>Santy BarberShop</title>


    <link href="resources/css/bootstrap.min.css" rel="stylesheet">
    <link href="resources/css/style.css" rel="stylesheet">
	<link href="resources/css/estiloContacto.css" rel="stylesheet">
	
  </head>
  <body>
 <div class="container-fluid">
	<div class="row">
		<div class="col-md-12">
				<img width="100%" height="100%" src="<c:url value="${imagen1['imagePath']}" />"   /> 
			
			<jsp:include page="menu.jsp" />
		</div>
	</div>
	
			<div align="center"><img width="30%" height="100%" src="<c:url value="${imagen2['imagePath']}" />"   /></div><br>
			
 </div>  
 
 <div class="row">
 <div class="col-xs-6">
 <form action="contactar" method="post">
					<table>
						<tr>
							<td>Nombre:</td>
							<td><input type="text" name="nombre"/></td><br>
						</tr>
						
						<tr>
							<td>Apellido:</td>
							<td><input type="text" name="apellido"/></td><br>
						</tr>
						<tr>
							<td>Celular:</td>
							<td><input type="text" name="celular"/></td><br>
						</tr>
						
						<tr>
						<td><input type="submit" value="Enviar"/> </td>
						</tr>
						
					</table>
			</form>
 </div>
 <div class="row">
			<c:forEach var="con"   items="${contactoInfo.ListContacto}">
		<div class="col-md-4">
			<h2>
				${con['nombre']}
			</h2>
			<h2>
				${con['direccion']}
			</h2>
			<h2>
				${con['telefono']}
			</h2>
			<h2>
				${con['descripcion']}
			</h2>
			<h2>
				${con['horario']}
			</h2>
			
			
			<blockquote>
			<p align="JUSTIFY">
			${con['descripcion']}
			</p>
			</blockquote>
		</div>
		</c:forEach>
	
	</div>
  <div class="col-xs-6">
   	<!--inserto el mapa para la ubicación de la surcursal principal -->
				<div id="map">
				</div>
				<script src="https://maps.googleapis.com/maps/api/js?callback=init" async defer></script>

				<script type="text/javascript">
			var map;
			var marker;
			function init(){
			var iconBase= new google.maps.MarkerImage('resources/imagenes/logo2.png', new google.maps.Size(30,38));
			 var maOptions={
				center: new google.maps.LatLng(6.3369954,-75.5638334),
				zoom:15,
				mapTypeId: google.maps.MapTypeId.ROADMAP
			 }	
			 map= new google.maps.Map(document.getElementById("map"),maOptions);			 
			 var place= new google.maps.LatLng(6.3369954,-75.5638334);
			 
			 marker= new google.maps.Marker({
				position: place,
				title:"SantyBarberShop",				
				map:map,
				icon:iconBase
			 });
			 google.maps.event.addListener(marker,"click",showInfo);
			}
			
			
			function showInfo(){
				map.setZoom(16);
				map.setCenter(marker.getPosition());
				var infowindow =  new google.maps.InfoWindow({
					content:"SantyBarberShop el ritual del hombre"
				});			
				infowindow.open(map.marker);
			}
		
	</script>
  
 </div>
 </div>
 

<footer>
  <p>&copy; 2016 SantyBarberShop.com<p>
</footer>
			
	
</body>

    <script src="resources/js/jquery.min.js"></script>
    <script src="resources/js/bootstrap.min.js"></script>
    <script src="resources/js/scripts.js"></script>
  </body>
</html>