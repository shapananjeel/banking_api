package com.Spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Laptop {
	
	String brand;
	String model;
	int price;
	
	@Autowired//by type
	@Qualifier("charger2")
	Charger charger;
	public Laptop() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Laptop(String brand, String model, int price, Charger charger) {
		super();
		this.brand = brand;
		this.model = model;
		this.price = price;
		this.charger = charger;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public Charger getCharger() {
		return charger;
	}
	public void setCharger(Charger charger) {
		this.charger = charger;
	}
	@Override
	public String toString() {
		return "Laptop [brand=" + brand + ", model=" + model + ", price=" + price + ", charger=" + charger + "]";
	}
	
	

}
