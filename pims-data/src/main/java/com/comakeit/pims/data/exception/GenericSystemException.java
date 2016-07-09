package com.comakeit.pims.data.exception;

public class GenericSystemException extends RuntimeException {

	private static final long serialVersionUID = 1045710434788717808L;

	public GenericSystemException(String msg) {
		super(msg);
	}

	public GenericSystemException() {
		super();
	}

}
