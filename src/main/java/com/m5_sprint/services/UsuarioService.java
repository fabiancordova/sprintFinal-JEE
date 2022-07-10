package com.m5_sprint.services;

import java.util.List;
import com.m5_sprint.interfaces.IUsuarioDAO;
import com.m5_sprint.model.MySQLUsuarioDAO;
import com.m5_sprint.model.Usuario;

public class UsuarioService {
	
	private IUsuarioDAO usuarioDao = new MySQLUsuarioDAO(); //MemoryCapacitacionDAO() MySQLCapacitacionDAO()
	
	public Usuario getUsuario(int id) {
		return usuarioDao.get(id);		
	}
	
	public List<Usuario> getAllUsuario() {
		return usuarioDao.getAll();		
	}	

	public void addUsuario(Usuario nuevoUsuario) {
		usuarioDao.addUsuario(nuevoUsuario);	
	}

	public boolean validar (String rut, String password) {
		return  usuarioDao.validar(rut, password);
	}
	
	public void update(Usuario us) {	
		usuarioDao.update(us);		
	}

}
