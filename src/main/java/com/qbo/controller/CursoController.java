package com.qbo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.qbo.service.CursoService;

@Controller
@RequestMapping("/Curso")
public class CursoController {
	
	@Autowired
	private CursoService cursoService;

	@GetMapping("/frmMantCurso")
	public String frmMantCurso(Model model) {
		model.addAttribute("title", "Mantenimiento de curso");
		model.addAttribute("listcursos", cursoService.listarCursos());
		return "Curso/frmMantCurso";
	}
	
}
