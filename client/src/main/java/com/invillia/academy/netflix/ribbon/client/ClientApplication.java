package com.invillia.academy.netflix.ribbon.client;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableFeignClients
@SpringBootApplication
public class ClientApplication {

	Logger logger = LoggerFactory.getLogger(ClientApplication.class);

	@Autowired
	private HelloWorldClient helloWorldClient;

	@GetMapping("/call-hello")
	public String sayHelloWorld() {
		logger.info("chamando hello world API");
		return helloWorldClient.getHelloFromServer();
	}

	public static void main(String[] args) {
		SpringApplication.run(ClientApplication.class, args);
	}

}
