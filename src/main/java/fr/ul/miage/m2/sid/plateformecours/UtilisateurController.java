package fr.ul.miage.m2.sid.plateformecours;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class UtilisateurController {
 
    @RequestMapping("/user")
    public String home() {
        return "Partie utilisateur";
    } 
}