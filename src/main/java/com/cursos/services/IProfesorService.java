package com.cursos.services;

import java.util.List;

import com.cursos.models.entity.Profesor;


public interface IProfesorService {
	
	public List<Profesor> findAll();
	
	public Profesor save(Profesor profesor);
	
	public Profesor findById(Long id);
	
	public void delete(Long id);
	
}
