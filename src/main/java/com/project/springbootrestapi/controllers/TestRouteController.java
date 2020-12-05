package com.project.springbootrestapi.controllers;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.project.springbootrestapi.restservice.TestRoute;

@RestController
public class TestRouteController {

	private static final String template = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();

	@GetMapping("/testroute")
	public TestRoute greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
		return new TestRoute(counter.incrementAndGet(), String.format(template, name));
	}
}