package basics.oops;
import java.util.Scanner;
public class classmethod 
{
public static void main(String[] args) 
{
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter the Value A=");
	int a=scanner.nextInt();
	System.out.println("Enter the Value B=");
	int b=scanner.nextInt();
	int c;
	System.out.print("Enter the operator");
	char operator=scanner.next().charAt(0);
	
	if (operator=='+')
		System.out.println(add(a,b));
	else if (operator=='-')
		System.out.println(sub(a,b));
	else if (operator=='/')
			System.out.println(div(a,b));
	else if(operator=='*')
		System.out.println(mult(a,b));
}

 static int add(int a, int b) 
{
	int c=a+b;
	return c;
}
 static int sub(int a, int b) {
	 int c=a-b;
	 return c;
}
 static int div(int a, int b) {
	 int c=a/b;
	 return c;
 }
 static int mult(int a, int b) {
	 int c=a*b;
	 return c;
 

   
}
}


