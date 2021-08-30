package ArrayExtraAssignment;

import java.util.Scanner;


public class AsendingOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter size of array");
		int size=scanner.nextInt();
		int[] arr=new int[size];

		System.out.println("Enter elements");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=scanner.nextInt();
		}

		System.out.println("Original array elements");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}


		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;

				}
			}
           }
		
		System.out.println();
		System.out.println("Ascending order");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}

	}

}
