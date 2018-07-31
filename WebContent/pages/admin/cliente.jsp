<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Administración de Clientes</title>
</head>
<body>
	<jsp:useBean id="cliBean" class="com.mayckol.exampleweb.bean.ClienteBean" />
	<h3>Bienbenido: <jsp:getProperty property="nombre" name="cliBean"/> <jsp:getProperty property="apellido" name="cliBean"/> </h3>
	<jsp:setProperty property="nombre" name="cliBean"/>
</body>
</html>