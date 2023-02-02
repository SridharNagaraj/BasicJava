package basics;
import java.util.Scanner;
public class Condition {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		// TODO Auto-generated method stub
		boolean condition=true;
	while (condition) {
		System.out.println("enter age");
		int age=sc.nextInt();
      
      if (age<0)
    	  break;
      else if(age<=17)
    	  System.out.println("kids");
      else if (age>=18 && age<=60)
    	  System.out.println("adult");
      else 
    	  System.out.println("legend");
		}
	}

}
