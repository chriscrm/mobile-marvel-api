package com.niu.mobile.marvel.api.service;

import org.springframework.stereotype.Service;

import com.niu.mobile.marvel.api.entity.CharacterEntity;
import com.niu.mobile.marvel.api.exceptions.CustomServiceException;
import com.niu.mobile.marvel.api.exceptions.ErrorMessages;
import com.niu.mobile.marvel.api.repository.CharacterRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class CharacterServiceImpl implements CharacterService {
	
	private final CharacterRepository characterRepository;


	/**
	 * {@code findByNameAndComicAndSerie} method used to find Character by its name and comic and serie
	 * 
	 * @param String name character name's
	 * @param String comic comic title's
	 * @param String serie serie title's
	 */
	@Override
	public CharacterEntity findByNameAndComicAndSerie(String name, String comic, String serie) {
		
		CharacterEntity characterEntity = characterRepository.findCharacterByNameAndComicAndSerie(name, comic, serie);
		
		if(characterEntity == null) throw new CustomServiceException(ErrorMessages.CHARACTER_NOT_FOUND.getErrorMessage());
		
		return characterEntity;
	}

}
