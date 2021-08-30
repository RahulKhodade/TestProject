package ArrayExtraAssignment;

import java.util.Arrays;

public class UniqElemennts {

	public static void main(String[] args) {
		
		int arr[]= {12,13,67,23,12,89,56,100,67};
		Arrays.sort(arr);
	for(int i=0;i<arr.length;i++)
	{
		System.out.print(arr[i]+" ");
	}
	

	
	System.out.println("Uniq elements in array");
	int i=0;
while( i<arr.length)
	{
			if(arr[i]!=arr[i+1]);
			{
				System.out.println(arr[i]);
		
			}
		
		i=i+2;
	}
		
		
		
		
		
		

	}

}
