package com.fcamara.challenge.controllers;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/auth")
public class AuthController {

   @GetMapping("/")
   public String home() {
       return "Hello spring";
   }
    
}
