package com.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@ToString
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter

@Entity
@Table(name = "employees")
public class Employee {

	@Id
	@Column(name = "employee_number")
	private Integer employeeNumber;

	@Column(name = "last_name", nullable = false)
	private String lastName;

	@Column(name = "first_name", nullable = false)
	private String firstName;

	@Column(name = "extension", nullable = false)
	private String extension;

	@Column(name = "email", nullable = false)
	private String email;

	@Column(name = "job_title", nullable = false)
	private String jobTitle;

	@JsonIgnore
	@ManyToOne
	@JoinColumn(name = "office_code")
	private Office office;

}
