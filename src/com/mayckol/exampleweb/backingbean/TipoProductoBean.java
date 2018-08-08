/**
 * 
 */
package com.mayckol.exampleweb.backingbean;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import com.mayckol.exampleweb.modelo.TipoProducto;

/**
 * @author laion
 *
 */
@ManagedBean(name="tipoProductoBean")
@RequestScoped
public class TipoProductoBean {
	private String nombreTipoProducto;
	private String descripcionTipoProducto;
	private List<TipoProducto> listaTipoProductos;
	
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
	
	public List<TipoProducto> getListaTipoProductos() {
		return listaTipoProductos;
	}

	public void setListaTipoProductos(List<TipoProducto> listaTipoProductos) {
		this.listaTipoProductos = listaTipoProductos;
	}

	public String guardarTipoProducto() {
		return null;
	}
}
