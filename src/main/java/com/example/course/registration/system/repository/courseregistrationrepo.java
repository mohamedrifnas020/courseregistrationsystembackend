package com.example.course.registration.system.repository;

import com.example.course.registration.system.model.courseregistration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface courseregistrationrepo extends JpaRepository<courseregistration,Number> {



}
