package com.example.demoDeploy;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("print")
public class MyController {


    @GetMapping("hi")
    public ResponseEntity<String> sayHi(){
        return ResponseEntity.ok("Hello!");
    }


}
