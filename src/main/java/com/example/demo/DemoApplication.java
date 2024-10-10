package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoApplication {
	
	
	 @GetMapping("/")
	 public String test()
	 {
		 return "welcome";
	 }
	 @GetMapping("//")
	 public String test1()
	 {
		 return "academy";
	 }
	public static void main(String[] args) {
		
		SpringApplication.run(DemoApplication.class, args);
				
		}

	

}