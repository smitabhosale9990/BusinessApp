package com.app.advice;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import com.app.constants.ServiceStatus;
import com.app.exceptions.DataNotFoundException;
import com.app.model.BaseServiceResponse;

@RestControllerAdvice
public class ErrorControllerAdvice {

	@ExceptionHandler(value = DataNotFoundException.class)
	public ResponseEntity<BaseServiceResponse> handleDataNotFoundException(DataNotFoundException exception) {
		BaseServiceResponse obj = new BaseServiceResponse(ServiceStatus.FAILURE, exception.getMessage());
		return new ResponseEntity<>(obj, HttpStatus.INTERNAL_SERVER_ERROR);
	}
}
