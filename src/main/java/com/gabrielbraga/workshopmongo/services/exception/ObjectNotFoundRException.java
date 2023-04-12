package com.gabrielbraga.workshopmongo.services.exception;

public class ObjectNotFoundRException extends RuntimeException{
	private static final long serialVersionUID = 1L;
	
	public ObjectNotFoundRException(String msg) {
		super(msg);
	}

}
