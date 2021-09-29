package com.qbo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.qbo.model.bd.Usuario;
import com.qbo.service.UsuarioService;

@Controller
public class RegistroUsuarioController {
	
	@Autowired
	private UsuarioService usuarioService;

	@GetMapping("/registrar")
	public String registrarUsuario(Model model) {
		model.addAttribute("title", "Registro de usuario");
		model.addAttribute("usuario", new Usuario());
		model.addAttribute("visualizar", false);
		return "registrarusuario";
	}
	
	@PostMapping("/registrar")
	public String registrarUsuario(@ModelAttribute("usuario") Usuario objUsuario,
			Model model) {
		try {
			usuarioService.registrarUsuario(objUsuario);
			model.addAttribute("visualizar", true);
			model.addAttribute("registro", true);
			model.addAttribute("mensajeerror", "Usuario registrado correctamente");
		}catch(Exception e) {
			model.addAttribute("visualizar", false);
			model.addAttribute("registro", false);
			model.addAttribute("mensajeerror", "Error al registrar usuario, vuelva a intentarlo.");
		}
		return "registrarusuario";
	}
	
}
