package br.com.cegonhaapi.projeto.controller;

import br.com.cegonhaapi.projeto.handler.UsuarioNotFoundException;
import br.com.cegonhaapi.projeto.service.UsuarioService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/usuarios")
public class UsuarioController {

	private final UsuarioService usuarioService;

	@PostMapping("/usuario")
	public ResponseEntity<UsuarioResponse> novoUsuario(@RequestBody @Validated UsuarioRequest usuarioRequest) {
		UsuarioResponse usuarioResponse = usuarioService.novoUsuario(usuarioRequest);
		return new ResponseEntity<>(usuarioResponse, HttpStatus.CREATED);
	}

	@GetMapping("/all")
	public ResponseEntity<List<UsuarioResponse>> listaUsuarios() {
		List<UsuarioResponse> usuarios = usuarioService.findAll();
		return ResponseEntity.ok(usuarios);
	}

	@GetMapping("/usuario/{cpf}")
	public ResponseEntity<UsuarioResponse> getUsuarioByCpf(@PathVariable String cpf) {
		try {
			UsuarioResponse usuarioResponse = usuarioService.findByCpf(cpf);
			return ResponseEntity.ok(usuarioResponse);
		} catch (UsuarioNotFoundException ex) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
		}
	}

	@DeleteMapping("/usuario/{cpf}")
	public ResponseEntity<Void> deleteUsuarioByCpf(@PathVariable String cpf) {
		try {
			usuarioService.deleteByCpf(cpf);
			return ResponseEntity.noContent().build();
		} catch (UsuarioNotFoundException ex) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
	}

}
