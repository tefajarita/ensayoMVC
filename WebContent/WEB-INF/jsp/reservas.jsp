<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
  <head>
    
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <title>Santy BarberShop</title>

    <meta name="description" content="Source code generated using layoutit.com">
    <meta name="author" content="LayoutIt!">

    <link href="css/bootstrap.min.css" rel="stylesheet">
    <link href="css/style.css" rel="stylesheet">
	 <link href="css/estilos.css" rel="stylesheet">
	<script type="text/javascript" charset="UTF-8" src="https://maps.googleapis.com/maps-api-v3/api/js/24/2/intl/es_ALL/common.js"></script>
	<script type="text/javascript" charset="UTF-8" src="https://maps.googleapis.com/maps-api-v3/api/js/24/2/intl/es_ALL/util.js"></script>
	<script type="text/javascript" charset="UTF-8" src="https://maps.googleapis.com/maps-api-v3/api/js/24/2/intl/es_ALL/geocoder.js"></script>
	<script type="text/javascript" charset="UTF-8" src="https://maps.googleapis.com/maps-api-v3/api/js/24/2/intl/es_ALL/map.js"></script>
	<script type="text/javascript" charset="UTF-8" src="https://maps.googleapis.com/maps-api-v3/api/js/24/2/intl/es_ALL/onion.js"></script>
	<script type="text/javascript" charset="UTF-8" src="https://maps.googleapis.com/maps-api-v3/api/js/24/2/intl/es_ALL/marker.js"></script>
	<script type="text/javascript" charset="UTF-8" src="https://maps.googleapis.com/maps-api-v3/api/js/24/2/intl/es_ALL/controls.js"></script>
	<script type="text/javascript" charset="UTF-8" src="https://maps.googleapis.com/maps-api-v3/api/js/24/2/intl/es_ALL/stats.js"></script>
  </head>
  <body>

    <div class="container-fluid">
	<div class="row">
		<div class="col-md-12">
			<img height="100%" src="imagenes/logo_banner.png" />
			
			<jsp:include page="menu.jsp" />
			<div align="center"><img width="30%"  src="imagenes/border-bg.png"/></div></br>
			<div class="jumbotron">
				<h3>
					CITAS
				</h3>
				<p>
					↓ DA CLICK EN LA NAVAJA Y RESERVA TU CITA EN 4 SENCILLOS PASOS. ↓
					*AUNQUE LA CITA NO ES OBLIGATORIA, SÍ ES LO MÁS RECOMENDABLE
				</p>				
			</div>			
			</br>
			</br>
			</br>
			</br>
			</br>	
			<div id="CitasNavaja">
			<form action="citas.html"  method="Post">
						
							
							<input type="image" name="image" src="imagenes/razon.png" width="250px" align="center" >
						
			</form>
			</div>
		</div>
	</div>
</div>
</div>
<footer>
  <p>&copy; 2015 SantyBarberShop.com<p>
</footer>

    <script src="js/jquery.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
    <script src="js/scripts.js"></script>
  </body>
</html>