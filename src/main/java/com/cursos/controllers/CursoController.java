package com.cursos.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.cursos.models.entity.Curso;
import com.cursos.services.ICursoService;




@RestController
@RequestMapping("/api")
public class CursoController {
	@Autowired
	private ICursoService cursoService;
	
	@GetMapping("/curso")
	public List<Curso> index(){
		return cursoService.findAll();
	}
	
	@GetMapping("/curso/{id}")
	public Curso show(@PathVariable Long id) {
		return cursoService.findById(id);
	}
	
	@PostMapping("/curso")
	@ResponseStatus(HttpStatus.CREATED)
	public Curso create(@RequestBody Curso curso) {
		return cursoService.save(curso);
	}
	
	@PutMapping("/curso/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public Curso update(@RequestBody Curso curso, @PathVariable Long id) {
		Curso cursoturaActual = cursoService.findById(id);
		
		cursoturaActual.setGrado(curso.getGrado());
		cursoturaActual.setSalon(curso.getSalon());

		
		return cursoService.save(cursoturaActual);
	}
	
	@DeleteMapping("/curso/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		cursoService.delete(id);
	}
}