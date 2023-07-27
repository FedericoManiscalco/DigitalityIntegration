package com.entity;

import java.math.BigDecimal;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
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
@Table(name = "customers")
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "customer_number")
	private int customerNumber;

	@Column(name = "customer_name", nullable = false)
	private String customerName;

	@Column(name = "contact_last_name", nullable = false)
	private String contactLastName;

	@Column(name = "contact_first_name", nullable = false)
	private String contactFirstName;

	@Column(name = "phone", nullable = false)
	private String phone;

	@Column(name = "address_line1", nullable = false)
	private String addressLine1;

	@Column(name = "address_line2")
	private String addressLine2;

	@Column(name = "city", nullable = false)
	private String city;

	@Column(name = "state")
	private String state;

	@Column(name = "postal_code")
	private String postalCode;

	@Column(name = "country", nullable = false)
	private String country;

	@Column(name = "credit_limit")
	private BigDecimal creditLimit;

	@ManyToOne
	@JsonIgnore
	@JoinColumn(name = "sales_rep_employee_number")
	private Employee salesRepresentative;

	@JsonIgnore
	@OneToMany(mappedBy = "customer", fetch = FetchType.LAZY)
	private List<Order> orders;

}