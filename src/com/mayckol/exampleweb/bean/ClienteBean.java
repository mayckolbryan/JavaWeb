/**
 * 
 */
package com.mayckol.exampleweb.bean;

import java.util.List;

/**
 * @author laion
 *
 */
public class ClienteBean {
	
	private String nombre;
	private String apellido;
	private List<String> valores;
	
	public ClienteBean() {
		this.nombre = "Mayckol";
		this.apellido = "Reyes";
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public List<String> getValores() {
		return valores;
	}

	public void setValores(List<String> valores) {
		this.valores = valores;
	}
	
}
