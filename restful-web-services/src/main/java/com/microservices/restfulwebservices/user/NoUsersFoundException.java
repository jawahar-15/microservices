package com.microservices.restfulwebservices.user;

public class NoUsersFoundException extends RuntimeException  {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public NoUsersFoundException(String message) {
		super(message);
	}
}
