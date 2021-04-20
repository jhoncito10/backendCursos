package com.cursos.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.cursos.models.entity.Estudiante;

public interface IEstudianteDao extends CrudRepository<Estudiante, Long> {
	
}
