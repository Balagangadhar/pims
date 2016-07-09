package com.comakeit.pims.data.exception;

public class InvalidObjectException extends RuntimeException {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 8921904001641739106L;

	public InvalidObjectException(String msg) {
		super(msg);
	}
	
	public InvalidObjectException() {
		super();
	}
}
