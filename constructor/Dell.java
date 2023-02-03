package constructor;
import java.util.*;
public class Dell {
	
	int x;
	int y;
	
	public Dell(int x,int y) {
		this.x=x;
		this.y=y;
	}
	public static void main(String[] args) { 
		
		Scanner dl=new Scanner(System.in);
		System.out.println("Enter the value of x");
		int x=dl.nextInt();
		System.out.println("Enter the value of y");
		int y=dl.nextInt();
        Dell ss=new Dell(x,y);
		System.out.println("Answer is equal to \t"+ ( ss.x + ss.y));
		System.out.println();
	}

}
