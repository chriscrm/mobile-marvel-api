package com.niu.mobile.marvel.api.controller;

import org.modelmapper.ModelMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;

@RestController
@RequestMapping("/characters")
public class CharactersController {
	
	private ModelMapper modelMapper;

	public CharactersController(ModelMapper modelMapper) {
		this.modelMapper = modelMapper;
	}

	/** 
	 * GET Character by its name, comic and serie :::::::::::::::::
	 * @GetMapping Get Character
	 * @return Returns a CharacterModelResponse and ResponseEntity with status 200 if success
	 */
	@Operation(summary = "Get a Character by its name, comic and serie")
	@ApiResponses(value = { 
			@ApiResponse(responseCode = "200", description = "Character found", 
		    content = { @Content(mediaType = "application/json", 
		      schema = @Schema(implementation = String.class)) }), // TODO
		  @ApiResponse(responseCode = "400", description = "Invalid name, comic or serie supplied", 
		    content = @Content), 
		  @ApiResponse(responseCode = "404", description = "Character not found", 
		    content = @Content) 
			  })
	@GetMapping()
	public ResponseEntity<String> getCharacter(@RequestParam String name, 
			@RequestParam String comic,
			@RequestParam String serie){
		// TODO
		
		return ResponseEntity.status(HttpStatus.OK).body(name);
	}
	
	
}
