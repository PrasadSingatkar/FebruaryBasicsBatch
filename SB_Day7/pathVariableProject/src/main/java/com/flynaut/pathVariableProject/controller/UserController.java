package com.flynaut.pathVariableProject.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {

    //Fetch user by ID
    @GetMapping("/{id}")
    public String getUserByID(@PathVariable int id){
        return "User with ID: "+id;
    }

    //Fetch user by name
    @GetMapping("/name/{username}")
    public String getUserByName(@PathVariable("username") String name){
        return "User with name: "+name;
    }
}
