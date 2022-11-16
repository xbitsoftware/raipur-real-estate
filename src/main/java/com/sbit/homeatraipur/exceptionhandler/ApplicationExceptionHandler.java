package com.sbit.homeatraipur.exceptionhandler;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.sbit.homeatraipur.exceptions.ExceptionMessage;
import com.sbit.homeatraipur.exceptions.IndependentHouseNotFoundException;

@RestControllerAdvice
public class ApplicationExceptionHandler {
	
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public Map<String, String> handelInvalidArgument(MethodArgumentNotValidException ex){
		Map<String,String> errormap = new HashMap<>();
		
		ex.getBindingResult().getFieldErrors().forEach(error -> {
			errormap.put(error.getField(), error.getDefaultMessage());
		});
		
		return errormap;
	}
	
	
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	@ExceptionHandler(IndependentHouseNotFoundException.class)
	public ExceptionMessage houseNotFound(IndependentHouseNotFoundException ex) {
		
		ExceptionMessage exc = new ExceptionMessage(ex.getMessage());
		
		return exc;
	}


}
