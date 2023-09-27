package med.voll.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/helloWld")
public class HelloWorld {

    @GetMapping
    public String helloWld(){
        return "Hola mundo con Spring Boot";
    }
}
