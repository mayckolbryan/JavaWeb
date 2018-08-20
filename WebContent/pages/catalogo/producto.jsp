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
				<h:commandButton value="#{inter.btnNuevo}"></h:commandButton>
				<h:commandButton value="#{inter.btnGuardar}" action="#{productoBean.guardarProducto}"></h:commandButton>
				<h:commandButton value="#{inter.btnBuscar}"></h:commandButton>
			</h:panelGrid>
			<h:panelGrid border="1" columns="2">
				<f:facet name="header">
					<h:outputLabel value="Administracion Producto"></h:outputLabel>
				</f:facet>				
				<h:outputText value="Tipo Producto: "></h:outputText>
				<h:selectOneMenu id="tipoProducto">
					<f:selectItem itemLabel="Viveres" itemValue="1"/>
					<f:selectItem itemLabel="Electrodomésticos" itemValue="2"/>
					<f:selectItems value="#{productoBean.listaTipoProductos}"/>
				</h:selectOneMenu>
				<%-- <h:message for="tipoProducto" /> --%>
				<h:outputText value="Nombre: "></h:outputText>
				<h:inputText id="txtNomCatalogo" value="#{productoBean.nombreProducto}" required="true" 
					requiredMessage="El nombre es obligatorio."	validatorMessage="#{inter.longitudNombre}">
					<f:validateLength minimum="3" maximum="10" />
				</h:inputText>
				<h:outputText value="Description: "></h:outputText>
				<h:inputTextarea id="txtDescCatalogo" value="#{productoBean.descripcionProducto}"/>
				<h:outputText value="Fecha Caducidad: "></h:outputText>
				<h:inputText id="txtFecCadPro" value="#{productoBean.fechaCadPro}" converterMessage="#{inter.fechaIncorrecta}">
					<f:convertDateTime pattern="yyyy/MM/dd"/>
				</h:inputText>
			</h:panelGrid>
			<h:messages style="color:red;" />
			<br>
			<h:dataTable id="dtblTipoProducto" border="1" value="#{productoBean.listaProductos}" var="producto">
				<f:facet name="header">
					<h:outputLabel value="Lista de Productos"></h:outputLabel>
				</f:facet>
				<h:column>
					<f:facet name="header">
						<h:outputLabel value="Id"/>
					</f:facet>
					<h:outputLabel value="#{producto.idProducto}" />
				</h:column>
				<h:column>
					<f:facet name="header">
						<h:outputLabel value="Nombre"/>
					</f:facet>
					<h:outputLabel value="#{producto.nombreProducto}" />
				</h:column>
				<h:column>
					<f:facet name="header">
						<h:outputLabel value="Descripción"/>
					</f:facet>
					<h:outputLabel value="#{producto.descripcionProducto}" />
				</h:column>
			</h:dataTable>
		</h:form>
	</f:view>
</body>
</html>