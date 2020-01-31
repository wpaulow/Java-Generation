package br.com.eureka.projetointegrador.bd;

import java.util.ArrayList;

import br.com.eureka.projetointegrador.model.Feed;

public class BdFeed {

	private ArrayList<Feed> lista;

	public BdFeed() {
		lista = new ArrayList<Feed>();

	}

	// Create
	public void gravar(Feed f) {
		this.lista.add(f);
	}

	// Read
	public Feed buscar(int idPostagem) {
		Feed f = null;
		for (Feed fe : lista) {
			if (fe.getIdPostagem() == idPostagem) {
				f = fe;
				break;
			}
		}
		return f;
	}

	// update
	public void atualizar(Feed f) {
		int posicao = -1;
		for (int i = 0; i < lista.size(); i++) {
			if (lista.get(i).getIdPostagem() == f.getIdPostagem()) {
				posicao = i;
				break;
			}
		}
		if (posicao >= 0) {
			lista.set(posicao, f);
		}

	}

	// Delete
	public boolean deletar(int idPostagem) {
		int posicao = -1;
		for (int i = 0; i < lista.size(); i++) {
			if (lista.get(i).getIdPostagem() == idPostagem) {
				posicao = i;
				break;
			}
		}
		if (posicao >= 0) {
			lista.remove(posicao);
			return true;
		}
		return false;
	}
	
	public ArrayList<Feed> buscarTodos(){
		return lista; 
	}

}
