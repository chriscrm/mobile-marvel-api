package com.niu.mobile.marvel.api.exceptions;

/**
 * Enumeration of Custom Error Messages if content cannot be retrieved
 *  
 * @author CrisR
 * @since   1.0
 *
 */

public enum ErrorMessages {
	CHARACTER_NOT_FOUND("Character doesn't exists or not found"),
	COMIC_NOT_FOUND("Comic doesn't exists"),
	SERIE_NOT_FOUND("Serie doesn't exists"),
	CREATOR_NOT_FOUND("Creator doesn't exists");
	
	private String errorMessage;
	
	private ErrorMessages(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
}
