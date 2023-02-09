package enums;


enum level{
	
	BEGGINER("B"), INTERMIDATE("I"), ADVANCED("A");
	
	private String abbr;
	level(String ab){
	abbr=ab;
	}
	public String getAbbr(){
		return  abbr;
	}
	}
	
	

public class Task {
	
	public static void main(String[] args) {
		level l1=level.BEGGINER;
		System.out.println(l1);
		System.out.println(l1.getAbbr());
	}

}
