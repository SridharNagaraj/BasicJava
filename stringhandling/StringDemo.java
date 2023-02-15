package stringhandling;

public class StringDemo {

	public static void main(String[] args) {
		StringDemo sd=new StringDemo();
		String[] names ={"Sridhar", "Thillai", "uthaya"};
		sd.joinwords(names);
	
	}
	

	private void joinwords(String[] names) {
		
		//String sentence ="";
	StringBuffer sb	=new StringBuffer("");
	for(String name:names) {
    sb.append("naresh");
	//System.out.println("StringBuffer"+sb.hashCode());
	//sentence=sentence+name;
	//System.out.println("String"+sentence.hashCode());
	System.out.println(name);
	}
	System.out.println(sb);
	StringBuffer sb2 =new StringBuffer("nighil");
	sb2.insert(1, 'k');
	System.out.println(sb2);
	sb2.replace(0, 1, "k");
	System.out.println(sb2);
	sb2.reverse();
	System.out.println(sb2);
	}
}
