package inheritance;

class InheritanceDemo{
	public static void main(String args[]) {
		Employee e1=new Employee("Sridhar", 10000);
		Employee e2=new Employee("Manoj",12500);
		System.out.println(e1.name+e1.raiseSalary(10));
		System.out.println(e2.name+e2.raiseSalary(20));
		Manager m1=new Manager("Vicky",30000);
		int bonus=m1.manager(5444);
		System.out.println();
		System.out.println(	m1.name);
		System.out.println(bonus);
	}

	}

class Manager{
	 int salary;
	 String name;

	

	 Manager(String name, int i) 
	{
		 this.name=name;
		this.salary=i;
		
		
	}

		int manager(int bonus){
		int bonus1=bonus+salary;
		return bonus1;
		
	}
}

