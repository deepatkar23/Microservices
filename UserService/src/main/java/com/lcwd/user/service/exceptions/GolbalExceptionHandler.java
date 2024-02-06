package com.lcwd.user.service.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.lcwd.user.service.payload.ApiResponse;



@RestControllerAdvice
public class GolbalExceptionHandler {

	@ExceptionHandler(ResourceNotFoundException.class)
	public String handlerResourceNotFoundException(ResourceNotFoundException ex){
		
		String message=ex.getMessage();
		
		
		/*
		 * ApiResponse
		 * build=ApiResponse.builder().message(message).success(true).status(HttpStatus.
		 * NOT_FOUND).build();
		 */
		 
		 
		
		//return new ResponseEntity<ApiResponse>(build,HttpStatus.NOT_FOUND);
		
		return message;
	}
	
}
