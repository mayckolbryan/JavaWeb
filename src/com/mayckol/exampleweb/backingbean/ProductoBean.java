/**
 * 
 */
package com.mayckol.exampleweb.backingbean;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.model.SelectItem;

import com.mayckol.exampleweb.modelo.Producto;
import com.mayckol.exampleweb.modelo.TipoProducto;

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
	private List<SelectItem> listaTipoProductos;
	
	public void inicializar() {
		this.listaProductos.add(new Producto(1, "Leche", "Duran bastante."));
		this.listaProductos.add(new Producto(2, "Bisteck", "Preparada."));
		this.listaProductos.add(new Producto(3, "Manzana", "Fruta roja."));
		
		this.listaTipoProductos.add(new SelectItem(1, "Lácteo"));
		this.listaTipoProductos.add(new SelectItem(2, "Carne"));
	}
	
	public ProductoBean() {
		this.listaProductos = new ArrayList<>();
		this.listaTipoProductos = new ArrayList<>();
		
		inicializar();
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
	
	public List<SelectItem> getListaTipoProductos() {
		return listaTipoProductos;
	}

	public void setListaTipoProductos(List<SelectItem> listaTipoProductos) {
		this.listaTipoProductos = listaTipoProductos;
	}

	public String guardarProducto() {
		return null;
	}
}
