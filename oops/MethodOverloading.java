package oops;

public class MethodOverloading {

	
		
	int add(int a, int b){
		return a+b;
	}
    
	int add(int a, int b, int c) {
	return a+b+c;
}
	public static void main(String[] args) {
		MethodOverloading method= new MethodOverloading();
		System.out.println(method.add(25, 45));
		System.out.println(method.add(23, 45, 65));
	}

}
