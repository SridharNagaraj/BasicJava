package task1;

public class Task2 {
	public static void main (String[] args) {
		String value="";
		int sum=0;
		for (int i=1;i<=10;i++) {
			for (int j=i;j<=i;j++) {
				
				value+=j;
				sum+=j;
				if(sum%2==0) {
					System.out.println(sum);
				}
				else
				{
					System.out.println(value);
				}
			}
			System.out.println("");
		}
	}

}
