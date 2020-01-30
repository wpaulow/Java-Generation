package br.org.generation.vitrinevirtual.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.org.generation.vitrinevirtual.dao.IDepartamentoRepo;
import br.org.generation.vitrinevirtual.model.Departamento;


@Component
public class DepartamentoServiceImpl implements IDepartamentoService {
	
	@Autowired
	private IDepartamentoRepo repo;
	
	@Override
	public void adicionarNovoDepartamento(Departamento departamento) {
		
		repo.save(departamento);
	}

	@Override
	public Departamento recuperarDetalhes(int id) {
		
		return repo.findById(id).orElse(null);
	}

	@Override
	public List<Departamento> recuperarTodos() {
		
		return (List<Departamento>)repo.findAll();
	}

}
