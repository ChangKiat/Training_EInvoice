package com.training.einvoice.einvoice_api;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TrainingController {
	private static final Logger log =
	        LoggerFactory.getLogger(TrainingController.class);
	@RequestMapping("/")
	public String greet() {
		log.info("Hello World");
		return "Hello World";
	}
}
