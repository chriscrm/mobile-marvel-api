package com.niu.mobile.marvel.api.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "creator")
public class CreatorEntity {
	private long id;
	private long creatorId;
	private String firstName;
	private String middleName;
	private String lastName;
	private String suffix;
	private String fullName;
	private String image;
	private String resourceURI;
}
