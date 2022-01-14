package com.edu.springbootstart.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {


    @RequestMapping("/add")
    public String  addition(){

        int a=3; int b=13;

        int sum=a+b;
     return  "Addition of a and b is: "+sum;
    }

    @RequestMapping("/sub")
    public String  subtraction(){

        int a=33; int b=13;

        int result=a-b;
        return  "Subtraction of a and b is: "+result;
    }

}
