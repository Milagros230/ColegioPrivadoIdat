package com.idat.ColegioPrivadoPrueba.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.idat.ColegioPrivadoPrueba.model.Cursos;
import com.idat.ColegioPrivadoPrueba.service. CursosService;

@Controller
@RequestMapping("/cursos/v1")
public class CursosController {
	
	@Autowired
	private CursosService service;

	@RequestMapping("listar")
	public @ResponseBody List<Cursos> listar() {
		return service.listarCursos();
	}
	

}
