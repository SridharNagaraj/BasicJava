package basics.oops;
import java.util.Scanner;
public class arraystask {

	public static void main(String[] args) {
		
	Scanner tc=new Scanner(System.in);
	
		// TODO Auto-generated method stub
int numbers[]= {1,2,3,4,5,6,7,8,9,10};
for(int i=0;i<numbers.length;i++) {
 System.out.println(i);}
int no1[]= {1,2,3,4,5,6,7,8,9,10};
for(int j=1;j<no1.length;j++) {
	if(j%2==0) {
		System.out.println(no1[j]);
	}
	
}
	}
}

