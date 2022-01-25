package com.edu.springbootstart.controller;

import com.edu.springbootstart.model.Student;
import com.edu.springbootstart.repository.StudentJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {


   // ArrayList <Student> studentArrayList= new ArrayList<>();

   @Autowired
   StudentJpaRepository studentJpaRepository;

    //ENDPOINT1
    @RequestMapping("/add_student")
    public String add(@RequestBody Student student){


        studentJpaRepository.save(student);

        return "Student Added Successfully ....";
    }



    //ENDPOINT2
    @RequestMapping("/get_students")
    public List<Student> getStudentArrayList(){

        return studentJpaRepository.findAll();
    }
    //ENDPOINT3
    @RequestMapping("/update_student")
    public String update(@RequestParam String name, @RequestParam Long id){

        Student student=studentJpaRepository.getById(id);
        student.setName(name);
        studentJpaRepository.save(student);

       return "Name Update Successfully: "+name;
    }
    //ENDPOINT4
    @RequestMapping("/delete_student")
    public String remove(@RequestParam Long index){
        studentJpaRepository.deleteById(index);

        return "Element removed successfully";
    }
}
