package com.roms.packagingdelivery.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;

import java.util.Date;

@ControllerAdvice
@RestController
public class GlobalExceptionHandler {
    @ExceptionHandler(Exception.class)
    public final ResponseEntity<Object> handleAllExceptions(Exception ex, WebRequest request) {
        ExceptionResponse e = new ExceptionResponse();
        return new ResponseEntity<>(e, HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @ExceptionHandler(ComponentTypeNotFoundException.class)
    public final ResponseEntity<Object> handleCardNotFoundException(ComponentTypeNotFoundException ex, WebRequest request) {
        ExceptionResponse e = new ExceptionResponse();
        return new ResponseEntity<>(e, HttpStatus.BAD_REQUEST);
    }

}
