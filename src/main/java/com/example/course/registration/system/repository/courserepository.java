package com.example.course.registration.system.repository;

import com.example.course.registration.system.model.course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface courserepository extends JpaRepository<course,String> {

}
