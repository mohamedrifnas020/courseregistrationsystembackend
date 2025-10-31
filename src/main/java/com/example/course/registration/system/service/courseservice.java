package com.example.course.registration.system.service;

import com.example.course.registration.system.model.course;
import com.example.course.registration.system.model.courseregistration;
import com.example.course.registration.system.repository.courseregistrationrepo;
import com.example.course.registration.system.repository.courserepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class courseservice {
    @Autowired
    courserepository courserepository;
    @Autowired
    courseregistrationrepo courseregistrationrepo;
    public List<course> courses() {

        return courserepository.findAll();

    }

    public List<courseregistration> enrolled() {

          return courseregistrationrepo.findAll();

    }


    public void register(String name, String email, String course) {

        courseregistration courseregistration=new courseregistration(name,email,course);

        courseregistrationrepo.save(courseregistration);

    }

    public void deletes() {
        courseregistrationrepo.deleteAll();


    }

    public void deletecourse() {
        courserepository.deleteAll();
    }


    public void addcourses(String id, String crsname, String trainer, int duration) {
        course course=new course(id,crsname,trainer,duration);
        courserepository.save(course);
    }
}
