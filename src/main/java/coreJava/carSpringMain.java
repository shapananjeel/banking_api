package coreJava;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class carSpringMain {

	public static void main(String[] args) {
		
		//following line creates spring container
		ApplicationContext applicationContext =new ClassPathXmlApplicationContext("car.xml");
		
		//hey container ... give me car bean
		
		 Car c1 = (Car) applicationContext.getBean("car1");
		 System.out.println(c1);
		 
		 c1.run(700);
		 
		 Car c2= (Car) applicationContext.getBean("car2");
		 
		 System.out.println(c2);
		 c2.walk(5000);
	 
		 Employee e1= (Employee) applicationContext.getBean("emp");
		 System.out.println(e1);
		 
		 Employee e2= (Employee) applicationContext.getBean("emp");
		 System.out.println(e2);
		 
		 System.out.println(e1.hashCode());
		 System.out.println(e2.hashCode());
		 
		}
}
