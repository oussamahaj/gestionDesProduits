package com.CTIG.gestionDesProduitsv1.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value=HttpStatus.NOT_FOUND)
public class RessourceNotFoundException extends Throwable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3155385728632388906L;

	public RessourceNotFoundException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	
}
