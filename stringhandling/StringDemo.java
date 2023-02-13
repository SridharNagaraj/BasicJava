package stringhandling;

public class StringDemo {

	public static void main(String[] args) {
		StringDemo sd=new StringDemo();
		String[] names ={"Sridhar", "Thillai", "uthaya"};
		sd.joinwords(names);
	
	}
	

	private void joinwords(String[] names) {
		// TODO Auto-generated method stub
		//String sentence ="";
	StringBuffer sb	=new StringBuffer("");
	for(String name:names) {
    sb.append(name);
	//System.out.println("StringBuffer"+sb.hashCode());
	//sentence=sentence+name;
	//System.out.println("String"+sentence.hashCode());
	System.out.println(name);
	}
	
}
} 
