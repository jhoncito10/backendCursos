package com.cursos.services;

import java.util.List;

import com.cursos.models.entity.Curso;


public interface ICursoService {
	
	public List<Curso> findAll();
	
	public Curso save(Curso curso);
	
	public Curso findById(Long id);
	
	public void delete(Long id);
}
