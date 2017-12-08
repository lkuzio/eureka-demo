package xyz.javista.client.two.client;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("client-one")
public interface GreetingClient {

    @RequestMapping("/greeting")
    String greeting();
}
