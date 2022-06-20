package com.generation.crudcasa.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.generation.crudcasa.model.Casa;

@RestController
@RequestMapping("/api")
@CrossOrigin(allowedHeaders = "*", value = "")
public class CasaController {
	
	@GetMapping
	public ResponseEntity<String> casaSimples(){
		return ResponseEntity.status(HttpStatus.OK).body("Eu sou uma casinha");
	}
	
	@GetMapping("/casaComposta")
	public ResponseEntity<Casa> casaComposta(){
		
		Casa respCasa = new Casa("Vermelha", 5, 3);
		
		return ResponseEntity.status(HttpStatus.OK).body(respCasa);
	}

}
