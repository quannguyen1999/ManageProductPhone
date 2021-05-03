package com.main.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@Entity
@Table(name = "Product")
public class Product {
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(nullable = false)
	private String name;
	
	@Column(nullable = false)
	private int unitPrice;
	
	@Column(nullable = false)
	private int unitInStock;
	
	@Column(nullable = true)
	private String description;
	
	@Column(nullable = false)
	private String manufgacturer;
	
	@Column(nullable = false)
	private String category;
	
	@Column(nullable = false)
	private int conditionProduct;
	
	@Column(nullable = true)
	private String image;
}
