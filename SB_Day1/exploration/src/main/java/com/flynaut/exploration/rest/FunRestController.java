package com.flynaut.exploration.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    //exposing the endpoint - "/name" which will return name
    @GetMapping("/name")
    public String sayName(){
      return "PrasadJain";
    }

    //To return the today's date
    //TASK

}
