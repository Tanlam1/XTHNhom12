package com.nhom12shop.main.dao;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "products")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Products implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 4113748546869722062L;

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "name")
	@Size(max = 255, message ="Name must be less than 255 characters")
	private String name;
	
	@Column(name = "quantity")
	private Integer quantity;
	
	@Column(name = "price")
	private Double price;
	
	@Column(name = "imgName")
	private String imgName;
	
	@Column(name = "description")
	private String description;
	
	@Column(name = "discount")
	private String discount;
	
	@Column(name = "slug")
	@Size(max = 255, message = "Slug must be less than 255 characters")
	private String slug;
	
	@Column(name = "isDeleted")
	private Boolean isDeleted;

	@ManyToOne
	@JsonIgnoreProperties(value = {"applications", "hibernateLazyInitializer"})
	@JoinColumn(name = "categoryId", referencedColumnName = "id")
	private Categories category;
}
