package com.niu.mobile.marvel.api.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.niu.mobile.marvel.api.entity.ComicEntity;

@Repository
public interface ComicRepository extends CrudRepository<ComicEntity, Long> {
	
	@Query(value=
			"SELECT c FROM ComicEntity c")
	List<ComicEntity> findComicsByCharacterName(String name);
}
