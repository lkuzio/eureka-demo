package xyz.javista.client.one;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
@RestController
public class ClientOneWebService {

    public static void main(String[] args){
        SpringApplication.run(ClientOneWebService.class, args);
    }

    @RequestMapping("/greeting")
    public String greeting() {
        return "Hello from Client One!";
    }
}
