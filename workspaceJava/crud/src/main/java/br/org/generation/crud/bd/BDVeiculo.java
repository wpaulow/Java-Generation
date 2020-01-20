package br.org.generation.crud.bd;

import java.util.ArrayList;


import br.org.generation.crud.model.Veiculo;

public class BDVeiculo {
	
	private ArrayList<Veiculo> lista;
	
	public BDVeiculo () {
		
		lista = new ArrayList<Veiculo>();
		
	}
	public Veiculo buscar(int id) {
		Veiculo v = null;
		//para cada veiculo da lista
		for (Veiculo veic: lista) {
			
			if (veic.getId() == id) {
				v = veic;
				break;
			}
		}
		return v;
		
	}
	
	public void gravar (Veiculo v) {
		this.lista.add(v);
	}
	
	public boolean apagar (int id) {
		int posicao = -1;
		for (int i = 0; i < lista.size(); i++) {
			if (lista.get(i).getId() == id) {
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
	
	public boolean atualizar (Veiculo v) {
		int posicao = -1;
		for (int i = 0; i < lista.size(); i++) {
			if (lista.get(i).getId() == v.getId()) {
				posicao = i;
				break;
			}
			
		}
		if (posicao >= 0) {
				lista.set(posicao, v);
				return true;
		}
		return false;
		
	}
	
	public ArrayList<Veiculo> buscarTodos(){
		return lista;
	}
	
	
}
