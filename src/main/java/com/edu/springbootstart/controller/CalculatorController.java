package com.edu.springbootstart.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {

// PATH VARIABLE
    @RequestMapping("/add/{a}/{b}")
    public String  addition(@PathVariable int a, @PathVariable int b){

        int sum=a+b;
     return  "Addition of a and b is: "+sum;
    }


// REQUEST PARAM
    @RequestMapping("/sub")
    public String  subtraction(@RequestParam int a, @RequestParam int b){

        int result=a-b;
        return  "Subtraction of a and b is: "+result;
    }

}
