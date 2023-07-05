package com.aml.exception;

public class AccountDetailsNotFound extends RuntimeException{
	
	private static final long serialVersionUID = 1L;
	private String errormessage;
	public String getErrormessage() {
		return errormessage;
	}
	public void setErrormessage(String errormessage) {
		this.errormessage = errormessage;
	}
	public AccountDetailsNotFound(String errormessage) {
		super();
		this.errormessage = errormessage;
	}
	public AccountDetailsNotFound() {
	}
	

}
