package com.cursos.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cursos.models.dao.IAsignaturaDao;
import com.cursos.models.entity.Asignatura;



@Service
public class AsignaturaServiceImpl implements IAsignaturaService {

	@Autowired
	private IAsignaturaDao asignaturaDao;
	
	@Override
	@Transactional(readOnly = true)
	public List<Asignatura> findAll() {		
		return (List<Asignatura>) asignaturaDao.findAll();
	}

	@Override
	@Transactional
	public Asignatura save(Asignatura estudiante) {
		return asignaturaDao.save(estudiante);
	}

	@Override
	@Transactional(readOnly = true)
	public Asignatura findById(Long id) {
		return asignaturaDao.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public void delete(Long id) {
		asignaturaDao.deleteById(id);
	}

}
