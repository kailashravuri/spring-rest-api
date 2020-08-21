package com.example.restservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@RestController
@Component
public class GreetingController {
	
	private MessageService messageService;
	
	@Autowired
	public GreetingController(MessageService messageService)
	{
		this.messageService = messageService;
	}

	@GetMapping("/")
	public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
		return this.messageService.getMessage(name);
	}
}
