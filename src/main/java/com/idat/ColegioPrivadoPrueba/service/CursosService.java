package com.idat.ColegioPrivadoPrueba.service;

import java.util.List;

import com.idat.ColegioPrivadoPrueba.model.Cursos;

public interface CursosService {
	
	void guardarCursos(Cursos cursos);
	void actualizarCursos(Cursos cursos);
	void eliminarCursos(Integer id);
	List <Cursos> listarCursos();
	Cursos obtenerCursosId(Integer id);

}
