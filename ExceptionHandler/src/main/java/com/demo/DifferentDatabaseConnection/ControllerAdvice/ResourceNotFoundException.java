package com.demo.DifferentDatabaseConnection.ControllerAdvice;
//ResourceNotFoundException.java
//package com.example.demo.exception;

public class ResourceNotFoundException extends RuntimeException {
	
     public ResourceNotFoundException(String message) 
     {
     super(message);
     }
}
