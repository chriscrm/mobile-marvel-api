package com.niu.mobile.marvel.api.exceptions;

import java.util.Date;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.context.request.WebRequest;

/**
 * Class {@code CustomExceptionHandler} is a custom exception handler of 
 * exceptions that can be thrown during the normal operation
 * 
 * @author CrisR
 * @since   1.0
 *
 */

@ControllerAdvice
public class CustomExceptionHandler {

	@ExceptionHandler(value = {CustomServiceException.class})
	@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
	public ResponseEntity<Object> handleCustomServiceException(CustomServiceException ex, WebRequest request){
		ErrorMessageResponse errorMessageResponse = new ErrorMessageResponse(new Date(), ex.getMessage());
		return new ResponseEntity<>(errorMessageResponse, new HttpHeaders(), HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
}
