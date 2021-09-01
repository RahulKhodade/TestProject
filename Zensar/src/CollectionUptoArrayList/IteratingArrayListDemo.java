package CollectionUptoArrayList;

import java.util.ArrayList;
import java.util.Iterator;





public class IteratingArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ArrayList<String> al=new ArrayList<>();
		al.add("Rahul");
		al.add("Amol");
		al.add("Rohit");
		al.add("Sachin");
		al.add("Vishal");
		
		System.out.println(al);
		
		//Using for loop iterating the elements
		
		for(int i=0;i<al.size();i++)
		{
			System.out.println(al.get(i));
		}
	
		//Using enhanced for loop
		
		System.out.println("Iterating the value by using for loopa");
		for(String s:al)
		{
			System.err.println(s);
		}
		
		//using Iterator
		System.out.println("Iterating the value by using iterator");
		Iterator<String> itr=al.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		}

	
}

