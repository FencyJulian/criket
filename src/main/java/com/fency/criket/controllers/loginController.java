package com.fency.criket.controllers;

import com.fency.criket.entities.*;
import com.fency.criket.repositories.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class loginController {
    @Autowired
    private userRepository lrepo;

    @PostMapping("/login")
    public ResponseEntity<String> loginPost(@RequestBody loginUser user) {
        lrepo.save(user);
        return ResponseEntity.status(200).body("User Logged In");
    }
}