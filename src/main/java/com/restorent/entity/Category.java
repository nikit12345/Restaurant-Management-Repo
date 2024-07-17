package com.restorent.entity;

import com.restorent.dto.CategoryDto;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;






@Entity
public class Category {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String description;
	
	@Lob
	@Column(columnDefinition = "longblob")
	private byte[] img;
	
	public Category() {}

	public Category(Long id, String name, String description, byte[] img) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.img = img;
	}
	
	public CategoryDto getCategoryDto() {
		CategoryDto categoryDto = new CategoryDto();
		categoryDto.setId(id);
		categoryDto.setName(name);
		categoryDto.setDescription(description);
		categoryDto.setReturnedImg(img);
		return categoryDto;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public byte[] getImg() {
		return img;
	}

	public void setImg(byte[] img) {
		this.img = img;
	}
	
	
	
	
	
	

}
