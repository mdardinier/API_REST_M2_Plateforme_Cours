package fr.ul.miage.m2.sid.plateformecours;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class SpringBootHelloWorld {
 
    @RequestMapping("/")
    public String home() {
        return "Hello World Spring Boot!";
    } 
}