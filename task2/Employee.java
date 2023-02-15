package task2;

public class Employee {
	String id;
	String FirstName;
	String SecondName;
	int salary;
	int a;
	

	public Employee (String FirstName, String SecondName, String id, int salary) {
		this.id=id;
		this.FirstName=FirstName;
		this.SecondName=SecondName;
		this.salary=salary;
		}
	public String toString()
	{
		return  this.FirstName +" "+ this.SecondName+ "\t" + this.id+ "  "+  this.salary;
}
}