package com.entity;

import java.math.BigDecimal;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
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
@Table(name = "payments")
public class Payment {

	@EmbeddedId
	private PaymentId id;

	@ManyToOne
	@JoinColumn(name = "customer_number", insertable = false, updatable = false)
	private Customer customer;

	@Column(name = "payment_date")
	private Date paymentDate;

	@Column(name = "amount")
	private BigDecimal amount;

}
