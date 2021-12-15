package com.altunfatih.sutdentdemo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
@Entity
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@NotNull(message = "Must be not null")
	@Size(min = 3)
	private String nameSurname;
	
	@NotBlank(message = "Must be not blank")
	private String schoolName;
	
	@Email(message = "Email should be valid")
	private String email;
	
	@Min(value = 18, message = "Cannot be younger than 18 years old")
	private int age;
	
	@Pattern(regexp = "[0-9\\s]{12}")
	private String phone;
	
}