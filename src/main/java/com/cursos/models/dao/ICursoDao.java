package com.cursos.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.cursos.models.entity.Curso;


public interface ICursoDao extends CrudRepository<Curso, Long> {
	
}
