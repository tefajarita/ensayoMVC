<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page session="false" %>
<!DOCTYPE html>
<html lang="en">
  <head>
    
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
  
	  <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
	  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.0/jquery.min.js"></script>
	  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
		<title>Santy BarberShop</title>


	
    <link href="resources/css/bootstrap.min.css" rel="stylesheet">
    <link href="resources/css/style.css" rel="stylesheet">

  </head>
  <body>

    <div class="container-fluid">
	<div class="row">
		<div class="col-md-12">
		
				<img width="100%" height="100%" src="<c:url value="${informacion.imagen1['imagePath']}" />"   /> 
           	
				<jsp:include page="menu.jsp" />

			<div align="center"><img width="30%" height="100%" src="<c:url value="${informacion.imagen2['imagePath']}" />"   /> </div><BR>
			<div class="jumbotron">
				<h2>
					<c:out value="${informacion.quien[0]}"/> 
				</h2>
				<p>
					<c:out value="${informacion.quien[1]}"/> 
				</p>
				<p>
					<c:out value="${informacion.quien[2]}"/> 
				</p>
			</div>
			
			<div class="jumbotron">
				<h2>
					<c:out value="${informacion.imagen3['tittle']}"/>
				</h2>
				<p align="center">
				<img width="100%" height="100%" src="<c:url value="${informacion.imagen3['imagePath']}" />"   /> </p>	
					  <div class="panel-group" id="accordion">
    <div class="panel panel-default">
      <div class="panel-heading">
        <h4 class="panel-title">
          <a data-toggle="collapse" data-parent="#accordion" href="#collapse1">${informacion.afectado} </a>
        </h4>
      </div>
      <div id="collapse1" class="panel-collapse collapse in">
        <div class="panel-body">
				<c:forEach var="text" begin="1"  items="${informacion.textos}">
						
								<p>${text}</p><br>
														
						
						</c:forEach>
			
			
		</div>
      </div>
    </div>
    <div class="panel panel-default">
      <div class="panel-heading">
        <h4 class="panel-title">
          <a data-toggle="collapse" data-parent="#accordion" href="#collapse2"><c:out value="${informacion.recortes}"/> </a>
        </h4>
      </div>
      <div id="collapse2" class="panel-collapse collapse">
        <div class="panel-body">
			<c:forEach var="text" begin="1"  items="${informacion.textos1}">
						
								<p>${text}</p><br>
														
						
						</c:forEach>
		</div>
      </div>
    </div>
    <div class="panel panel-default">
      <div class="panel-heading">
        <h4 class="panel-title">
          <a data-toggle="collapse" data-parent="#accordion" href="#collapse3"><c:out value="${informacion.recortes1}"/></a>
        </h4>
      </div>
      <div id="collapse3" class="panel-collapse collapse">
        <div class="panel-body">
	<c:forEach var="text" begin="1"  items="${informacion.textos1}">
						
								<h3>${text}</h3><br>
														
						
						</c:forEach>
		</div>
      </div>
    </div>
  </div> 

			</div>
		</div>
	</div>
</div>

<footer>
  <p>&copy; 2016 SantyBarberShop.com<p>
</footer>

    <script src="resources/js/jquery.min.js"></script>
    <script src="resources/js/bootstrap.min.js"></script>
    <script src="resources/js/scripts.js"></script>
  </body>
</html>