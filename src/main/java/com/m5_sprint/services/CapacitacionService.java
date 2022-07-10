package com.m5_sprint.services;

import java.util.List;

import com.m5_sprint.interfaces.ICapacitacionDAO;
import com.m5_sprint.model.Capacitacion;
import com.m5_sprint.model.MySQLCapacitacionDAO;

public class CapacitacionService {
	
	private ICapacitacionDAO capacitacionDao = new MySQLCapacitacionDAO(); //MemoryCapacitacionDAO() MySQLCapacitacionDAO()
	
	public Capacitacion getCapacitacion(int id) {
		return capacitacionDao.get(id);		
	}
	
	public List<Capacitacion> getAllCapacitacion() {
		return capacitacionDao.getAll();		
	}
	
	public void addCapacitacion(Capacitacion nuevaCapacitacion) throws Exception {
		//agregar una regla de negocio id debe ser numerico
		try {
			//convertir a objeto entero
			Integer entero = nuevaCapacitacion.getId();
			//convertir de entero a string
			String texto = entero.toString();
			//convertir de string a entero
			Integer idInteger = Integer.parseInt(texto); //nuevaCapacitacion.getId()
		}
		catch(Exception e) {
			throw new Exception("El id debe ser numerico");
		}
		//agregar una regla de negocio id debe ser numerico
		if(capacitacionDao.get(nuevaCapacitacion.getId()) != null) {
			throw new Exception("La capacitación con el id ingresado ya existe");
		}

		capacitacionDao.addCapacitacion(nuevaCapacitacion);	
	}

}
