package exception1;

import java.util.Scanner;

public class ExceptionHandling1 {

	public static void main(String[] args) throws Exception {
		ExceptionHandling1 eh = new ExceptionHandling1();
		try {
			eh.divide();
		} catch (Exception e) {
			
			System.out.println("no2 is zero. Please check the value.");
			eh.divide();
		}
		eh.add();

	}

	private void add() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two values");
		int no1 = sc.nextInt();
		int no2 = sc.nextInt();
		int result = no1 + no2;
		System.out.println(result);
	}

	public  void divide() throws Exception {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two values");
		int no1 = sc.nextInt();
		int no2 = sc.nextInt();
		
		int result = no1 / no2;
		System.out.println(result);
		
	}

}
