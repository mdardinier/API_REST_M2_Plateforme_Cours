package fr.ul.miage.m2.sid.plateformecours;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("admin")
@EnableAutoConfiguration
public class AdministrateurController {
 
    @RequestMapping("/")
    public String home() {
        return "Partie administration";
    } 
}