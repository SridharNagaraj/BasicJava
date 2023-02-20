package arrays;

import java.util.Arrays;

public class CompareDemo {

	public static void main(String[] args) {
		int[] a= {10, 20, 30};
		int[] b= {20, 10, 30};
	    int i=0;
	 Arrays.sort(b);

	System.out.println(Arrays.toString(b));
	    boolean same=true;
	    while(i<a.length)
	    {
	    	if(a[i]!=b[i]) {
	    		same=false;
	    		System.out.println("Not same");
	    		break;
	    		}
	    	i++;}
	    	if (same==true)
	    	{
	    		System.out.println("Both the arrays are same");
	    	}
	    }
	

}
