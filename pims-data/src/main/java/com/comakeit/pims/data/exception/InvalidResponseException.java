package com.comakeit.pims.data.exception;

public class InvalidResponseException extends RuntimeException {
	
	private int errorCode;
	
	public InvalidResponseException(Exception ex){
		super(ex);
	}

	public InvalidResponseException(int status) {
		super(""+status);
		this.setErrorCode(status);
	}

	public int getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(int errorCode) {
		this.errorCode = errorCode;
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

}
