package com.example.course.registration.system.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;


//@AllArgsConstructor
@Data
@Entity
public class course {
    @Id
    private String courseid;
    private String coursename;
    private String trainer;
    private  int durationinweeks;

    public course(String courseid, String coursename, String trainer, int durationinweeks) {
        this.courseid = courseid;
        this.coursename = coursename;
        this.trainer = trainer;
        this.durationinweeks = durationinweeks;
    }
    public course(){

    }
}
