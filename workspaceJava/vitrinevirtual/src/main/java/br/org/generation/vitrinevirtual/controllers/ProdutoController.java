package br.org.generation.vitrinevirtual.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.org.generation.vitrinevirtual.model.Produto;
import br.org.generation.vitrinevirtual.services.IProdutoService;

@RestController
@CrossOrigin("*")
public class ProdutoController {
	
	/*a Injeção de Dependências fica a cargo do Autowired, sem a necessidade de iniciar 
	 * a variável, o objeto*/
	@Autowired
	private IProdutoService servico;
	
	@PostMapping("/produto/novo/")
	public ResponseEntity<Produto> inserirProduto(@RequestBody Produto produto) {
		servico.novoProduto(produto);
		return ResponseEntity.ok(produto);
	}
	
	@GetMapping("/produto/")
	public ResponseEntity<List<Produto>> mostrarTodos(){
		return ResponseEntity.ok(servico.recuperarTodos());
	}
	
	@GetMapping("/produto/{id}/")
	public ResponseEntity<Produto> mostrarPeloId(@PathVariable int id){
		Produto p = servico.recuperarPorId(id);
		if (p != null) {
			return ResponseEntity.ok(p);
		}
		return ResponseEntity.notFound().build();
	}
	
}
