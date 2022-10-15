package com.niu.mobile.marvel.api.entity;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "character")
public class CharacterEntity {
	private long id;
	private long characterId;
	private String name;
	private String description;
	private String image;
	private Collection<ComicEntity> comics;
}
