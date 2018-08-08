/**
 * 
 */
package com.mayckol.exampleweb.backingbean;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import com.mayckol.exampleweb.modelo.Producto;

/**
 * @author laion
 *
 */
@ManagedBean(name="productoBean")
@RequestScoped
public class ProductoBean {
	private int idProducto;
	private String nombreProducto;
	private String descripcionProducto;
	private List<Producto> listaProductos;
	
	public ProductoBean() {
		this.listaProductos = new ArrayList<>();
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

	public List<Producto> getListaProductos() {
		return listaProductos;
	}

	public void setListaProductos(List<Producto> listaProductos) {
		this.listaProductos = listaProductos;
	}
	
	public String guardarProducto() {
		return null;
	}
}
