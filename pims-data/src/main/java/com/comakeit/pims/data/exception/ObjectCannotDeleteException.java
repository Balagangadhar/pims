package com.comakeit.pims.data.exception;

public class ObjectCannotDeleteException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2046754022277437277L;

	/*
	 * private String type; private String name;
	 */

	public ObjectCannotDeleteException(String message) {
		super(message);
	}
	
	public ObjectCannotDeleteException() {
		super();
	}

}