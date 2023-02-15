package stringhandling;

import java.util.Arrays;

public class StringBuild {
	public static void main(String[] args) {
		StringBuild sb=new StringBuild();
		String[] names ={"Sridhar", "Thillai", "uthaya"};
		System.err.println(Arrays.toString(names));
		sb.joinwords(names);

}
	private void joinwords(String[] names) {
	StringBuilder bui =new StringBuilder("ss");
	bui.append(Arrays.toString(names));
	System.out.println(bui);
	
	
	}
	}
