package basic;

public class Continue {

	public static void main(String[] args)
	{
		int i=0;
		for(i=0;i<5;i++) {
			System.out.println(i);
			
			if(i%2!=0) {
				System.out.println("odd");
				continue;
			}
			
			}
	}

}
