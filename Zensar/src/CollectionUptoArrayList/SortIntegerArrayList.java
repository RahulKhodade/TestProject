package CollectionUptoArrayList;

import java.util.ArrayList;
import java.util.Collections;



public class SortIntegerArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> list=new ArrayList<>();
		list.add(23);
		list.add(3);
		list.add(89);
		list.add(1);
		list.add(45);
		
		Collections.sort(list);
		
		for(Integer i:list)
		{
			System.out.println(i);
		}

	}

}
