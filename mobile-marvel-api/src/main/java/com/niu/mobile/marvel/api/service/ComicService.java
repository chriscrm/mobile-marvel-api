package com.niu.mobile.marvel.api.service;

import java.util.List;

import com.niu.mobile.marvel.api.entity.ComicEntity;

public interface ComicService {
	List<ComicEntity> findComicsByCharacter(String characterName);
}
