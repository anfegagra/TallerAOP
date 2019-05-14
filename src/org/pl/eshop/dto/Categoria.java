/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.pl.eshop.dto;

/**
 *
 * @author andres.granados
 */
public class Categoria {

	private Integer id;
	private String nombre;
	private String descripcion;

	public Categoria() {
		nombre = "";
	}

	public Categoria(Integer id, String nombre, String descripcion) {
		this.id = id;
		this.nombre = nombre;
		this.descripcion = descripcion;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		if (id <= 0 || id == null)
			throw new IllegalArgumentException("El id debe ser positivo");
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		if (nombre.equals("") || nombre.length() < 3) {
			throw new IllegalArgumentException("El nombre debe tener al menos tres caracteres");
		}
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
}
