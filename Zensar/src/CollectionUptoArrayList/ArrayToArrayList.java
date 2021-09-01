package CollectionUptoArrayList;

import java.util.ArrayList;
import java.util.Arrays;


public class ArrayToArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		String []str=new String[]{"Virat","Rohit","Sachin","Dhoni","Kumar"};

		ArrayList<String> a1=new ArrayList<String>(Arrays.asList(str));

		System.out.println(a1);




	}

}
