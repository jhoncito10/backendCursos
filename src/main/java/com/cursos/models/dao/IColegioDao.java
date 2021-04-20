package com.cursos.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.cursos.models.entity.Colegio;


public interface IColegioDao extends CrudRepository<Colegio, Long> {
	
}
