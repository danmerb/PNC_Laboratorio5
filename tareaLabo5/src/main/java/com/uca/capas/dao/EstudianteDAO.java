package com.uca.capas.dao;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.uca.capas.domain.Estudiante;

public interface EstudianteDAO {
	public List<Estudiante> findAll() throws DataAccessException;
	public void insert(Estudiante estudiante) throws DataAccessException;
}
