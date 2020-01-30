package br.org.generation.sistemaalunos.services;

import java.util.List;

import br.org.generation.sistemaalunos.model.Aluno;

public interface IAlunoService {
	public void adicionarNovoAluno(Aluno aluno);
	public List<Aluno> recuperarTodos();
	public Aluno recuperarPorId(int ra);
}
