package com.Spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import coreJava.Car;

public class LaptopChargerMain {

	public static void main(String[] args) {
 
		
		//following line creates spring container
				ApplicationContext applicationContext =new ClassPathXmlApplicationContext("laptop-Charger-annotation.xml");
				
				//hey container ... give me car bean
				
				Laptop laptop = (Laptop) applicationContext.getBean("laptop");
				 System.out.println(laptop);
				 
				 Charger charger = (Charger) applicationContext.getBean("charger1");
				 System.out.println("\nNext charger ======== "+charger);
				 }

}
