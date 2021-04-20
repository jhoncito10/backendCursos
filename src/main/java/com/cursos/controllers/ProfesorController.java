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

import com.cursos.models.entity.Profesor;
import com.cursos.services.IProfesorService;


@CrossOrigin(origins = {"http://localhost:4200", "https://friendly-shirley-ec93e7.netlify.app"})
@RestController
@RequestMapping("/api")
public class ProfesorController {
	@Autowired
	private IProfesorService profesoreService;
	
	@GetMapping("/profesor")
	public List<Profesor> index(){
		return profesoreService.findAll();
	}
	
	@GetMapping("/profesor/{id}")
	public Profesor show(@PathVariable Long id) {
		return profesoreService.findById(id);
	}
	
	@PostMapping("/profesor")
	@ResponseStatus(HttpStatus.CREATED)
	public Profesor create(@RequestBody Profesor profesor) {
		return profesoreService.save(profesor);
	}
	
	@PutMapping("/profesor/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public Profesor update(@RequestBody Profesor profesor, @PathVariable Long id) {
		Profesor profesorActual = profesoreService.findById(id);
		
		profesorActual.setNombre(profesor.getNombre());
		
		return profesoreService.save(profesorActual);
	}
	
	@DeleteMapping("/profesor/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		profesoreService.delete(id);
	}
}
