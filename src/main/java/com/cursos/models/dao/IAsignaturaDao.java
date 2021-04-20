package com.cursos.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.cursos.models.entity.Asignatura;


public interface IAsignaturaDao extends CrudRepository<Asignatura, Long> {
	
}