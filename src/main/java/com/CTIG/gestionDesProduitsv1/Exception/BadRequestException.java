package com.CTIG.gestionDesProduitsv1.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value=HttpStatus.BAD_REQUEST)
public class BadRequestException extends Throwable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 9203455426087743166L;

	public BadRequestException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

}
