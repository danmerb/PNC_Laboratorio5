package com.uca.capas.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Entity
@Table(schema="public",name="estudiante")
public class Estudiante {
	
	@Id
	@Column(name="c_usuario")
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Integer codigoEstudiante;
	
	@NotEmpty(message="El campo nombre no puede estar vacio")
	@Size(message="El nombre del estudiante no debe tener mas de 50 caracteres", max=50)
	@Column(name="nombre")
	private String nombre;
	

	@NotEmpty(message="El campo apellido no puede estar vacio")
	@Size(message="El apellido no debe tener mas de 50 caracteres", max=50)
	@Column(name="apellido")
	private String apellido;
	

	@NotEmpty(message="El campo carnet no puede estar vacio")
	@Size(message="El carnet no debe tener mas de 10 caracteres", max=10)
	@Column(name="carne")
	private	String carne;
	

	@NotEmpty(message="El campo carrera no puede estar vacio")
	@Size(message="La carrera no debe tener mas de 100 caracteres", max=100)
	@Column(name="carrera")
	private String carrera;
	
	
	public Estudiante() {
		
	}

	public Integer getCodigoEstudiante() {
		return codigoEstudiante;
	}

	public void setCodigoEstudiante(Integer codigoEstudiante) {
		this.codigoEstudiante = codigoEstudiante;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getCarne() {
		return carne;
	}

	public void setCarne(String carne) {
		this.carne = carne;
	}

	public String getCarrera() {
		return carrera;
	}

	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}
	
	

}