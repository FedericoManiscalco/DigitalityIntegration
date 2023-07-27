package com.entity;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
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

@Embeddable
public class PaymentId implements Serializable {

	private static final long serialVersionUID = -1277413314655346951L;

	@Column(name = "customer_number")
	private int customerNumber;

	@Column(name = "check_number")
	private String checkNumber;

}
