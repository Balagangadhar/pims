package com.comakeit.pims.data.exception;

public class ObjectCreationNotAllowedException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2046754022277437277L;

	/*
	 * private String type; private String name;
	 */

	public ObjectCreationNotAllowedException(String message) {
		super(message);
	}

	public ObjectCreationNotAllowedException() {
		super();
	}

}
