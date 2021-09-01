package CollectionUptoArrayList;

import java.util.ArrayList;


public class ConvertCollectionIntoAArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ArrayList<Integer> itr=new ArrayList<>();
		itr.add(23);
		itr.add(56);
		itr.add(89);
		itr.add(78);
		itr.add(67);
		
		int []arr=new int[itr.size()];
		for(int i=0;i<itr.size();i++)
		{
			arr[i]=itr.get(i);
		}
		
		for(Integer j:arr)
		{
			System.out.print(j+" ");
		}
		
		
		
		
	
		
	}

}
