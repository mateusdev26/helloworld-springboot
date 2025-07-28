package br.com.helloworld;

import lombok.extern.log4j.Log4j2;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Log4j2
@SpringBootApplication
public class HelloworldSpringbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloworldSpringbootApplication.class, args);
	}

}
