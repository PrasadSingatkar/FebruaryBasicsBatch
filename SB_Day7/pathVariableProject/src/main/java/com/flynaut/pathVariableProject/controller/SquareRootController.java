package com.flynaut.pathVariableProject.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class SquareRootController {

    @GetMapping("/sqrt/{number}")
    public String getSquareRoot(@PathVariable double number){
        if (number < 0 ){
            return "Negative number is not supported!!";
        }

        double result = Math.sqrt(number);
        return "Square root of "+ number + " is: "+ result;
    }
}
