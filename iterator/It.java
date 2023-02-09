package iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class It {

	private static final Object Arun = null;
	private static final ArrayList<String> names = null;

	public static void main(String[] args) {
		
		
		
		ArrayList<String> names = new ArrayList<String>();
		names.add("Sridhar");
		names.add("Arun");
		names.add("Hari");
//	   System.out.println(names);
//		for (String  nm :s) {
//			System.out.print(nm);
//		
//		Iterator<String> i= names.iterator();
//		while (i.hasNext()) {
//			if (i.next().equals("Hari"))
//				i.remove();
//         System.out.println(i.next());
//            
//		}
//		System.out.println( names);
	ListIterator<String> li= names.listIterator();
		li.add("Manoj");
		System.out.println(names);
		while (li.hasNext()) {
			if(li.next().equals("Hari")) {
				li.set("Vicky");
				System.out.println(names);
			}
		}
		}
		
		
		}
