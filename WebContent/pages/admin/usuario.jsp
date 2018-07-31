<%@ page import="java.util.Date" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Administración de Usuarios.</title>
</head>
<body>
<%-- Tag Declaración --%>
<%! Date fechaActual = new Date(); %>
	<form action="">
		<fieldset>
			<legend>Datos Generales</legend>
			<table>
				<tr>
					<td><label>Rol: </label></td>
					<td>
						<select name="cbxRol">
							<option value="1">Administrador</option>
							<option value="2">Contador</option>
							<option value="3">Operador</option>
						</select>
					</td>
				</tr>
				<tr>
					<td><label>Nombre de Usuario: </label></td>
					<td><input name="txtUser" type="text"/></td>
				</tr>
				<tr>
					<td><label>Clave de Usuario: </label></td>
					<td><input name="txtPassword" type="text"/></td>
				</tr>
			</table>
		</fieldset>
		<br>
		<fieldset>
			<legend>Lista de Usuarios</legend>
			<table>
				<thead>
					<tr>
						<td>ID</td>
						<td>ROL</td>
						<td>NOMBRE</td>
						<td>CLAVE</td>
					</tr>
				</thead>
				<tbody>
					<%-- Scriptlets - Bloques de Código --%>
					<% for(int i = 0; i < 10; i++){ %>
					<tr>
						<%-- Expresión - Unir codigo java con html --%>
						<td><%= i %></td>
						<td>rol<%= i %></td>
						<td>nombre<%= i %></td>
						<td>clave<%= i %></td>
					</tr>
					<% } %>
				</tbody>
			</table>
		</fieldset>
		<br>
		<h4><%= fechaActual %></h4>
	</form>
</body>
</html>