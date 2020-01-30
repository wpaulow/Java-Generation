package br.org.generation.sistemaalunos.dao;

import org.springframework.data.repository.CrudRepository;

import br.org.generation.sistemaalunos.model.Aluno;

public interface IAlunoRepo extends CrudRepository<Aluno, Integer>{
	
}
