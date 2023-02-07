package oops;
interface Vechcile{
	 void ride();
}
	

class Bike implements Vechcile{
	public void ride() {
	System.out.println("Riding a bike");
	}
}
class Car implements Vechcile{
	 public void ride() {
	System.out.println("Riding a car");
	}
}

class Mechanic{
	void check(Vechcile v){
		System.out.println("checking");
		v.ride();
	}
}

public class Interface {

	public static void main(String[] args) {
		Mechanic m=new Mechanic();
		Car c=new Car();
		Bike b=new Bike();
		m.check(c);
		m.check(b);
   
	}

}
