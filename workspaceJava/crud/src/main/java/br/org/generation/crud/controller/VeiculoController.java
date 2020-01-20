package br.org.generation.crud.controller;

import java.util.ArrayList;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.org.generation.crud.bd.BDVeiculo;
import br.org.generation.crud.model.Veiculo;

@RestController
public class VeiculoController {

//	@GetMapping("/veiculo/teste")
//	public Veiculo testeVeiculo() {
//		
//		Veiculo v = new Veiculo(1234, "Voks", "Fuqueta", 1978, 13000);
//		v.setCor("vermeio grená");
//		v.setTipo("esportivo");
//		v.setDetalhes("Veiculo impecável."
//				+ "Motor zero" 
//				+ "Chique e bacanizado.");
//		return v;
//	}
	
	private BDVeiculo bd = new BDVeiculo();
	
	@PostMapping("/veiculo/novo")
	public ResponseEntity<Veiculo> novoVeiculo(@RequestBody Veiculo veiculo) {
		bd.gravar(veiculo);
		return ResponseEntity.ok(veiculo);
	}
	
	@GetMapping("/veiculo/{id}")
	//ANOTAR a variável com @PathVariable é a indicação que o valor
	//dele vem do caminho.
	public ResponseEntity<Veiculo> getVeiculo(@PathVariable int id){
		Veiculo veic = bd.buscar(id);
		if (veic != null) {
			return ResponseEntity.ok(veic);
		} else {
			return ResponseEntity.notFound().build();
		}
		
	}
	
	@GetMapping("/veiculo/todos")
	public ResponseEntity<ArrayList<Veiculo>> getTodos() {
		return ResponseEntity.ok(bd.buscarTodos());
	}
	
	@PutMapping("/veiculo")
	public ResponseEntity<String> alteraVeiculo(@RequestBody Veiculo veiculo) {
		if (bd.atualizar(veiculo)) {
			return ResponseEntity.ok("Success!");
		} else {
			return ResponseEntity.notFound().build();
		}
	}
	
	@DeleteMapping("/veiculo/{id}")
	public ResponseEntity<String> removeVeiculo(@PathVariable int id) {
		if (bd.apagar(id)) {
			return ResponseEntity.ok("DELETED");
		} else {
			return ResponseEntity.notFound().build();
		}
	}
	
	
	
	

}
