package com.aml.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.aml.entity.ErrorResponse;

@ControllerAdvice
public class JwtCustomExceptionHandler extends ResponseEntityExceptionHandler{

	@ExceptionHandler(UnauthorizedException.class)
	public ResponseEntity<Object> handleUnauthorizedException(UnauthorizedException ex){
        int statusCode = HttpStatus.UNAUTHORIZED.value();
        ErrorResponse errorResponse = new ErrorResponse(HttpStatus.UNAUTHORIZED,ex.getMessage(),statusCode);
        return new ResponseEntity<>(errorResponse,HttpStatus.UNAUTHORIZED);
	}
}
