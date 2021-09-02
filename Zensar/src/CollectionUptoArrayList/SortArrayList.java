package CollectionUptoArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;


public class SortArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> list=new ArrayList<>();
		list.add("Virat");
		list.add("Sachin");
		list.add("Rohti");
		list.add("Rishabh");
		list.add("Dhawan");
		
		Collections.sort(list);
		
		Iterator<String> itr=list.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}

	}

}
