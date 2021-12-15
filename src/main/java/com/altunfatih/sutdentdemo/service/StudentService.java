package com.altunfatih.sutdentdemo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.altunfatih.sutdentdemo.model.Student;
import com.altunfatih.sutdentdemo.repository.StudentRepository;

@Service
public class StudentService {
	
	@Autowired
	private StudentRepository studentRepository;
	
	public void save(Student student) {
		studentRepository.save(student);
	}
}
