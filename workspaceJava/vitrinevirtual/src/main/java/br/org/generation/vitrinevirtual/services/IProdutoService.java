package br.org.generation.vitrinevirtual.services;

import java.util.List;

import br.org.generation.vitrinevirtual.model.Produto;

/* Regras de negócio são implementadas na camada de serviços*/

public interface IProdutoService {
	public void novoProduto (Produto produto);
	public List<Produto> recuperarTodos();
	public Produto recuperarPorId(int id);
}
