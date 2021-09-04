package HomeWork;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;




public class ListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		List<String> list1=new LinkedList<>();
//		list1.add("Amol");
//		list1.add("Rahul");
//		list1.add(1,"Vishal");
//		System.out.println(list1.contains("Rahul"));
//		
//		int i=list1.indexOf("Amol");
//		System.out.println(i);
//		System.out.println(list1);
		
		
		Map<Integer,String> map=new HashMap<>();
		map.put(1,"Amol");
		map.put(2,"Rahul");
		map.put(null,"Amol");
			System.out.println(map.entrySet());
			//map.remove(2);
		System.out.println(map.remove(5));
		System.out.println(map);
		
		for(Map.Entry<Integer,String> e:map.entrySet())
		{
			System.out.println(e.getKey());
		}
		
		
		Map<Integer,String> map1=new HashMap<>();
		map1.putAll(map);
		System.out.println(map1);
		
		
		
		
	}

}
