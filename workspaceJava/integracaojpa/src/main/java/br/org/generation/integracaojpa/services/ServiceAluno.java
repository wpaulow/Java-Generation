package br.org.generation.integracaojpa.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.org.generation.integracaojpa.dao.IAlunoBD;
import br.org.generation.integracaojpa.model.Aluno;

@Component
public class ServiceAluno implements IAlunoService {
					//não preciso dar new ao declarar uma interface porque essa notação faz isso pra mim. 	
	@Autowired 		//indica que o gerenciamento desse objeto é por conta do springboot	
	IAlunoBD repo;  //repo de repositório (uma alusão ao banco de dados)

	@Override
	public void gravarAluno(Aluno aluno) {
		try {
			repo.save(aluno);
		} catch(Exception ex) {
			throw new RuntimeException("Erro ao inserir novo aluno.");
		}
	}

	@Override
	public void atualizarAluno(Aluno aluno) {
		try {
			repo.save(aluno);
		} catch(Exception e) {
			throw new RuntimeException("Erro ao atualizar aluno no banco.");
		}
	}

	@Override
	public Aluno recuperarAlunoPorId(int id) {
		
		return repo.findById(id).get();
		
	}
	
}
