package test;

import test.Employee;

public class Employee 
{
	private String name;
	private int id;
	int salary;
	
	public Employee(String name, int id, int salary)
	{
		this.name=name;
		this.id=id;
		this.salary=salary;
	}
public void incrementSalary(double amount)
{
	this.salary+=amount;
	
}
@Override
public String toString()
{
	return "Name: " + this.name + ", ID: " + this.id + ", Salary: " + this.salary;
	
}
}
class mainEmployee{
	public static void main(String Args[])
	{
		Employee e = new Employee("naveen",123,2500);
		System.out.println(e.salary);
		
	}
}