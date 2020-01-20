package br.org.generation.crud.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.org.generation.crud.model.Veiculo;

@RestController
public class VeiculoController {

	@GetMapping("/veiculo/teste")
	public Veiculo testeVeiculo() {
		
		Veiculo v = new Veiculo(1234, "Voks", "Fuqueta", 1978, 13000);
		v.setCor("vermeio grená");
		v.setTipo("esportivo");
		v.setDetalhes("Veiculo impecável."
				+ "Motor zero" 
				+ "Chique e bacanizado.");
		return v;
	}
	
	
	
	
	

}
