package com.niu.mobile.marvel.api.exceptions;

/**
 * {@code CustomServiceException} this class extends of superclass RuntimeException
 * to catch exceptions that can be thrown during the normal operation of the Java Virtual Machine.
 * 
 * @author CrisR
 * @since   1.0
 */
public class CustomServiceException extends RuntimeException {

	private static final long serialVersionUID = 4647897500780819730L;

	/** 
	 * Constructs a new runtime exception with the specified detail message.
	 * @param   message   the detail message.
     */
	public CustomServiceException(String message) {
		super(message);
	}
}
