package com.amdocs.project11;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JenProject {
	@GetMapping("/in")
	public String show() {
		String s = "Hello.....Everyone Welcome to Jenkins....";
		return s +"id:21345";
	}

}
