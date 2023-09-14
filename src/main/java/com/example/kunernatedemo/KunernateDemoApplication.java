package com.example.kunernatedemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class KunernateDemoApplication {
	
	
	@GetMapping("/done")
	public String demo() {
		return "finally you did it";
	}
	

	public static void main(String[] args) {
		SpringApplication.run(KunernateDemoApplication.class, args);
	}

}
