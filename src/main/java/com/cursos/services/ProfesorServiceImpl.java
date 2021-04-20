package com.cursos.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cursos.models.dao.IProfesorDao;
import com.cursos.models.entity.Profesor;


@Service
public class ProfesorServiceImpl implements IProfesorService {
	@Autowired
	private IProfesorDao profesorDao;
	
	@Override
	@Transactional(readOnly = true)
	public List<Profesor> findAll() {		
		return (List<Profesor>) profesorDao.findAll();
	}

	@Override
	@Transactional
	public Profesor save(Profesor estudiante) {
		return profesorDao.save(estudiante);
	}

	@Override
	@Transactional(readOnly = true)
	public Profesor findById(Long id) {
		return profesorDao.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public void delete(Long id) {
		profesorDao.deleteById(id);
	}
}
