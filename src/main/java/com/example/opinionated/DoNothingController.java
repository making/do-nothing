package com.example.opinionated;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DoNothingController {
	@RequestMapping(path = "/**")
	public void doNothing() {

	}
}
