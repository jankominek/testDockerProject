package com.testDocker.testDocker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class TestDockerApplication {

	@GetMapping("/test")
	public String test(){
		return "Test przebiegł prawidłowo!";
	}
	public static void main(String[] args) {
		SpringApplication.run(TestDockerApplication.class, args);
	}



}
