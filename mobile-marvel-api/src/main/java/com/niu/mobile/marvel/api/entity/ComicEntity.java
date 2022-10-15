package com.niu.mobile.marvel.api.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "comic")
public class ComicEntity {
	private long id;
	private long comicId;
	private String title;
	private int issueNumber;
	private String description;
	private String upc;
	private int pageCount;
	private String resourceURI;
	private String image;
	
}
