package com.niu.mobile.marvel.api.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.niu.mobile.marvel.api.entity.ComicEntity;
import com.niu.mobile.marvel.api.service.ComicService;

@RestController
@RequestMapping("/comics")
public class ComicController {
	
	private final ComicService comicService;
	
	public ComicController(ComicService comicService) {
		this.comicService = comicService;
	}

	@GetMapping()
	public ResponseEntity<List<ComicEntity>> getComicsByCharacter(@RequestParam(name = "character") String characterName){
		
		List<ComicEntity> comicList = comicService.findComicsByCharacter(characterName);
		
		return ResponseEntity.status(HttpStatus.OK).body(comicList);
	}
	
}
