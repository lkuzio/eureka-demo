package xyz.javista.client.two;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import xyz.javista.client.two.client.GreetingClient;

@SpringBootApplication
@EnableEurekaClient
@RestController
@Configuration
@EnableFeignClients
public class ClientTwoWebService {

    @Autowired
    GreetingClient greetingClient;

    public static void main(String[] args) {
        SpringApplication.run(ClientTwoWebService.class, args);
    }

    @RequestMapping("/greeting")
    public String greeting() {
        String textFrom1stClient = greetingClient.greeting();
        return "Response from 1st client:"+textFrom1stClient;
    }
}
