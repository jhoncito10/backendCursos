package com.cursos.services;

import java.util.List;

import com.cursos.models.entity.Asignatura;

public interface IAsignaturaService {
	
	public List<Asignatura> findAll();
	
	public Asignatura save(Asignatura asignatura);
	
	public Asignatura findById(Long id);
	
	public void delete(Long id);
}
