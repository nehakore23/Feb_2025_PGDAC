package com.cdac.restapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cdac.restapi.entity.Student;

public interface StudentRepository extends JpaRepository<Student,Integer>{

}
