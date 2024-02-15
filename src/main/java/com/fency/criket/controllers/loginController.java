package com.fency.criket.controllers;

import com.fency.criket.entities.loginUser;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class loginController {

    @PostMapping("/login")
    ResponseEntity<String> loginPost(@RequestBody loginUser user){
        System.out.println(user.username);
        return ResponseEntity.status(200).body("User Logged In");
    }

}
