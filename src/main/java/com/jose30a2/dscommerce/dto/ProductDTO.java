package com.jose30a2.dscommerce.dto;

import com.jose30a2.dscommerce.entities.Product;

public class ProductDTO {
	
	private Long id;
	private String name;
	private String description;
	private Double preco;
	private String imgUrl;
	
	public ProductDTO() {}

	public ProductDTO(Long id, String name, String description, Double preco, String imgUrl) {
		this.id = id;
		this.name = name;
		this.description = description;
		this.preco = preco;
		this.imgUrl = imgUrl;
	}
	
	public ProductDTO(Product entity) {
		id = entity.getId();
		name = entity.getName();
		description = entity.getDescription();
		preco = entity.getPrice();
		imgUrl = entity.getImgUrl();
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}

	public Double getPreco() {
		return preco;
	}

	public String getImgUrl() {
		return imgUrl;
	}
	
	
	
	

}
