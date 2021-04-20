package com.cursos.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cursos.models.dao.IColegioDao;
import com.cursos.models.entity.Colegio;




@Service
public class ColegioServiceImpl implements IColegioService {
	@Autowired
	private IColegioDao colegioDao;
	
	@Override
	@Transactional(readOnly = true)
	public List<Colegio> findAll() {		
		return (List<Colegio>) colegioDao.findAll();
	}

	@Override
	@Transactional
	public Colegio save(Colegio colegio) {
		return colegioDao.save(colegio);
	}

	@Override
	@Transactional(readOnly = true)
	public Colegio findById(Long id) {
		return colegioDao.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public void delete(Long id) {
		colegioDao.deleteById(id);
	}
}