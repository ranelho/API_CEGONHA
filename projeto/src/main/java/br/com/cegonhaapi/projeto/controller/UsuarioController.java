package br.com.cegonhaapi.projeto.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.cegonhaapi.projeto.DAO.IUsuario;
import br.com.cegonhaapi.projeto.entity.Usuario;

@RestController // Informando que é uma classe de controle, o endpoint
public class UsuarioController {

	@Autowired
	private IUsuario dao;

	@GetMapping("/usuarios")
	public List<Usuario> listaUsuarios() {
		return (List<Usuario>) dao.findAll();
	}
}
