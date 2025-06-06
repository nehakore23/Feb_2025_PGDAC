package com.cdac.restapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.cdac.restapi.entity.Student;
import com.cdac.restapi.repository.StudentRepository;

@RestController
@RequestMapping("/student")

public class StudentController {
	
	
	//get all students;
	@Autowired
	StudentRepository repo;
@GetMapping("/students")//hi url la takych////http://localhost:8080/students
//get all student
	public List<Student>getAllStudents(){
	List<Student>students=repo.findAll();
		return students;
	}
//get student based on rollNo
@GetMapping("/students/{id}")//http://localhost:8080/students/2
public Student getStudent(@PathVariable int id) {
	Student student=repo.findById(id).get();
	return student;
}

//create new student 
@PostMapping("/student/add")
@ResponseStatus(code=HttpStatus.CREATED)
public void createStudent(@RequestBody Student student) {
	repo.save(student);
	
}

@PutMapping("/student/update/{id}")
public Student updateStudents(@PathVariable int id) {
	Student student =repo.findById(id).get();
	student.setName("Neha");
	student.setPercentage(92);
	repo.save(student);
	return student;
}
@DeleteMapping("/student/delete/{id}")
@ResponseStatus(code = HttpStatus.NO_CONTENT)
public void removeStudent(@PathVariable int id) {
    if (!repo.existsById(id)) {
        throw new RuntimeException("Student not found with id: " + id);
    }
    repo.deleteById(id);
    
    
}


}

