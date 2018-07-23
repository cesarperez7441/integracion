package com.azteca.service01.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class Cotrolador {

	@GetMapping()
	public String saludar() {
		return "Spring Boot Hello";
	}
}
