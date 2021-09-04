package HashMap.com;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<String,Integer> hm=new HashMap();
		hm.put("Amol",10);
		hm.put("Rahul",12);
		hm.put("Sachin",13);
		hm.put("Rohit",23);
		hm.put("Rohit",24);
		
		System.out.println(hm.get("Rahul"));
		System.out.println(hm.get("AA"));
		
		System.out.println("Size:"+hm.size());
		System.out.println(hm.isEmpty());
		System.out.println(hm.containsKey("Amol"));
		System.out.println(hm.containsValue(11));
		System.out.println(hm);
		
		java.util.Set<String> set=hm.keySet();
		System.out.println(set);
		
		for(String string:set)
			System.out.println(string+"->"+hm.get(string));
		
		Collection<Integer> c=hm.values();
		for(Integer i:c)
		{
			System.out.println(i);
		}
		
		
		
	}

}
