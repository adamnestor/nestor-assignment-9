package com.coderscampus.nestorassignment9.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FileController {

	@GetMapping("")
	public String saySomething() {
		return "Say Something Adam!!!!";
	}
}
