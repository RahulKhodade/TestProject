package HashMap.com;

import java.util.HashMap;
import java.util.Map;

public class GetKeysFromHashTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String> map=new HashMap<>();
		map.put(110,"India");
		map.put(232,"Australia");
		map.put(343,"China");
		map.put(453,"Germany");
		map.put(242,"America");
		
	for(Map.Entry<Integer,String> m:map.entrySet())
	{
		
		
		System.out.println(m.getKey());
	}


	}

}
