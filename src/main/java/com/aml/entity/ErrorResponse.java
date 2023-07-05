package com.aml.entity;

import org.springframework.http.HttpStatus;

public class ErrorResponse {
private HttpStatus status;
private String message;
private int statusCode;
public ErrorResponse() {
	super();
}
public ErrorResponse(HttpStatus status, String message,int statusCode) {
	super();
	this.status = status;
	this.message = message;
	this.statusCode=statusCode;
}
public HttpStatus getStatus() {
	return status;
}
public void setStatus(HttpStatus status) {
	this.status = status;
}
public String getMessage() {
	return message;
}
public void setMessage(String message) {
	this.message = message;
}


public int getStatusCode() {
	return statusCode;
}
public void setStatusCode(int statusCode) {
	this.statusCode = statusCode;
}
@Override
public String toString() {
	return "ErrorResponse [status=" + status + ", message=" + message + ", statusCode=" + statusCode + "]";
}

}
