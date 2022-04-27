package br.com.formulario.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.formulario.model.Formulario;
import br.com.formulario.serviceImpl.FormularioServiceImpl;


@RestController
@RequestMapping("/api")
public class FormularioController {

	@Autowired
	private FormularioServiceImpl fms;

	@GetMapping("/cadastro")
	public List<Formulario> listAll() {

		return fms.listarTodos();

	}

	@PostMapping
	@ResponseStatus(HttpStatus.ACCEPTED)
	public ResponseEntity salvar(@RequestBody Formulario fm) {

		fms.salvar(fm);
		return ResponseEntity.ok("OK");

	}
	
	
	@DeleteMapping
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void excluir(@PathVariable Long id) {
		fms.delete(id);
		
		

	}

}
