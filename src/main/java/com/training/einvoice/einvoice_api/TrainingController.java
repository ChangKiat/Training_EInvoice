package com.training.einvoice.einvoice_api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TrainingController {

	@RequestMapping("/")
	public String greet() {
		return "Hello World";
	}
}
