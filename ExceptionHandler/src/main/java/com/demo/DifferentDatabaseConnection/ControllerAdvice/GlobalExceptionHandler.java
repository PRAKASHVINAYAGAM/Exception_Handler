package com.demo.DifferentDatabaseConnection.ControllerAdvice;
//GlobalExceptionHandler.java
//package com.example.demo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

 // Handle specific exception
 @ExceptionHandler(ResourceNotFoundException.class)
 public ResponseEntity<String> handleResourceNotFound(ResourceNotFoundException ex) {
     return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Resource not found: " + ex.getMessage());
 }

 // Handle generic exceptions
 @ExceptionHandler(Exception.class)
 public ResponseEntity<String> handleGlobalException(Exception ex) {
     return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("An error occurred: " + ex.getMessage());
 }
}
