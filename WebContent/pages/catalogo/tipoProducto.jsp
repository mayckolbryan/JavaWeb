<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="f"  uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h"  uri="http://java.sun.com/jsf/html"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Administración Tipo Producto</title>
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
				<h:inputText id="txtNomCatalogo" value="#{tipoProductoBean.nombreTipoProducto}">
					<f:validator validatorId="vldTamanio"/>
				</h:inputText>
				<h:outputText value="Description: "></h:outputText>
				<h:inputTextarea id="txtDescCatalogo" converter="cvtMayuscula" 
					value="#{tipoProductoBean.descripcionTipoProducto}">
					<%-- <f:converter converterId="cvtMayuscula"/> --%>
				</h:inputTextarea>
			</h:panelGrid>
			<br>
			<h:messages/>
			<br>
			<h:dataTable id="dtblTipoProducto" border="1" value="#{tipoProductoBean.listaTipoProductos}" var="tipoProducto">
				<f:facet name="header">
					<h:outputLabel value="Lista de Productos"></h:outputLabel>
				</f:facet>
				<h:column>
					<f:facet name="header">
						<h:outputLabel value="Id"/>
					</f:facet>
					<h:outputLabel value="#{tipoProducto.idTipoProducto}" />
				</h:column>
				<h:column>
					<f:facet name="header">
						<h:outputLabel value="Nombre"/>
					</f:facet>
					<h:outputLabel value="#{tipoProducto.nombreTipoPro}" />
				</h:column>
				<h:column>
					<f:facet name="header">
						<h:outputLabel value="Descripción"/>
					</f:facet>
					<h:outputLabel value="#{tipoProducto.descripcionTipoPro}" />
				</h:column>
			</h:dataTable>
		</h:form>
	</f:view>
</body>
</html>