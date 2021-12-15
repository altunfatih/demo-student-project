package com.altunfatih.sutdentdemo.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.altunfatih.sutdentdemo.model.Student;
import com.altunfatih.sutdentdemo.service.StudentService;

@RestController
public class StudentController {
	@Autowired
	private StudentService studentService;
	
	@PostMapping("/save")
	public ResponseEntity<String> addStudent(@Valid @RequestBody Student student) {
		studentService.save(student);
		
		return ResponseEntity.ok("Student Saved");
	}
}
