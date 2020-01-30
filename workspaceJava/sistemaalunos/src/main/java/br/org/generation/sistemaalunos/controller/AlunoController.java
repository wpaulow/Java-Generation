package br.org.generation.sistemaalunos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.org.generation.sistemaalunos.model.Aluno;
import br.org.generation.sistemaalunos.services.IAlunoService;


@RestController
@CrossOrigin("*")
public class AlunoController {

	@Autowired
	private IAlunoService servico;
	
	@PostMapping("/aluno/novo/")
	public ResponseEntity<Aluno> incluirNovo (@RequestBody Aluno aluno){
		
		servico.adicionarNovoAluno(aluno);
		return ResponseEntity.ok(aluno);
	}
	
	@GetMapping("/aluno/")
	public ResponseEntity<List<Aluno>> mostrarTodos(){
		return ResponseEntity.ok(servico.recuperarTodos());
	}
	
	@GetMapping("/aluno/{ra}/")
	public ResponseEntity<Aluno> mostrarPeloId(@PathVariable int ra){
		Aluno a = servico.recuperarPorId(ra);
		if (a != null) {
			return ResponseEntity.ok(a);
		}
		return ResponseEntity.notFound().build();
	}
}
