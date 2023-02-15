package task2;

import java.util.ArrayList;
import java.util.Iterator;

public class EmployeeMain {

	public static void main(String[] args) {
		ArrayList<Employee> mylist = new ArrayList<>();
		mylist.add(new Employee("Sridhar", "Nagaraj", "(AT001)", 10000));
		mylist.add(new Employee("Hari", "Vishnu", "(AT002)", 20000));
		mylist.add(new Employee("Arun", "Kumar", "(AT003)", 30000));
		mylist.add(new Employee("Maonj", "Ravi", "(AT004)", 40000));
		mylist.add(new Employee("Thillai", "K", "(AT005)", 50000));
		mylist.add(new Employee("Roobesh", "Kumar", "(AT006)", 60000));
		mylist.add(new Employee("Thoufic", "Raja", "(AT007)", 70000));

		Iterator<Employee> i = mylist.iterator();
		System.out.println("Name \t\t ID \t salary \n");
		while (i.hasNext()) {
			System.out.println(i.next());
		}
		int sum = 0;
		for (Employee employee : mylist) {
			sum = sum + employee.salary;
			if(employee.FirstName.equalsIgnoreCase("hari"))			
				System.out.println( employee.FirstName + "\t" + employee.salary);
		}
		System.out.println("\n\t Total Salary\t" + sum);
	}
}
