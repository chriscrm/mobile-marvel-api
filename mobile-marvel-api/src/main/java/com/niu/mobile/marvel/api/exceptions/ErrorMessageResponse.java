package com.niu.mobile.marvel.api.exceptions;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ErrorMessageResponse {
	private Date timestamp;
	private String message;
}
