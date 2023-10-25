package com.furniture.furniture;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Furniture {
	
	@Id
	private String id;
	
	private String furniturename;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getFurniturename() {
		return furniturename;
	}
	public void setFurniturename(String furniturename) {
		this.furniturename = furniturename;
	}
	public Furniture(String id, String furniturename) {
		super();
		this.id = id;
		this.furniturename = furniturename;
	}
	
	
	public Furniture() {
		super();
		
	}

}
