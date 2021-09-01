package CollectionUptoArrayList;

import java.util.ArrayList;
import java.util.Collections;



public class AscendingOrderArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> al=new ArrayList<>();
		al.add(23);
		al.add(1);
		al.add(89);
		al.add(45);
		al.add(34);
		al.add(67);

//		Collections.sort(al);
//		System.out.println(al);


		for(int i=0;i<al.size();i++)
		{
			for(int j=i+1;j<al.size();j++)
			{
				if(al.get(i)>al.get(j))
				{
					int temp=al.get(i);
					al.set(i,al.get(j));
					al.set(j,temp);

				}

			}
		}

		for(Integer i:al)
		{
			System.out.println(i);
		}

	}

}
