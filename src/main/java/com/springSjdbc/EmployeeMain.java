package com.springSjdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import com.Spring.Laptop;

public class EmployeeMain {

	public static void main(String[] args) {
 
		//following line creates spring container
		ApplicationContext applicationContext =new ClassPathXmlApplicationContext("employee.xml");
		
		 JdbcTemplate jdbcTemplate = (JdbcTemplate) applicationContext.getBean("jdbcTemplate");
		 
		 //inserting data to sql(dbms) WAY 1
		// jdbcTemplate.update("insert into biden_employee(empId, empName, empSalary, empEmail, empPassword)values(?,?,?,?,?)", 4,"Nabin",89,"nabin@gmail.com","nabin");
		 
			/*
			 * inserting data to sql(dbms) WAY 2 String
			 * sql="insert into biden_employee(empId, empName, empSalary, empEmail, empPassword)values(?,?,?,?,?)"
			 * ; Object[] data= {5,"Rajesh",90,"rajesh@gmail.com","rajesh"};
			 * jdbcTemplate.update(sql, data);
			 */
		  
			/*
			 * //inserting data to sql(dbms) WAY 3 String
			 * sql="insert into biden_employee(empId, empName, empSalary, empEmail, empPassword)values(?,?,?,?,?)"
			 * ; jdbcTemplate.update(sql, new Object[]
			 * {6,"Nikhil",60,"nikhil@gmail.com","nikhil"});
			 */
	
		 
		 String sql="select * from biden_employee";
		 List<Employee> e=(List)jdbcTemplate.query(sql, new BeanPropertyRowMapper(Employee.class));
		 System.out.println(e);
		 
		 
		 
		 
		 
	}

}
