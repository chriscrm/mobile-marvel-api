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
@Table(name = "creator")
public class CreatorEntity {
	@Id
	private long id;
	private long creatorId;
	private String firstName;
	private String middleName;
	private String lastName;
	private String suffix;
	private String fullName;
	private String image;
	private String resourceURI;
	
	@JsonIgnore
	@ManyToMany(mappedBy = "creators")
	private Collection<ComicEntity> comics;
}
