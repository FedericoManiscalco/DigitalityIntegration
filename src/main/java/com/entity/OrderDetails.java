package com.entity;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapsId;
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
@Table(name = "orderdetails")
public class OrderDetails {

	@Id
	@Column(name = "order_number")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int orderNumber;

	@ManyToOne
	@MapsId("order_number")
	@JoinColumn(name = "order_number")
	private Order order;

	@ManyToOne
	@MapsId("product_code")
	@JoinColumn(name = "product_code")
	private Product product;

	@Column(name = "quantity_ordered", nullable = false)
	private int quantityOrdered;

	@Column(name = "price_each", nullable = false)
	private BigDecimal priceEach;

	@Column(name = "order_line_number", nullable = false)
	private int orderLineNumber;

}
