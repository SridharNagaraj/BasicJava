package basics.conditions;

import java.util.Scanner;

public class Signal {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		String traffic = sc.next();
		
		if(traffic.equals("green")) {
			System.out.println("GO");
			}
			else if(traffic.equals("red")){
				System.out.println("STOP");
				}
				else if(traffic.equals("yellow"))
				 {
				System.out.println("Ready");
				}
				sc.close();
				
	}

		}

		
		

