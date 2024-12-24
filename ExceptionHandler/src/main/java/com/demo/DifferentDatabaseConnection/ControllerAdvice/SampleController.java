package com.demo.DifferentDatabaseConnection.ControllerAdvice;

//SampleController.java
//package com.example.demo.controller;

//import com.example.demo.exception.ResourceNotFoundException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

 @GetMapping("/resource/{id}")
 public String getResource(@PathVariable("id") String id) {
     if ("123".equals(id)) {
         return "Resource found!";
     } else {
         throw new ResourceNotFoundException("Resource with ID " + id + " not found");
     }
 }
}
