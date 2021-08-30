package ArrayAssignment;

import java.util.Scanner;



public class ReverseArrayElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\

		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter array size");
		int size=scanner.nextInt();
		
		int arr[]=new int[size];
		System.out.println("Enter array elements");
		for(int i=0;i<size;i++)
		{

			arr[i]=scanner.nextInt();

		}

		System.out.println("Reverse array elements");
		for(int i=size-1;i>=0;i--)
		{
			System.out.println(arr[i]);
		}
		System.out.println("Alternate elements in array");
		for(int i=size-1;i>=0;i=i-2)
		{
			System.out.println(arr[i]);
		}
	}

}
