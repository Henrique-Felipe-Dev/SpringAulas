package com.generation.crudvideogame.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.generation.crudvideogame.model.VideoGame;

@RestController
@RequestMapping("/api")
@CrossOrigin(allowedHeaders = "*", value = "")
public class VideoGameController {
	
	@GetMapping
	public ResponseEntity<String> videoGame(){
		return ResponseEntity.status(HttpStatus.OK).body("Sou um video game");
	}
	
	@GetMapping("videogame")
	public ResponseEntity<VideoGame> videoGameComposto(){
		
		VideoGame resp = new VideoGame("Xbox One", "Microsoft", "Preto", true);
		
		return ResponseEntity.status(HttpStatus.OK).body(resp);
	}

}
