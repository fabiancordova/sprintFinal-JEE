package com.m5_sprint.model;

public class Profesional {
	
	private int id;
	private String nombre;
	private String rut;
	private String direccion;
	private String email;
	private String fono;
	private String empresa;
	private int aniosExperiencia;
	
	public Profesional(int id, String nombre, String rut, String direccion, String email, String fono, String empresa, int aniosExperiencia) {
		super();
		this.id = id;
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

	public String getEmpresa() {
		return empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}

	public int getAniosExperiencia() {
		return aniosExperiencia;
	}

	public void setAniosExperiencia(int aniosExperiencia) {
		this.aniosExperiencia = aniosExperiencia;
	}	
}
