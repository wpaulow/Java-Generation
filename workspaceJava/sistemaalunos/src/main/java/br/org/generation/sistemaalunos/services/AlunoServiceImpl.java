package br.org.generation.sistemaalunos.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.org.generation.sistemaalunos.model.Aluno;
import br.org.generation.sistemaalunos.dao.IAlunoRepo;

@Component
public class AlunoServiceImpl implements IAlunoService{

	@Autowired
	private IAlunoRepo repo;
	
	
	
	@Override
	public List<Aluno> recuperarTodos() {
		
		return (List<Aluno>)repo.findAll();
	}

	@Override
	public Aluno recuperarPorId(int ra) {
		
		return repo.findById(ra).orElse(null);
	}

	@Override
	public void adicionarNovoAluno(Aluno aluno) {
		
		repo.save(aluno);		
	}

}
