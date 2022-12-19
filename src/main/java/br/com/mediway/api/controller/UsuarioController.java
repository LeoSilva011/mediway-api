package br.com.mediway.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.mediway.api.model.Usuario;
import br.com.mediway.api.service.UsuarioService;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {
	@Autowired
	private UsuarioService usuarioService;

	@PostMapping("/salvar")
	public ResponseEntity<Usuario> salvar(@RequestBody Usuario usuario) {
		
		Usuario usuarioS = usuarioService.salvarNovoUsuario(usuario);
		return new ResponseEntity<>(usuarioS, HttpStatus.CREATED);
	
	}

	@GetMapping("/listar")
	public ResponseEntity<List<Usuario>> listar(){
		
		List<Usuario> todosUsuarios = usuarioService.buscarTodosUsuario();
		
		return ResponseEntity.ok(todosUsuarios);
		
	}
	
	
	
	
	
	

}
