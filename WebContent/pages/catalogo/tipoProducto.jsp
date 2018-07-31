<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="f"  uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h"  uri="http://java.sun.com/jsf/html"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Administración Producto</title>
</head>
<body>
	<f:view>
		<h:form>
			<h:panelGrid border="1" columns="3">
				<h:commandButton value="Nuevo"></h:commandButton>
				<h:commandButton value="Guardar" action="#{tipoProductoBean.guardarTipoProducto}"></h:commandButton>
				<h:commandButton value="Buscar"></h:commandButton>
			</h:panelGrid>
			<h:panelGrid border="1" columns="2">
				<f:facet name="header">
					<h:outputLabel value="Administracion Tipo Producto"></h:outputLabel>
				</f:facet>
				<h:outputText value="Nombre: "></h:outputText>
				<h:inputText id="txtNomCatalogo" value="#{tipoProductoBean.nombreTipoProducto}"/>
				<h:outputText value="Description: "></h:outputText>
				<h:inputTextarea id="txtDescCatalogo" value="#{tipoProductoBean.descripcionTipoProducto}"/>
			</h:panelGrid>
			<br>
			<h:dataTable id="dtblTipoProducto" border="1">
				<f:facet name="header">
					<h:outputLabel value="Lista de Productos"></h:outputLabel>
				</f:facet>
				<h:column>
					<h:outputLabel value="Id"></h:outputLabel>
				</h:column>
				<h:column>
					<h:outputLabel value="Nombre"></h:outputLabel>
				</h:column>
				<h:column>
					<h:outputLabel value="Descripción"></h:outputLabel>
				</h:column>
			</h:dataTable>
		</h:form>
	</f:view>
</body>
</html>