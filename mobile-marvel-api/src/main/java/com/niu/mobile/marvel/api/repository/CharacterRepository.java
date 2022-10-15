package com.niu.mobile.marvel.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.niu.mobile.marvel.api.entity.CharacterEntity;

@Repository
public interface CharacterRepository extends JpaRepository<CharacterEntity, Long> {

	
}
