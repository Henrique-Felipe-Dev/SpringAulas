package com.generation.crudprato.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.generation.crudprato.model.PratoComida;

@RestController
@RequestMapping("/api")
@CrossOrigin(allowedHeaders = "*", value = "")
public class PratoController {
	
	@GetMapping
	public ResponseEntity<String> prato(){
		return ResponseEntity.status(HttpStatus.OK).body("Sou um prato de comida kk");
	}
	
	@GetMapping("/prato")
	public ResponseEntity<PratoComida> pratoComposto(){
		
		PratoComida resp = new PratoComida("Branco", true, true, "Carninha");
		
		return ResponseEntity.status(HttpStatus.OK).body(resp);
		
	}

}
