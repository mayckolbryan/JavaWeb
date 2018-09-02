/**
 * 
 */
package com.mayckol.exampleweb.convertidor;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

/**
 * @author laion
 *
 */
@FacesConverter("cvtMayuscula")
public class ConvertidorMayuscula implements Converter{
	
	//Sirve para obtener de la vista y poder almacenarlo en la Base de Datos
	@Override
	public Object getAsObject(FacesContext contexto, UIComponent componente, String valor) {
		// TODO Auto-generated method stub
		String valorCon = null;
		if (valor != null && !valor.equals("")) {
			valorCon = valor.toUpperCase();
		}
		else {
			valorCon = "ACTUALIZAR";
		}
		return valorCon;
	}

	//Sirve para obtener de la Base de Datos y poder mostrarlo en la vista
	@Override
	public String getAsString(FacesContext contexto, UIComponent componente, Object valor) {
		// TODO Auto-generated method stub
		String valorCon = null;
		if (valor != null && !valor.equals("")) {
			valorCon = valor.toString().toUpperCase();
		}
		else {
			valorCon = "ACTUALIZAR";
		}
		return valorCon;
	}
	
}
