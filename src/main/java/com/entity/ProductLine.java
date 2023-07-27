package com.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
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
@Table(name = "productlines")
public class ProductLine {

	@Id
	@Column(name = "product_line")
	private String productLine;

	@Column(name = "text_description")
	private String textDescription;

	@Column(name = "html_description")
	private String htmlDescription;

}
