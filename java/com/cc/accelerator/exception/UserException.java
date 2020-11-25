package com.cc.accelerator.exception;

public class UserException extends RuntimeException{

	private static final long serialVersionUID = -0x197DCF6DE094BCE8L;

	public UserException() {
	}

	public UserException(String message) {
		super(message);
	}
}
