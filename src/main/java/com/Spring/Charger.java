package com.Spring;

/**
 * 
 * @author javahunk
 *
 */
public class Charger {
	String name;
	String year;
	int cost;
	public Charger() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Charger(String name, String year, int cost) {
		super();
		this.name = name;
		this.year = year;
		this.cost = cost;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	@Override
	public String toString() {
		return "Charger [name=" + name + ", year=" + year + ", cost=" + cost + "]";
	}
	

}
