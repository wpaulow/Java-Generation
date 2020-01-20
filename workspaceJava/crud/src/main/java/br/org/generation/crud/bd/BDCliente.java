package br.org.generation.crud.bd;

import java.util.ArrayList;

import br.org.generation.crud.model.Cliente;

public class BDCliente {
	
	private ArrayList<Cliente> lista;
	
	public BDCliente () {
		lista = new ArrayList<Cliente>();
	}
	
	public Cliente buscar(int id) {
		Cliente c = null;
		//para cada cliente da lista
		for (Cliente cli: lista) {
			
			if (cli.getId() == id) {
				c = cli;
				break;
			}
		}
		return c;
	}
	
	public void gravar (Cliente c) {
		this.lista.add(c);
	}
	
	public boolean apagar (int id) {
		int posicao = -1;
		for (int i = 0; i < lista.size(); i++) {
			if (lista.get(i).getId() == id) {
				posicao = i;
				break;
			}
			if (posicao >= 0) {
				lista.remove(posicao);
				return true;
			}
		}
		return false;
	}
	
	public void atualizar (Cliente c) {
		int posicao = -1;
		for (int i = 0; i < lista.size(); i++) {
			if (lista.get(i).getId() == c.getId()) {
				posicao = i;
				break;
			}
			if (posicao >= 0) {
				lista.set(posicao, c);
			}
		}
		
	}
	
	public ArrayList<Cliente> buscarTodos(){
		return lista;
	}
	
	
	
	

}
