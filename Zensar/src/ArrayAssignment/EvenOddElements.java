package ArrayAssignment;

import java.util.Scanner;



public class EvenOddElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int j=0,k=0;
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size=scanner.nextInt();
		
		int []arr=new int[size];
		int []even=new int[size];
		int []odd=new int[size];
		
		System.out.println("Enter the Values in array");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=scanner.nextInt();
		}
		
		
	    for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2!=0)
			{
				odd[j]=arr[i];
				j++;
			}
			else 
			{
				even[k]=arr[i];
				k++;
			}
		}
         
	    
	    System.out.print("odd:");
		for(int i=0;i<j;i++)
		{
			System.out.print(odd[i]+" ");
		}
		
		System.out.println();
	    
		System.out.print("Even:");
		for(int i=0;i<k;i++)
		{
			System.out.print(even[i]+" ");
		}
		
		
		
		
	}

}
