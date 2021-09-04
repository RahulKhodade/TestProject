package HashMap.com;

import java.util.HashMap;
import java.util.Map;

public class NonGenericHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	HashMap map=new HashMap<>();
	map.put(1,"Nagar");
	map.put(2,"Pune");
	map.put(12,"Nashik");
	map.put(23,"Sangli");
	
	System.out.println(map);
	
	
	HashMap map1=new HashMap<>();
	map1.put("Nagar",1);
	map1.put("Pune",2);
	map1.put("Nashik",12);
	map1.put("Sangli",23);
	
	System.out.println(map1);
	
	

	}

}
