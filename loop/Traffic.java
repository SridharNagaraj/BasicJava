package basics.conditions;

import java.util.Scanner;

public class Traffic {
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		 String traffic=sc.next();
		 switch (traffic) 
		 {
		 case "Red":
			 System.out.println("STOP");
			 break;
		 case "green":
		 System.out.println("GO");
		 break;
		 case "Yellow":
			 System.out.println("Ready");
			 break;
		 }
		 sc.close();
		 
	}

}
