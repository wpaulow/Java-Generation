package br.org.generation.sistemaalunos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.org.generation.sistemaalunos.model.Curso;
import br.org.generation.sistemaalunos.services.ICursoService;



@RestController
@CrossOrigin("*")

public class CursoController {
	
	@Autowired
	private ICursoService servicinho;
	
	@PostMapping("/curso/novo/")
	public ResponseEntity<Curso> incluirNovo (@RequestBody Curso curso){
		
		servicinho.adicionarNovoCurso(curso);
		return ResponseEntity.ok(curso);
	}
	
	@GetMapping("/curso/todos/")
	public ResponseEntity<List<Curso>> recuperarTodos(){
		
		return ResponseEntity.ok(servicinho.recuperarTodos());
	}
	
	@GetMapping("/curso/{codigoCurso}/")
	public ResponseEntity<Curso> recuperarDetalhes(@PathVariable int codigoCurso){
		Curso c = servicinho.recuperarDetalhes(codigoCurso);
		if (c != null) {
			return ResponseEntity.ok(c);
		}
		return ResponseEntity.notFound().build();
	}
	
	
	
}
