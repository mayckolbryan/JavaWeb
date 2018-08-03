/**
 * 
 */
package com.mayckol.exampleweb.modelo;

import java.io.Serializable;

/**
 * @author laion
 *
 */
public class TipoProducto implements Serializable{
	private int idTipoProducto; 
	private String nombreTipoPro;
	private String descripcionTipoPro;
	
	public TipoProducto() {
	}

	public int getIdTipoProducto() {
		return idTipoProducto;
	}

	public void setIdTipoProducto(int idTipoProducto) {
		this.idTipoProducto = idTipoProducto;
	}

	public String getNombreTipoPro() {
		return nombreTipoPro;
	}

	public void setNombreTipoPro(String nombreTipoPro) {
		this.nombreTipoPro = nombreTipoPro;
	}

	public String getDescripcionTipoPro() {
		return descripcionTipoPro;
	}

	public void setDescripcionTipoPro(String descripcionTipoPro) {
		this.descripcionTipoPro = descripcionTipoPro;
	}
}
