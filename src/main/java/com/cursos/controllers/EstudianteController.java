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

import com.cursos.models.entity.Estudiante;
import com.cursos.services.IEstudianteService;

@CrossOrigin(origins = {"http://localhost:4200"})
@RestController
@RequestMapping("/api")
public class EstudianteController {
	
	@Autowired
	private IEstudianteService estudianteService;
	
	@GetMapping("/estudiante")
	public List<Estudiante> index(){
		return estudianteService.findAll();
	}
	
	@GetMapping("/estudiante/{id}")
	public Estudiante show(@PathVariable Long id) {
		return estudianteService.findById(id);
	}
	
	@PostMapping("/estudiante")
	@ResponseStatus(HttpStatus.CREATED)
	public Estudiante create(@RequestBody Estudiante estudiante) {
		return estudianteService.save(estudiante);
	}
	
	@PutMapping("/estudiante/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public Estudiante update(@RequestBody Estudiante estudiante, @PathVariable Long id) {
		Estudiante estudianteActual = estudianteService.findById(id);
		
		estudianteActual.setNombre(estudiante.getNombre());
		
		return estudianteService.save(estudianteActual);
	}
	
	@DeleteMapping("/estudiante/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		estudianteService.delete(id);
	}
}
