package com.generation.crudcarro.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.generation.crudcarro.model.Carro;

@RestController
@RequestMapping("/api")
@CrossOrigin(allowedHeaders = "*", value = "")
public class CarroController {
	
	@GetMapping
	public ResponseEntity<String> carro(){
		return ResponseEntity.status(HttpStatus.OK).body("Eu sou um carrinho :^)");
	}
	
	@GetMapping("/carro")
	public ResponseEntity<Carro> carroComposto(){
		
		Carro resp = new Carro("Ford", "Prata", true);
		
		return ResponseEntity.status(HttpStatus.OK).body(resp);
	}

}
