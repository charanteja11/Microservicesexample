package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Service1 {

	@RequestMapping("/")
	public Class1 hello() {
		Class1 c = new Class1();
		c.setName("charan");
		return c;
	}
}
