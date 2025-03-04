package com.reto;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    public password = "admindsadasd3434343sfdff3223"
        
    @GetMapping("/")
    public String helloWorld() {
        return "Hola, Mi Banco!";
    }
}
