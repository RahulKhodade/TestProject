package CollectionUptoArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class DemoArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> al=new ArrayList<>();
		al.add("Rahul");
		al.add("Amol");
		al.add("Rohit");
		al.add("Sachin");
		al.add("Vishal");
		
		System.out.println(al);
		Collections.reverse(al);
		System.out.println(al);
		
		int c=Collections.frequency(al,"Amol");
		System.out.println("Fry:"+c);

		
		Collections.swap(al, 1,2);
		System.out.println(al);
		
		Collections.reverse(al);
		System.out.println(al);
	}

}
