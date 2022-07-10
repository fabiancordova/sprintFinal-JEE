package com.m5_sprint.model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.m5_sprint.interfaces.ICapacitacionDAO;

public class MySQLCapacitacionDAO implements ICapacitacionDAO {
	
	private Connection conexion;
	
	public MySQLCapacitacionDAO() {
		conexion = Conexion.getInstance();
	}

	public Capacitacion get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Capacitacion> getAll() {
		String sql = "SELECT id, nombre, fecha, hora, asistentes from capacitacion";
		List<Capacitacion> resultado = new ArrayList<Capacitacion>();
		try {
			Statement stm = conexion.createStatement();
			ResultSet rs = stm.executeQuery(sql);
			
			while (rs.next()) {
				resultado.add(new Capacitacion(rs.getInt("id"), rs.getString("nombre"), rs.getString("fecha"), rs.getString("hora"), rs.getString("asistentes")));
			}
			rs.close();
			stm.close();
			System.out.println("no falla get all");
		}
		catch (Exception e) {
			System.out.println("falla get all"+ e.getMessage());
		}
		
		return resultado;
	}
	public void addCapacitacion(Capacitacion cap) {
		String sql = "INSERT capacitacion (nombre, fecha, hora, asistentes) values ('"+cap.getNombre()+"','"+cap.getFecha()+"','"+cap.getHora()+"','"+cap.getAsistentes()+"')";

		try {
			Statement stm = conexion.createStatement();
			stm.execute(sql);
	
			stm.close();
		
			System.out.println("no falla get all");
		}
		catch (Exception e) {
			System.out.println("falla get all"+ e.getMessage());
		}
		
	}

}
