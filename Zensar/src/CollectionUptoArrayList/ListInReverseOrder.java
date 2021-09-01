package CollectionUptoArrayList;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListInReverseOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> a1=new ArrayList<String>();
		a1.add("Amol");
		a1.add("Shrikant");
		a1.add("Manoj");
		a1.add("Bharat");
		a1.add("Avinash");
		
		//System.out.println(a1);
		
	ListIterator<String> al=a1.listIterator();
	while(al.hasPrevious())
	{
		System.out.println(al.previous());
	}
		
		
		

	}

}
