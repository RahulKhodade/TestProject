package ArrayExtraAssignment;

import java.util.Scanner;

public class CountDuplicateElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size=scanner.nextInt();
		
		int []arr=new int[size];
		System.out.println("Enter elements in array");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=scanner.nextInt();
		}
		
		
       System.out.println("Count Duplicate elements in given array");
       int count=0;
       for(int i=0;i<arr.length;i++)
       {
    	   for(int j=i+1;j<arr.length;j++)
    	   {
    		   if(arr[i]==arr[j])
    		   {
    			   count++;
    			   break;
    			   
    		   }
    	   }
    	   
       }
       System.out.println(count);
	}

}
