package basic;

public class Reverse {

	public static void main(String[] args) {
		String Original="Sridhar";
		String reversed="";
		int i=0;
		System.out.println("Original String = "+ Original);
		for(i=Original.length()-1; i>=0;i--) {
		reversed= reversed+Original.charAt(i);
	}
		System.out.println("Reversed String = " + reversed);

	}

}
