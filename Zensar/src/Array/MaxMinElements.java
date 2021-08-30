package Array;

import java.util.Scanner;


public class MaxMinElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr=new int[5];

		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter elements in array");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=scanner.nextInt();
		}

		System.out.println("Min elemnt is");

		int min=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(min>arr[i])
			{
				min=arr[i];
			}
			
		}
		System.out.println(min);



		System.out.println("Maximum elements is:");
		int max=arr[0];
		for(int j=0;j<arr.length;j++)
			
		{
			
			if(max<arr[j])
			{
				max=arr[j];
			}
		}
		System.out.println(max);

	}


}
