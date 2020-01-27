package br.org.generation.integracaojpa.services;

import br.org.generation.integracaojpa.model.Aluno;

public interface IAlunoService {
	
	public void gravarAluno(Aluno aluno);
	
	public void atualizarAluno(Aluno aluno);
	
	public Aluno recuperarAlunoPorId(int id);
	
}
