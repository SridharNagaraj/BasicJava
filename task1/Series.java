package task1;

public class Series {

	public static void main(String[] args)

	{

		int numbers = 10;

		for (int i = 1; i <= numbers; i++)

		{
			int sum = 0;
			for (int j = 1; j <= i; j++)

			{
				sum += j;

				if (sum % 2 == 0) {
					System.out.print(sum);
				}else {
					System.out.print(j);

				}


			}

			System.out.println("");

		}

	}

}