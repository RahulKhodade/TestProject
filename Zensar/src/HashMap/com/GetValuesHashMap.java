package HashMap.com;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;



public class GetValuesHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<String,Integer> hm=new HashMap();
		hm.put("Amol",10);
		hm.put("Rahul",12);
		hm.put("Sachin",13);
		hm.put("Rohit",23);
		hm.put("Rohit",24);
		
		for(Map.Entry<String,Integer> m:hm.entrySet())
		{
			System.out.println(m.getValue());
		}

	}

}
