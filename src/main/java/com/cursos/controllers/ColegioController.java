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

import com.cursos.models.entity.Colegio;
import com.cursos.services.IColegioService;


@CrossOrigin(origins = {"http://localhost:4200", "https://friendly-shirley-ec93e7.netlify.app"})
@RestController
@RequestMapping("/api")
public class ColegioController {
	@Autowired
	private IColegioService colegioService;
	
	@GetMapping("/colegio")
	public List<Colegio> index(){
		return colegioService.findAll();
	}
	
	@GetMapping("/colegio/{id}")
	public Colegio show(@PathVariable Long id) {
		return colegioService.findById(id);
	}
	
	@PostMapping("/colegio")
	@ResponseStatus(HttpStatus.CREATED)
	public Colegio create(@RequestBody Colegio estudiante) {
		return colegioService.save(estudiante);
	}
	
	@PutMapping("/colegio/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public Colegio update(@RequestBody Colegio colegio, @PathVariable Long id) {
		Colegio colegioActual = colegioService.findById(id);
		
		colegioActual.setNombre(colegio.getNombre());
		
		return colegioService.save(colegioActual);
	}
	
	@DeleteMapping("/colegio/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		colegioService.delete(id);
	}
}
