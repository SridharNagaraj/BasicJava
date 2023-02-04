package inheritance;

public class Employee {
	
	String name;
	int salary;
	
	Employee(String n, int s)
	{
		this.name= n;
		this.salary= s;
	}
//		String getName() 
//		{
//			return name;
//		}
//		void setName(String n) 
//		{
//			name= n;
//		}
//		double getSalary() 
//		{
//			return salary;
//		}
//		void setSalary(double s)
//		{
//			salary=s;
//		}		
		int raiseSalary(int percent)
		{
			salary=salary+ salary*percent/100;
			return salary;
			
		}
		


}
