package com.entity;

import java.math.BigDecimal;

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
@Table(name = "products")
public class Product {

	@Id
	@Column(name = "product_code")
	private String productCode;

	@Column(name = "product_name", nullable = false)
	private String productName;

	@Column(name = "product_scale", nullable = false)
	private String productScale;

	@Column(name = "product_vendor", nullable = false)
	private String productVendor;

	@Column(name = "product_description", nullable = false)
	private String productDescription;

	@Column(name = "quantity_in_stock", nullable = false)
	private int quantityInStock;

	@Column(name = "buyprice", nullable = false)
	private BigDecimal buyPrice;

	@Column(name = "msrp", nullable = false)
	private BigDecimal MSRP;

	@ManyToOne
	@JoinColumn(name = "product_line")
	private ProductLine productLine;

}
