package com.example.course.registration.system.controller;


import com.example.course.registration.system.model.course;
import com.example.course.registration.system.model.courseregistration;
import com.example.course.registration.system.service.courseservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
//@CrossOrigin("https://mohamedrifnas020.github.io/courseregistrationsystemfrontend/")

public class coursecontroller {
    @Autowired
    courseservice courseservice;



    @GetMapping("/courses")
    public List<course> courses(){

        return courseservice.courses();
    }
    @PostMapping("/add/courses")
    public void addcourses(@RequestParam("courseid")String id
                            ,@RequestParam("coursename") String crsname,
                             @RequestParam("trainer")String trainer,
                              @RequestParam("durationinweeks")int duration){
        courseservice.addcourses(id,crsname,trainer,duration);
    }


    @GetMapping("/courses/enrolled")
    public List<courseregistration> enrolled(){

        return courseservice.enrolled();
    }
    @PostMapping("/courses/submit")
    public String register(@RequestParam("name")String name,
                           @RequestParam("emailid")String email,
                           @RequestParam("coursename")String course){
        courseservice.register(name,email,course);
        return "congratulation "+name+" enrollment sucessfull for "+course;
    }

    @DeleteMapping("/course/delete")
    public void deletes(){
        courseservice.deletes();

    }
    @DeleteMapping("/delete/course")
    public void deletecourse(){
        courseservice.deletecourse();

    }

}
