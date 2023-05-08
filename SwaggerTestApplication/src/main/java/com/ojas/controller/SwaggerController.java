package com.ojas.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/swg")
//  http://localhost:9090/swagger-ui.html
//  http://localhost:9090/v2/api-docs
public class SwaggerController {
	
	@GetMapping("/swgMathod")
	public String swgMethod() {
		return "Welcome to Swagger";
	}
}
