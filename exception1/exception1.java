package eceptionhandling;

import java.util.Scanner;

	class hiii{
	public static void ball() {
		Scanner sc = new Scanner(System.in);

		System.out.println("enter the two values");
		int a = sc.nextInt(), b = sc.nextInt(), c = 0;

		try {
			c = a / b;
			System.out.println(c);
			// return c;
		} catch (Exception e) {

			System.out.println(e.getMessage());
			System.out.println("Re-");
			ball();

			// return c;
		}
		System.out.println("Program closed!!");
		sc.close();
	}
	}
	public class exception1 extends hiii{
		public static void main(String[] args) {
			ball();
		}

	}
	

