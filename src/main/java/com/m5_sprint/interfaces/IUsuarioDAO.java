package com.m5_sprint.interfaces;

import java.util.List;

import com.m5_sprint.model.Usuario;

public interface IUsuarioDAO {
	public Usuario get (int id);
	public List<Usuario> getAll();
	public void addUsuario(Usuario us);	
	boolean validar(String rut, String password);
	public Object get1(int id);
	public void update(Usuario us);
}
