package com.m5_sprint.interfaces;

import java.util.List;

import com.m5_sprint.model.Capacitacion;

public interface ICapacitacionDAO {
	public Capacitacion get (int id);
	public List<Capacitacion> getAll();
	public void addCapacitacion(Capacitacion cap);
}
