package com.cursos.models.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "estudiantes")
public class Estudiante implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long codigo;
	private String nombre;

	@JsonIgnore
	@ManyToMany(mappedBy = "estudiantes")
	private List<Asignatura> asignaturas = new ArrayList<Asignatura>();

	//constructors
	public Estudiante() {
		
	}
		

	public Estudiante(Long codigo, String nombre, List<Asignatura> asignaturas) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.asignaturas = asignaturas;
	}



	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	

	public List<Asignatura> getAsignaturas() {
		return asignaturas;
	}


	public void setAsignaturas(List<Asignatura> asignaturas) {
		this.asignaturas = asignaturas;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Estudiante other = (Estudiante) obj;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		return true;
	}

	


	@Override
	public String toString() {
		return "Estudiante [codigo=" + codigo + ", nombre=" + nombre + ", asignaturas=" + asignaturas + "]";
	}





	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

}
