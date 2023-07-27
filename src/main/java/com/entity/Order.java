package com.entity;

import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
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
@Table(name = "orders")
public class Order {

	@Id
	@Column(name = "order_number")
	private int orderNumber;

	@Column(name = "order_date", nullable = false)
	private Date orderDate;

	@Column(name = "required_date", nullable = false)
	private Date requiredDate;

	@Column(name = "shipped_date")
	private Date shippedDate;

	@Column(name = "status", nullable = false)
	private String status;

	@Column(name = "comments", columnDefinition = "text")
	private String comments;

	@JsonIgnore
	@ManyToOne
	@JoinColumn(name = "customer_number")
	private Customer customer;

	@JsonIgnore
	@OneToMany(mappedBy = "order")
	private List<OrderDetails> orderDetails;

}
