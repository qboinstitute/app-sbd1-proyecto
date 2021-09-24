package com.qbo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.qbo.model.Participantes;

@Controller
public class LoginController {
	
	@GetMapping("/login")
	public String login(Model model) {
		model.addAttribute("message", "Hola mundo");
		model.addAttribute("title", "Index");
		return "login";
	}
	
	@GetMapping("/participantes")
	public String obtenerParticipantes(Model model) {
		List<Participantes> listParticipante = new ArrayList<Participantes>();
		listParticipante.add(new Participantes("1", "Claudio", "Arango", "arango@gmail.com"));
		listParticipante.add(new Participantes("2", "Luis", "Arango", "arango@gmail.com"));
		listParticipante.add(new Participantes("3", "Mateo", "Arango", "arango@gmail.com"));
		listParticipante.add(new Participantes("4", "Julina", "Arango", "arango@gmail.com"));
		listParticipante.add(new Participantes("5", "Claudia", "Arango", "arango@gmail.com"));
		model.addAttribute("participantes", listParticipante);
		return "listaalumnos";
	}
	
	

}
