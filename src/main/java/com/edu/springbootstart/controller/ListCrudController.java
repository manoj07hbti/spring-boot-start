package com.edu.springbootstart.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class ListCrudController {

    // CRUD

    ArrayList <String > courseList= new ArrayList<>();//GLOBAL DECLARATION

    //CREATE or ADD ENDPOINT
    @RequestMapping("/add_to_list")
    public String add(@RequestParam String element){

        courseList.add(element);

        return "Added Successfully "+element;
    }

    //READ or GET END POINT
    @RequestMapping("/get_course_list")
    public ArrayList<String> getCourseList(){

        return courseList;
    }

    //UPDATE
    @RequestMapping("/update")
    public String update(@RequestParam String element, @RequestParam int index){

        courseList.set(index,element);

        return "element updated "+element;
    }
    //DELETE or remove

    @RequestMapping("/remove")
    public String remove( @RequestParam int index){

        courseList.remove(index);

        return "Element removed Successfully";
    }


}
