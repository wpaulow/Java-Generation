package br.org.generation.vitrinevirtual.dao;

import org.springframework.data.repository.CrudRepository;

import br.org.generation.vitrinevirtual.model.Produto;
/*CrudRepository é uma interface nativa do JPA que já implementa alguns métodos de 
 * manipulação de objetos. Tais como:
 * save(T);
 * deleteById();*/
public interface IProdutoRepo extends CrudRepository<Produto, Integer>{
	//aqui podem vir outros métodos

}
