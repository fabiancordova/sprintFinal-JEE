package com.m5_sprint.model;

public class Usuario {
	
	private int id;
	private String nombre;
	private String rut;
	private String direccion;
	private String email;
	private String fono;
	private String password;
	private String empresa;
	private String experiencia;
	private String estado;
	
	public Usuario() {
		
	}
	
	public Usuario(String nombre, String rut, String direccion, String email, String fono, String password, String empresa, String experiencia, String estado) {
		super();
		this.nombre = nombre;
		this.rut = rut;
		this.direccion = direccion;
		this.email = email;
		this.fono = fono;
		this.password = password;
		this.empresa = empresa;
		this.experiencia = experiencia;
		this.estado = estado;
		//this.id = ++count;
	}
	
	public Usuario(int id, String nombre, String rut, String direccion, String email, String fono, String password,  String empresa, String experiencia, String estado) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.rut = rut;
		this.direccion = direccion;
		this.email = email;
		this.fono = fono;
		this.password = password;
		this.empresa = empresa;
		this.experiencia = experiencia;
		this.estado = estado;
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
	
	public String getRut() {
		return rut;
	}
	
	public void setRut(String rut) {
		this.rut = rut;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFono() {
		return fono;
	}

	public void setFono(String fono) {
		this.fono = fono;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getEmpresa() {
		return empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}

	public String getExperiencia() {
		return experiencia;
	}

	public void setExperiencia(String experiencia) {
		this.experiencia = experiencia;
	}

}

