package com.cursos.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.cursos.models.entity.Profesor;


public interface IProfesorDao extends CrudRepository<Profesor, Long> {
	
}
