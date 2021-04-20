package com.cursos.services;

import java.util.List;

import com.cursos.models.entity.Estudiante;

public interface IEstudianteService {
	
	public List<Estudiante> findAll();
	
	public Estudiante save(Estudiante estudiante);
	
	public Estudiante findById(Long id);
	
	public void delete(Long id);
}
