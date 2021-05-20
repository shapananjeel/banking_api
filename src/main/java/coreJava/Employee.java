package coreJava;

public class Employee {
	String name;
	int age;
	public Employee() {
		super();
		System.out.println("No-arg constructor is called from employee class");
	}

	public Employee(String name, int age) {
		super();
		this.name = name;
		this.age = age;
		
		System.out.println("Parameterized constructor is called from employee class");
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + "]";
	}

}
