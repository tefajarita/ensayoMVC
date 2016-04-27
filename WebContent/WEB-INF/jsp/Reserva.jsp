<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="http://code.jquery.com/ui/1.10.1/themes/base/jquery-ui.css" />
<script src="http://code.jquery.com/jquery-1.9.1.js"></script>
<script src="http://code.jquery.com/ui/1.10.1/jquery-ui.js"></script>
</head>
<body>
	<div>
		<table style="margin: 0 auto;border: 2px solid blue;font-family:arial;border-collapse: collapse;font-size: 20px;">
			<tr>
				<td colspan="3">
					<table>
						<tr>
							<td style="text-align: center;">Fecha</td>
							<td style="text-align: center;">Hora</td>
						</tr>
						<tr>
							<td><input type="text" id="datepicker"></td>
							<td><input type="text" value="" id="hora" /></td>
						</tr>
					</table>
				</td>
			</tr>
			<tr>
				<td>BARBERO 1</td>
				<td>BARBERO 2</td>
				<td>BARBERO 3</td>
			</tr>
			<tr>
				<td style="text-align:center;"><img src="" alt="barbero 1" onclick="barbero('1');" /></td>
				<td style="text-align:center;"><img src="" alt="barbero 2" onclick="barbero('2');" /></td>
				<td style="text-align:center;"><img src="" alt="barbero 3" onclick="barbero('3');" /></td>
			</tr>
			<tr>
				<td>&nbsp;</td>
				<td>&nbsp;</td>
				<td>&nbsp;</td>
			</tr>
			<tr>
				<td colspan="3" style="text-align: center;">
					<table>
						<tr>
							<input type="submit" value="Reservar" id="reserva" />
						</tr>
					</table>
				</td>
			</tr>
		</table>
	</div>
<script>
	$(function() {
		$( "#datepicker" ).datepicker(
			{ 
				dateFormat: 'dd/mm/yy',
				changeMonth: true,
				changeYear: true
			}
		);
	});
	
	function barbero(parametro){				
		return parametro;
	}
</script>
</body>
</html>