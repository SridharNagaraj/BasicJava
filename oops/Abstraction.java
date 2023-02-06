package oops;

    abstract class Member{
	 String name;
	 abstract void welcomeMessage();
	}
 class Student extends Member{
	 void welcomeMessage(){
	 System.out.println("Hello Student.....");
	 }
	  }
 class Teacher extends Member{
	 void welcomeMessage(){
	 System.out.println("Hello Teacher.....");
	 }
	 
 }
	 public class Abstraction {
	public static void main(String[] args) {
		Member[] m=new Member[4];
		m[0]=new Student();
		m[1]=new Student();
		m[2]=new Teacher();
		m[3]=new Teacher();
		
		for (Member m1:m) {
			m1.welcomeMessage();
	
		}
			
		}
		
		}

 
 
 
 
