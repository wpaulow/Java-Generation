package br.com.eureka.projetointegrador.controller;

import java.util.ArrayList;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.eureka.projetointegrador.bd.BdFeed;
import br.com.eureka.projetointegrador.model.Feed;

@CrossOrigin("*")
@RestController
public class FeedController {
	
	private BdFeed bd = new BdFeed();
	
	@PostMapping("/feed")
	public ResponseEntity<Feed> novoPost(@RequestBody Feed feed){
		bd.gravar(feed);
		return ResponseEntity.ok(feed);
	}
	
	@GetMapping("/feed/{idPostagem}")
	public ResponseEntity<Feed> getFeed(@PathVariable int idPostagem){
		Feed f = bd.buscar(idPostagem);
		if (f != null) {
			return ResponseEntity.ok(f);
		} else {
			return ResponseEntity.notFound().build();
		}
	}
	
	@GetMapping("/feed/todos")
	public ResponseEntity<ArrayList<Feed>> getTodos(){
		return ResponseEntity.ok(bd.buscarTodos());
	}
	
	@PutMapping("/feed")
	public ResponseEntity<String> alteraFeed(@RequestBody Feed feed){
		bd.atualizar(feed); //se der erro tentar f
		return ResponseEntity.ok("Success!");
	}
	
	@DeleteMapping("/feed/{idPostagem}")
	public ResponseEntity<String> removePost (@PathVariable int idPostagem){
		if(bd.deletar(idPostagem)) {
			return ResponseEntity.ok("Deleted!");
		} else {
			return ResponseEntity.notFound().build();
		}
	}
}
