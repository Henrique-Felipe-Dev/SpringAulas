package com.generation.crudcelular.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.generation.crudcelular.model.Celular;

@RestController
@RequestMapping("/api")
@CrossOrigin(allowedHeaders = "*", value = "")
public class CelularController {
	
	@GetMapping
	public ResponseEntity<String> celular(){
		return ResponseEntity.status(HttpStatus.OK).body("Sou um cerulá :D");
	}
	
	@GetMapping("/celular")
	public ResponseEntity<Celular> celularComposto(){
		
		Celular resp = new Celular("Android", 128, 8, true);
		
		return ResponseEntity.status(HttpStatus.OK).body(resp);
	}

}
