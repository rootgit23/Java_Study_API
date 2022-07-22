package com.im.exception;

public class MyException extends Exception {
	public MyException() {
		super("몰라요 산수 포기");
		
	}
	
	public MyException(String message) {
		super(message);
	}
}
