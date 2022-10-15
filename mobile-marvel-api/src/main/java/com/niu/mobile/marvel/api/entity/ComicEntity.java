package com.niu.mobile.marvel.api.entity;

import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "comic")
public class ComicEntity {
	@Id
	private long id;
	private long comicId;
	private String title;
	private int issueNumber;
	private String description;
	private String upc;
	private int pageCount;
	@Column(name = "resource_uri")
	private String resourceURI;
	private String image;
	
	@ManyToMany(cascade = CascadeType.PERSIST)
	@JoinTable(name = "comic_has_creators", joinColumns = @JoinColumn(name = "comic_id", referencedColumnName = "id"),
				inverseJoinColumns = @JoinColumn(name = "creator_id", referencedColumnName = "id"))
	private Collection<CreatorEntity> creators;
	
	@ManyToMany(cascade = CascadeType.PERSIST)
	@JoinTable(name = "comics_has_characters", joinColumns = @JoinColumn(name = "comic_id", referencedColumnName = "id"),
				inverseJoinColumns = @JoinColumn(name = "character_id", referencedColumnName = "id"))
	private Collection<CharacterEntity> characters;
}
