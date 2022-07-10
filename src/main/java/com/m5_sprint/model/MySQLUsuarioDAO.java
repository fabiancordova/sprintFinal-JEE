package com.m5_sprint.model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import com.m5_sprint.interfaces.IUsuarioDAO;


public class MySQLUsuarioDAO implements IUsuarioDAO {
	
	private Connection conexion;
	
	public MySQLUsuarioDAO() {
		conexion = Conexion.getInstance();
	}

	public Usuario get1(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public Usuario get(int id) {			
		String sql = "SELECT * from usuario where id = '" + id+"'";
		Usuario usuario = new Usuario();

		try {
			Statement stm = conexion.createStatement();
			ResultSet rs = stm.executeQuery(sql);
			
			if (rs.next()) {
				((Usuario) usuario).setId(rs.getInt("id"));
				((Usuario) usuario).setNombre(rs.getString("nombre"));
				((Usuario) usuario).setRut(rs.getString("rut"));
				((Usuario) usuario).setDireccion(rs.getString("direccion"));
				((Usuario) usuario).setEmail(rs.getString("email"));
				((Usuario) usuario).setFono(rs.getString("fono"));
				((Usuario) usuario).setPassword(rs.getString("password"));
				((Usuario) usuario).setEmpresa(rs.getString("empresa"));
				((Usuario) usuario).setExperiencia(rs.getString("experiencia"));
			}
			rs.close();
			stm.close();
		}
		catch (Exception e) {
			System.out.println("falla get"+ e.getMessage());
		}
		
		return (Usuario) usuario;
	}

	public List<Usuario> getAll() {
		String sql = "SELECT id, nombre, rut, direccion, email, fono, password, empresa, experiencia, estado from usuario";
		List<Usuario> resultado = new ArrayList<Usuario>();
		try {
			Statement stm = conexion.createStatement();
			ResultSet rs = stm.executeQuery(sql);
			
			while (rs.next()) {
				resultado.add(new Usuario(rs.getInt("id"), rs.getString("nombre"), rs.getString("rut"), rs.getString("direccion"), rs.getString("email"), rs.getString("fono"), rs.getString("password"), rs.getString("empresa"), rs.getString("experiencia"), rs.getString("estado")));
			}
			rs.close();
			stm.close();
			System.out.println("no falla get all");
		}
		catch (Exception e) {
			System.out.println("falla get all mysqluser"+ e.getMessage());
		}
		
		return resultado;
	}

	
	public void addUsuario(Usuario user) {
		String sql = "INSERT usuario (nombre, rut, direccion, email, fono, password, empresa, experiencia, estado) values ('"+user.getNombre()+"','"+user.getRut()+"','"+user.getDireccion()+"','"+user.getEmail()+"', '"+user.getFono()+"','"+user.getPassword()+"', '"+user.getEmpresa()+"', '"+user.getExperiencia()+"','"+user.getEstado()+"');";
		try {
			Statement stm = conexion.createStatement();
			stm.execute(sql);
	
			stm.close();
		
			System.out.println("no falla get all mysqluser");
		}
		catch (Exception e) {
			System.out.println("falla get all  mysqluser"+ e.getMessage());
		}
		
	}


	public boolean validar (String rut, String password) {
		String sql = "SELECT * from usuarioRegistrado where rut='"+rut+"' AND password='"+password+"'";
		
		List<UsuarioRegistrado> resultado = new ArrayList<UsuarioRegistrado>();
		try {
			
			Statement stm = conexion.createStatement();
			ResultSet rs = stm.executeQuery(sql);
			
			System.out.println("stm: "+stm);
			
			while (rs.next()) {
			resultado.add(new UsuarioRegistrado(rs.getInt("id"),rs.getString("nombre"),rs.getString("apellido"), rs.getString("rut"), rs.getString("email"), rs.getString("password")));
							}

			rs.close();
			stm.close();
		}
		catch (Exception e) {
			System.out.println("falla get all MySQLUsuarioDAO "+ e.getMessage());
		}
		return resultado.size() == 1;		
	}

	@Override
	public void update(Usuario us) {
		try {			
			String sql="update usuario set nombre='"+us.getNombre()+"',rut='"+us.getRut()+"',direccion='"+us.getDireccion()+"',email='"+us.getEmail()+"',fono='"+us.getFono()+"',password='"+us.getPassword()+"',empresa='"+us.getEmpresa()+"',experiencia='"+us.getExperiencia()+"' where id='"+us.getId()+"'";
			Statement stm = conexion.createStatement();			
			stm.execute(sql);			
			stm.close();
			System.out.println("no falla update");
			
		} catch (SQLException e) {
			System.out.println("falla update");
			e.printStackTrace();				
		}		
	}
	
}
