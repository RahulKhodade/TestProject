package CollectionUptoArrayList;

import java.util.ArrayList;



public class NonGenericArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList list=new  ArrayList();
		System.out.println(list);    //empty arraylist
		
		list.add(12);
		list.add(new Integer(45));
		list.add(89);
		list.add(576);


		for(int i=0;i<list.size();i++)
		{
			System.out.println(list.get(i));
		}
		
		ArrayList list1=new ArrayList();
		list.add("Rahul");
		list.add("Amol");
		list.add("Vishal");
		list.add("Rohit");
		
		System.out.println(list1);
		
		
		

	}

}
