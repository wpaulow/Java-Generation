package br.org.generation.vitrinevirtual.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.org.generation.vitrinevirtual.dao.IProdutoRepo;
import br.org.generation.vitrinevirtual.model.Produto;

/*Indica explicitamente ao SpringBoo que esta classe é uma implementação INJETÁVEL
 * de um objeto.
 * 
 * Nossa classe usa um objeto do tipo IProdutoRepo que é uma interface. Delegamos a 
 * responsabilidade de encontrar a implementação ao SpringBoot, através do
 * @Autowired */
@Component
public class ProdutoServiceImpl implements IProdutoService {

	@Autowired
	private IProdutoRepo repo;
	
	@Override
	public List<Produto> recuperarTodos() {
		/*isso corresponde a um select * from tbl_produto
		 * 							inner join tbl_departamento
		 * 								on tbl_produto.departamento_id = departamento.id*/
		return (List<Produto>)repo.findAll();
	}

	@Override
	public Produto recuperarPorId(int id) {
		
		return repo.findById(id).orElse(null);
	}

}
