package coreJava;

public class Car {
	int price; 
	String color;
	String manufacturer;
	public Car(int price, String color, String manufacturer) {
		super();
		this.price = price;
		this.color = color;
		this.manufacturer = manufacturer;
	}
	public Car() {
		super();
		// TODO Auto-generated constructor stub
		System.out.println("No-arg constructor called from car class");
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	@Override
	public String toString() {
		return "Car [price=" + price + ", color=" + color + ", manufacturer=" + manufacturer + "]";
	}
	
	public void run(int speed) {
		
		System.out.println("I can run with "+speed +" m/hr");
		
	}
public void walk(int fly) {
		
		System.out.println("I can fly with "+fly +" m/hr");
		
	}
	
}
