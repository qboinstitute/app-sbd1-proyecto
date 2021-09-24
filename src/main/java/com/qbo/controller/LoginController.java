package com.qbo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.qbo.model.FormLogin;
import com.qbo.model.Participantes;

@Controller
public class LoginController {
	
	@GetMapping("/login")
	public String login(Model model) {
		model.addAttribute("title", "Login");
		model.addAttribute("formlogin", new FormLogin());
		model.addAttribute("visualizar", false);
		return "login";
	}
	
	@PostMapping("/login")
	public String login(@ModelAttribute("formlogin")FormLogin objFormLogin,
			Model model) {
		if(objFormLogin.getUsuario().equals("lsalvatierra") 
				&& objFormLogin.getPassword().equals("123456")) {
			model.addAttribute("mensaje", "Bienvenido "+ objFormLogin.getUsuario());
			return "home";
		}
		model.addAttribute("visualizar", true);
		model.addAttribute("mensajeerror", "Usuario o password incorrecto");
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
