package br.org.generation.vitrinevirtual.services;

import java.util.List;

import br.org.generation.vitrinevirtual.model.Departamento;

public interface IDepartamentoService {
	
	public void adicionarNovoDepartamento(Departamento departamento);
	
	public Departamento recuperarDetalhes(int id);
	
	public List<Departamento> recuperarTodos();
}
