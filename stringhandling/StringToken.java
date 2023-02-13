package stringhandling;

import java.util.Arrays;
import java.util.StringTokenizer;

public class StringToken {

	public static void main(String[] args) {
		
		
//		StringTokenizer st=new StringTokenizer("happy to work with you");
		StringTokenizer st=new StringTokenizer("www.aaludra.com", ".", true);
		System.out.println(st.countTokens());
		while(st.hasMoreTokens())
			System.out.println(st.nextToken());
		//delimiter-default-space
		
//		String sentence = "www.aaludra.com";
//		String[] str= sentence.split("\\.");
		String sen="http:\\www.focus.com";
		String[] sr=sen.split("\\:|\\\\|\\.");
		for(String s:sr)
		System.out.println(s);
		
		
	
	}

}
