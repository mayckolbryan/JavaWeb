/**
 * 
 */
package com.mayckol.exampleweb.modelo;

/**
 * @author laion
 *
 */
public class Producto {
	private int idProducto;
	private String nombreProducto;
	private String descripcionProducto;
	
	public Producto() {
		
	}

	public int getIdProducto() {
		return idProducto;
	}

	public void setIdProducto(int idProducto) {
		this.idProducto = idProducto;
	}

	public String getNombreProducto() {
		return nombreProducto;
	}

	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}

	public String getDescripcionProducto() {
		return descripcionProducto;
	}

	public void setDescripcionProducto(String descripcionProducto) {
		this.descripcionProducto = descripcionProducto;
	}
}
