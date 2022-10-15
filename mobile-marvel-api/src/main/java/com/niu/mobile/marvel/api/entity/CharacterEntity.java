package com.niu.mobile.marvel.api.entity;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

@Data
@Entity
@Table(name = "characters")
public class CharacterEntity {
	@Id
	private long id;
	private long characterId;
	private String name;
	private String description;
	private String image;
	
	@JsonIgnore
	@ManyToMany(mappedBy = "characters")
	private Collection<ComicEntity> comics;
	
	@JsonIgnore
	@ManyToMany(mappedBy = "characters")
	private Collection<SerieEntity> series;
}
