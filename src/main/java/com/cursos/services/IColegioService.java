package com.cursos.services;

import java.util.List;

import com.cursos.models.entity.Colegio;


public interface IColegioService {
	
	public List<Colegio> findAll();
	
	public Colegio save(Colegio colegio);
	
	public Colegio findById(Long id);
	
	public void delete(Long id);
}
