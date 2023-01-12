package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Dockercontroller {

	@GetMapping("welcome")
	public String message()
	{
		return "welcome to docker";
	}
}
