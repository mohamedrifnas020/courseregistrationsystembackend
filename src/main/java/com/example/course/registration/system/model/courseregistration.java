package com.example.course.registration.system.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@Entity
@AllArgsConstructor
public class courseregistration {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;
    private String emailid;
    private String coursename;

    public courseregistration(String name, String emailid, String coursename) {
        this.name = name;
        this.emailid = emailid;
        this.coursename = coursename;
    }
    public courseregistration(){
        
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmailid() {
        return emailid;
    }

    public String getCoursename() {
        return coursename;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmailid(String emailid) {
        this.emailid = emailid;
    }

    public void setCoursename(String coursename) {
        this.coursename = coursename;
    }
}
