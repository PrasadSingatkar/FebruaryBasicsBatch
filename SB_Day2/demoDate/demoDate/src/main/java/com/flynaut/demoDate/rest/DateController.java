package com.flynaut.demoDate.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@RestController
public class DateController {
    //@RequestMapping(value="/date",method = RequestMethod.GET)
    @GetMapping("/date")
    public LocalDate date(){
        LocalDate localDate = LocalDate.now();
        return localDate;
    }
}
