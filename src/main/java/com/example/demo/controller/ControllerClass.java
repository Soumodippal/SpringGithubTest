package com.example.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class ControllerClass {
	
	@GetMapping
	public ResponseEntity<String> testMethod() {
		return new ResponseEntity<>("Soumodip pal",HttpStatus.OK);
	}
	
	@GetMapping("/secnd")
	public ResponseEntity<String> testMethod2() {
		return new ResponseEntity<>("Soumodip pal test method 2",HttpStatus.OK);
	}
}
