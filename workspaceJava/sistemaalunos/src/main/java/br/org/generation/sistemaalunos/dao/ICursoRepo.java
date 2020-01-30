package br.org.generation.sistemaalunos.dao;

import org.springframework.data.repository.CrudRepository;

import br.org.generation.sistemaalunos.model.Curso;

public interface ICursoRepo extends CrudRepository<Curso, Integer>{

}
