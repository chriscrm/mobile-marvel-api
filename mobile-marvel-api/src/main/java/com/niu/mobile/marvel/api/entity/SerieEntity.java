package com.niu.mobile.marvel.api.entity;

import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "serie")
public class SerieEntity {
	@Id
	private long id;
	private long serieId;
	private String title;
	private String description;
	private String resourceURI;
	private int startYear;
	private int endYear;
	private String type;
	private String image;
	
	@ManyToMany(cascade = CascadeType.PERSIST)
	@JoinTable(name = "series_has_characters", joinColumns = @JoinColumn(name = "serie_id", referencedColumnName = "id"),
				inverseJoinColumns = @JoinColumn(name = "characters_id", referencedColumnName = "id"))
	private Collection<CharacterEntity> characters;
}
