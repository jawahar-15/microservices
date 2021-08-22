package com.microservices.restfulwebservices.exception;

import java.util.Date;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.microservices.restfulwebservices.user.IdCannotBeGivenException;
import com.microservices.restfulwebservices.user.NoUsersFoundException;
import com.microservices.restfulwebservices.user.UserAlreadyExistException;
import com.microservices.restfulwebservices.user.UserNotFoundException;

@ControllerAdvice
@RestController
public class EntityExceptionHandler extends ResponseEntityExceptionHandler{

	@ExceptionHandler(UserAlreadyExistException.class)
	public ResponseEntity<Object> handleUserExistsExceptions(UserAlreadyExistException ex, WebRequest request) throws Exception {
		ResponseException exception = new ResponseException(new Date(), ex.getMessage(), request.getDescription(false));
		return new ResponseEntity<Object>(exception, HttpStatus.ALREADY_REPORTED);
	}

	@ExceptionHandler(IdCannotBeGivenException.class)
	public ResponseEntity<Object> handleIdCannotbeGivenException(IdCannotBeGivenException ex, WebRequest request) throws Exception {
		ResponseException exception = new ResponseException(new Date(), ex.getMessage(), request.getDescription(false));
		return new ResponseEntity<Object>(exception, HttpStatus.BAD_REQUEST);
	}


	@ExceptionHandler(UserNotFoundException.class)
	public ResponseEntity<Object> handleNotFoundExceptions(UserNotFoundException ex, WebRequest request) throws Exception {
		ResponseException exception = new ResponseException(new Date(), ex.getMessage(), request.getDescription(false));
		return new ResponseEntity<Object>(exception, HttpStatus.NOT_FOUND);
	}


	@ExceptionHandler(NoUsersFoundException.class)
	public ResponseEntity<Object> NoUsersFoundFoundExceptions(NoUsersFoundException ex, WebRequest request) throws Exception {
		ResponseException exception = new ResponseException(new Date(), ex.getMessage(), request.getDescription(false));
		return new ResponseEntity<Object>(exception, HttpStatus.EXPECTATION_FAILED);
	}

	@ExceptionHandler(Exception.class)
	public ResponseEntity<Object> handleAllExceptions(Exception ex, WebRequest request) throws Exception {
		ResponseException exception = new ResponseException(new Date(), ex.getMessage(), request.getDescription(false));
		return new ResponseEntity<Object>(exception, HttpStatus.INTERNAL_SERVER_ERROR);
	}

	protected ResponseEntity<Object> handleMethodArgumentNotValid(
			MethodArgumentNotValidException ex, HttpHeaders headers, HttpStatus status, WebRequest request) {
		ResponseException exception = new ResponseException(new Date(), "Validation Failed", ex.getBindingResult().toString());
		return new ResponseEntity<Object>(exception, HttpStatus.BAD_GATEWAY);

	}
}
