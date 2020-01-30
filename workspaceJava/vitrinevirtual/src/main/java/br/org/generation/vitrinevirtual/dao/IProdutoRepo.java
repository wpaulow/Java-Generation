package br.org.generation.vitrinevirtual.dao;

import org.springframework.data.repository.CrudRepository;

import br.org.generation.vitrinevirtual.model.Produto;

public interface IProdutoRepo extends CrudRepository<Produto, Integer>{

}
