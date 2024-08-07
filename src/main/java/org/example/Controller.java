package org.example;

import org.springframework.web.bind.annotation.*;

@RestController
public class Controller {
    @PostMapping("/test")
    public String test(@RequestBody SomeVal a){
        System.out.println(a);
        return a.toString();
    }
}
