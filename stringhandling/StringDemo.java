package stringhandling;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringDemo sd= new StringDemo();
		String[] name= {"Sridhar, Manoj, Vicky, Thillai"};
		sd.joinwords(name);

	}

	private void joinwords(String[] name) {
		
		// TODO Auto-generated method stub
		String Sentence="";
//		StringBuffer sb=new  StringBuffer("");
//		sb.append("Raja")
		for (String names: name) {
			Sentence = Sentence +names;
			System.out.println(Sentence);
			
		}
		
	}

}
