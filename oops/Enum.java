package oops;


enum Day{
	SUNDAY, MONDAY, TUESDAY, WEDNESDAY, FRIDAY;


 private Day() {
	System.out.println("Consturctor called");
	
}
}
public class Enum {

	public static void main(String[] args) {
		
		Day d = Day.FRIDAY;
		switch (d) {
		case SUNDAY:
			System.out.println("It is a hoilday");
			break;
		case MONDAY:
			System.out.println("It is a work start day");
			break;
		case TUESDAY:
			System.out.println("Bore day");
			break;
		case WEDNESDAY:
			System.out.println("Good day");
			break;
		case FRIDAY:
			System.out.println("FUN DAY");
			break;
			
		}
	}
}

	



