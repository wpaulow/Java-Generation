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
	
	public void apagar (Cliente c) {
		
	}
	
	public void atualizar (Cliente c) {
		
	}
	
	public ArrayList<Cliente> buscarTodos(){
		return lista;
	}
	
	
	
	

}
