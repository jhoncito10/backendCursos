package com.cursos.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cursos.models.dao.ICursoDao;
import com.cursos.models.entity.Curso;



@Service
public class CursoServiceImpl implements ICursoService {

	@Autowired
	private ICursoDao cursoDao;
	
	@Override
	@Transactional(readOnly = true)
	public List<Curso> findAll() {		
		return (List<Curso>) cursoDao.findAll();
	}

	@Override
	@Transactional
	public Curso save(Curso curso) {
		return cursoDao.save(curso);
	}

	@Override
	@Transactional(readOnly = true)
	public Curso findById(Long id) {
		return cursoDao.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public void delete(Long id) {
		cursoDao.deleteById(id);
	}

}
