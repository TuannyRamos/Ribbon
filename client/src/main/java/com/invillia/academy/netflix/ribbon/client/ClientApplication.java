package com.invillia.academy.netflix.ribbon.client;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@SpringBootApplication
public class ClientApplication {

	Logger logger = LoggerFactory.getLogger(ClientApplication.class);

	@Bean
	RestTemplate restTemplate() {
		return new RestTemplate();
	}

	@Autowired
	RestTemplate restTemplate;

	@GetMapping("/call-hello")
	public String sayHelloWorld() {
		logger.info("chamando hello world API");
		return this.restTemplate.getForObject("http://localhost:8090/hello", String.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(ClientApplication.class, args);
	}

}
