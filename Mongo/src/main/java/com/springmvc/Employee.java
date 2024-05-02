package com.springmvc;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document
public class Employee {

	@Id
	private int emp_id;
	private String enp_name;
	private String emp_mail;
	private String emp_location;
}
