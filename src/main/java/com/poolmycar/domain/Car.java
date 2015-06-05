package com.poolmycar.domain;

/**
 * @author ukb
 * 
 */

public class Car {
	private String	number;
	private String	model;
	private int		capacity;
	private User	ownerName;
	private String	description;
	
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	public User getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(User ownerName) {
		this.ownerName = ownerName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
}
