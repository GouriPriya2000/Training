package com.training.task9;

public class InvalidEmailException extends Exception {

	private String message;
	
	
	public InvalidEmailException(String message) {
		super();
		this.message = message;
	}


	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return this.message;
	}

	
}