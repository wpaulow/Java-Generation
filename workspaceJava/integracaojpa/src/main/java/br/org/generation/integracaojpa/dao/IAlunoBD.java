package br.org.generation.integracaojpa.dao;

import org.springframework.data.repository.CrudRepository;

import br.org.generation.integracaojpa.model.Aluno;

public interface IAlunoBD extends CrudRepository<Aluno, Integer>{
	
}
