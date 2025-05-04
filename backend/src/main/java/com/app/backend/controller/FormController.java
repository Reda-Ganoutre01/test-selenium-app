package com.app.backend.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*")
public class FormController {
    @GetMapping("/")
    public  String getForm(){
        return  "hello in Form";
    }

    @PostMapping("/submit")
    public String handelSubmit(@RequestParam String username,
                               @RequestParam String email,
                               @RequestParam String message){
            return  "Form submitted successfully!";
    }
}
