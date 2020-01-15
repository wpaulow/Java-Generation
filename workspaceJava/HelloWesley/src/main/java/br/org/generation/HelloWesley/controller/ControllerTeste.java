package br.org.generation.HelloWesley.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//anotchação da classe aqui é mutcho importchantche
//a classe ControllerTeste será ativada via URL's graças à ela
@RestController
public class ControllerTeste {
	
	//se a URL for hello aparecerá isso aqui...
	@GetMapping("/hello")
	public String sayHello() {
		return "Hello World! Nosso primeiro projeto Spring Boot";
	}
	
	@GetMapping("/bye")
	public String sayGoodBye() {
		return "<h1>Tiau</h1>";
	}
}
