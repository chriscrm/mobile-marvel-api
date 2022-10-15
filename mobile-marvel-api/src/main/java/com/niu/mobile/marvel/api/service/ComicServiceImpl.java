package com.niu.mobile.marvel.api.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.niu.mobile.marvel.api.entity.ComicEntity;
import com.niu.mobile.marvel.api.exceptions.CustomServiceException;
import com.niu.mobile.marvel.api.exceptions.ErrorMessages;
import com.niu.mobile.marvel.api.repository.ComicRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class ComicServiceImpl implements ComicService {
	
	private final ComicRepository comicRepository;
	

	@Override
	public List<ComicEntity> findComicsByCharacter(String characterName) {

		List<ComicEntity> comicsResult = null;
		//comicsResult = comicRepository.findByCharacters(characterName);
		comicsResult = comicRepository.findComicsByCharacterName(characterName);
		
		if(comicsResult == null) throw new CustomServiceException(ErrorMessages.COMIC_NOT_FOUND.getErrorMessage());
		
		return comicsResult;
	}
}