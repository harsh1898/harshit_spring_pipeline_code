package com.harsh.springPieplineCode.SpringPieplineCode;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/harshit")
public class SpringPieplineCodeApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringPieplineCodeApplication.class, args);
	}

	@GetMapping("/read")
	public  String readInfo(){
		return ("Reading Springboot CI/CD Pipeline application");
	}
	@GetMapping("/readData")
	return("Reading another Springboot end point");

}
