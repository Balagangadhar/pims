package com.comakeit.pims.data.exception;

public class ObjectUpdationNotAllowedException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2046754022277437277L;
	
	/*private String type;
	private String name;*/
	
	public ObjectUpdationNotAllowedException(String message) {
		super(message);
	}
	
	public ObjectUpdationNotAllowedException() {
		super();
	}

}
