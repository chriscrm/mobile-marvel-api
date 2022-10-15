package com.niu.mobile.marvel.api.service;

import com.niu.mobile.marvel.api.entity.CharacterEntity;

public interface CharacterService {
	CharacterEntity findByNameAndComicAndSerie(String name, String comic, String serie);
}
