package com.edu.springbootstart.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity(name = "STUDENT_TABLE_MORNING")
public class Student {

    @Id
    @GeneratedValue // Automatically increment current 0,1,2,3,......14,15
    Long id;// primary key unique value

    @Column(name = "STD_NAME")
    String name;
    int age;
    String section;

    public Student(String name, int age, String section) {
        this.name = name;
        this.age = age;
        this.section = section;
    }
// DEFAULT CONSTRUCTOR
    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }
}
