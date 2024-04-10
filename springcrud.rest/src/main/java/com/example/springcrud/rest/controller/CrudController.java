package com.example.springcrud.rest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("main")
public class CrudController {

	@GetMapping("view")
	public String viewAll()
	{
		return "im inside controller";
		
	}
	
}
