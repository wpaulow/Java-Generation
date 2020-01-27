package br.org.generation.integracaojpa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.org.generation.integracaojpa.model.Aluno;
import br.org.generation.integracaojpa.services.IAlunoService;

@RestController
public class AlunoController {
	
	@Autowired
	private IAlunoService servico;
	
	@PostMapping("/aluno/novo")
	public ResponseEntity<Aluno> inserirNovoAluno(@RequestBody Aluno aluno) {
		
		try {
			servico.gravarAluno(aluno);
			return ResponseEntity.ok(aluno);
			
		} catch (Exception e) {
			return ResponseEntity.badRequest().build();
			
		}
		
	}
	
	@GetMapping("/aluno/{id}")
	public ResponseEntity<Aluno> buscarAlunoPeloId(@PathVariable int id) {
		
		return null;
		
	}
	
	@PutMapping("/aluno/alterar")
	public ResponseEntity<Aluno> atualizarDados(@RequestBody Aluno aluno) {
		
		return null;
		
	}
	
}
