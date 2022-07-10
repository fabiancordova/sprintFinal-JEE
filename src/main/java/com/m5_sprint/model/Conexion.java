package com.m5_sprint.model;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {
	
	private static Connection conexion;
	
	private Conexion() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/empresa_asesoria", "root", "admin");
			
			System.out.println("existe");
		}
		catch (Exception e) {
			 System.out.println("no existe");
		}
	}
	
	public static Connection getInstance() {
		
		if(conexion == null) {	
			new Conexion();
		}		
		return conexion;
	}
	

}
