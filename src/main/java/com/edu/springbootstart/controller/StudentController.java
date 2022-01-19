package com.edu.springbootstart.controller;

import com.edu.springbootstart.model.Student;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class StudentController {


    ArrayList <Student> studentArrayList= new ArrayList<>();


    //ENDPOINT1
    @RequestMapping("/add_student")
    public String add(){

        Student student1= new Student("Raj",23,"CS");

        studentArrayList.add(student1);

        return "Student Added Successfully ....";
    }



    //ENDPOINT2
    @RequestMapping("/get_students")
    public ArrayList<Student> getStudentArrayList(){

        return studentArrayList;
    }
    //ENDPOINT3
    @RequestMapping("/update_student")
    public String update(@RequestParam String name){

       studentArrayList.get(0).setName(name);

       return "Name Update Successfully: "+name;
    }
    //ENDPOINT4
    @RequestMapping("delete_student")
    public String remove(@RequestParam int index){
        studentArrayList.remove(index);

        return "Element removed successfully";
    }
}
