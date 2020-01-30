package br.org.generation.sistemaalunos.services;

import java.util.List;

import br.org.generation.sistemaalunos.model.Curso;

public interface ICursoService {
	
	public void adicionarNovoCurso(Curso curso);
	
	public Curso recuperarDetalhes(int codigoCurso);
	
	public List<Curso> recuperarTodos();
}
