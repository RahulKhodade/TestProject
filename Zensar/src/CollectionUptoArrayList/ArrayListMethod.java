package CollectionUptoArrayList;

import java.util.ArrayList;


public class ArrayListMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> al=new ArrayList<>();
		al.add("Rahul");
		al.add("Amol");
		al.add("Rohit");
		al.add("Sachin");
		al.add("Vishal");

		System.out.println(al);

		System.out.println(al.get(1));  //return element at specified position
		al.add(0,"Sagar");	
		System.out.println(al);  //add elements in specific position

		al.isEmpty();  //return true or false
		al.add("Rohit");  //add duplicate elements
		System.out.println(al);

		al.remove("Rohit"); //remove

		
		
		ArrayList<String> a2=new ArrayList<>();
		a2.add("A");
		a2.add("B");
		a2.add("C");
		
		al.addAll(a2);
		System.out.println(al);  
		


	}

}
