/**
 * 
 */
package com.mayckol.exampleweb.backingbean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 * @author laion
 *
 */
@ManagedBean(name="tipoProductoBean")
@RequestScoped
public class TipoProductoBean {
	private String nombreTipoProducto;
	private String descripcionTipoProducto;
	
	private TipoProductoBean() {
	}

	public String getNombreTipoProducto() {
		return nombreTipoProducto;
	}

	public void setNombreTipoProducto(String nombreTipoProducto) {
		this.nombreTipoProducto = nombreTipoProducto;
	}

	public String getDescripcionTipoProducto() {
		return descripcionTipoProducto;
	}

	public void setDescripcionTipoProducto(String descripcionTipoProducto) {
		this.descripcionTipoProducto = descripcionTipoProducto;
	}
	
	public String guardarTipoProducto() {
		return null;
	}
}
