package HashMap.com;

import java.util.HashMap;
import java.util.Map;

public class GenericHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer,String> map=new HashMap<>();
		map.put(11,"India");
		map.put(23,"Australia");
		map.put(34,"China");
		map.put(45,"Germany");

		for(Map.Entry m:map.entrySet())
		{
			System.out.println(m.getKey()+" "+m.getValue());
		}

	}

}
