package com.sergio.auth.backend.resources.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.security.RolesAllowed;

@RestController
public class ResourceController {
//    @GetMapping("/")
//    public String getMessaes() {
//        return "the protected ";
//    }

    @GetMapping("/messages")
    @RolesAllowed("user")
    public String getMessages() {
        return "the protected messages";
    }
}
