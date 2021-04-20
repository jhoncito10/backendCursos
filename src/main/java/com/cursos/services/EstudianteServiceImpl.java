package com.cursos.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cursos.models.dao.IEstudianteDao;
import com.cursos.models.entity.Estudiante;

@Service
public class EstudianteServiceImpl implements IEstudianteService {

	@Autowired
	private IEstudianteDao estudianteDao;
	
	@Override
	@Transactional(readOnly = true)
	public List<Estudiante> findAll() {		
		return (List<Estudiante>) estudianteDao.findAll();
	}

	@Override
	@Transactional
	public Estudiante save(Estudiante estudiante) {
		return estudianteDao.save(estudiante);
	}

	@Override
	@Transactional(readOnly = true)
	public Estudiante findById(Long id) {
		return estudianteDao.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public void delete(Long id) {
		estudianteDao.deleteById(id);
	}

}
