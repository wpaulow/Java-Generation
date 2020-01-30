package br.org.generation.sistemaalunos.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.org.generation.sistemaalunos.dao.ICursoRepo;
import br.org.generation.sistemaalunos.model.Curso;


@Component
public class CursoServiceImpl implements ICursoService {

	@Autowired
	private ICursoRepo repo;
	
	@Override
	public void adicionarNovoCurso(Curso curso) {

		repo.save(curso);
	}

	@Override
	public Curso recuperarDetalhes(int codigoCurso) {
		
		return repo.findById(codigoCurso).orElse(null);
	}

	@Override
	public List<Curso> recuperarTodos() {
		
		return (List<Curso>)repo.findAll();
	}
	
}
