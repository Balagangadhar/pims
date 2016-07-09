package com.comakeit.pims.data.exception;

public class ObjectAlreadyExistsException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2046754022277437277L;

	/*
	 * private String type; private String name;
	 */

	public ObjectAlreadyExistsException(String type, String name) {
		super(type + " <b>" + name + "</b> already exists");
	}
	
	public ObjectAlreadyExistsException(String name) {
		super(name + " already exists");
	}
	
	public ObjectAlreadyExistsException() {
		super();
	}

}