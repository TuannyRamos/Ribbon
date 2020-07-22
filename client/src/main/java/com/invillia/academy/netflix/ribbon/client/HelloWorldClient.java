package com.invillia.academy.netflix.ribbon.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "helloWorld", url = "http://localhost:8090/")
public interface HelloWorldClient {

    @GetMapping("/hello")
    String getHelloFromServer();
}
