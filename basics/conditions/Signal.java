package basics.conditions;

import java.util.Scanner;

public class Signal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		String traffic = sc.next();
		
		if(traffic.equals("green")) {
			System.out.println("GO");
			}
			else if(traffic.equals("red")){
				System.out.println("STOP");
				}
				else if(traffic==("yellow"))
				 {
				System.out.println("Ready");
				}
				
				
	}

		}

		
		

