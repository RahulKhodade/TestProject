package Array;

import java.util.Scanner;

public class Array2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[][]=new int [4][4];
		Scanner scanner=new Scanner(System.in);
		
		for(int row=0;row<arr.length;row++)
		{
			System.out.println("Enter elements in row:"+row);
			for(int col=0;col<arr[row].length;col++)
			{
				arr[row][col]=scanner.nextInt();
			}
		}
		
		System.out.println("2D array is");
		for(int row=0;row<arr.length;row++)
		{
			for(int col=0;col<arr[row].length;col++)
			{
				System.out.print(arr[row][col]+" ");
			}
			System.out.println();
		}

		
		for(int row=0;row<arr.length;row++)
		{
			for(int col=0;col<arr[row].length;col++)
			{
				if(row==col)
					System.out.println(arr[row][col]+" ");
			}
		
		}
		
		}
	}


