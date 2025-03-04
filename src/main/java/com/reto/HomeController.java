package com.reto;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    public password = "VbhpJgFkEc4rk86cpZhWKV";
        
    @GetMapping("/")
    public String helloWorld() {
        return "Hola, Mi Banco!";
    }
}
