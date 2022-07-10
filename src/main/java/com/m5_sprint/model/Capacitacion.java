package com.m5_sprint.model;

public class Capacitacion {
	
	public static int count = 0;
	private int id;
	private String nombre;
	private String fecha;
	private String hora;
	private String asistentes;
	
	public Capacitacion(String nombre, String fecha, String hora, String asistentes) {
		
		this.nombre = nombre;
		this.fecha = fecha;
		this.hora = hora;
		this.asistentes = asistentes;
	}
	
	public Capacitacion(int id, String nombre, String fecha, String hora, String asistentes) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.fecha = fecha;
		this.hora = hora;
		this.asistentes = asistentes;
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

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getAsistentes() {
		return asistentes;
	}

	public void setAsistentes(String asistentes) {
		this.asistentes = asistentes;
	}

	public String getHora() {
		return hora;
	}

	public void setHora(String hora) {
		this.hora = hora;
	}	
}
