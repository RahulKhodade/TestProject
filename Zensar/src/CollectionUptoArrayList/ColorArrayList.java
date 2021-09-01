package CollectionUptoArrayList;

import java.util.ArrayList;
import java.util.Iterator;


public class ColorArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> ar=new ArrayList<>();
		ar.add("Red");
		ar.add("Blue");
		ar.add("Yellow");
		ar.add("White");
		ar.add("Black");
		ar.add("Pink");
		
		
		Iterator<String> itr=ar.iterator();
		while(itr.hasNext())
		{
			String string=itr.next();
			System.out.println(string);
		}
		
	}

}
