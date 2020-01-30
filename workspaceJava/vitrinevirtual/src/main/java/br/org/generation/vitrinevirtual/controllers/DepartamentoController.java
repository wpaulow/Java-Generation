package br.org.generation.vitrinevirtual.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.org.generation.vitrinevirtual.model.Departamento;
import br.org.generation.vitrinevirtual.services.IDepartamentoService;


@RestController
@CrossOrigin("*")
public class DepartamentoController {
	
	@Autowired
	private IDepartamentoService servicinho;
	
	@PostMapping("/departamento/novo/")
	public ResponseEntity<Departamento> incluirNovo (@RequestBody Departamento departamento){
		
		servicinho.adicionarNovoDepartamento(departamento);
		return ResponseEntity.ok(departamento);
	}
	
	@GetMapping("/departamento/todos/")
	public ResponseEntity<List<Departamento>> recuperarTodos(){
		
		return ResponseEntity.ok(servicinho.recuperarTodos());
	}
	
	@GetMapping("/departamento/{id}/")
	public ResponseEntity<Departamento> recuperarDetalhes(@PathVariable int id){
		Departamento d = servicinho.recuperarDetalhes(id);
		if (d != null) {
			return ResponseEntity.ok(d);
		}
		return ResponseEntity.notFound().build();
	}
}
