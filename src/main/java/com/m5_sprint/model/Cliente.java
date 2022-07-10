package com.m5_sprint.model;

public class Cliente {
	
	private int id;
	private String nombre;
	private String rut;
	private String direccion;
	private String email;
	private String fono;
	
	public Cliente(String nombre, String rut, String direccion, String email, String fono) {
		super();
		this.nombre = nombre;
		this.rut = rut;
		this.direccion = direccion;
		this.email = email;
		this.fono = fono;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getRut() {
		return rut;
	}

	public void setRut(String rut) {
		this.rut = rut;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFono() {
		return fono;
	}

	public void setFono(String fono) {
		this.fono = fono;
	}	
}
