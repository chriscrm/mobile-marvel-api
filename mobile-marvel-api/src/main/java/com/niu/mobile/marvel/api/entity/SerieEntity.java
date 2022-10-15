package com.niu.mobile.marvel.api.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "serie")
public class SerieEntity {
	private long id;
	private long serieId;
	private String title;
	private String description;
	private String resourceURI;
	private int startYear;
	private int endYear;
	private String type;
	private String image;
}
