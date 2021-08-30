package Array;

import java.util.Scanner;



public class Demo2DArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[][]=new int[3][3];
		
		Scanner scanner=new Scanner(System.in);
		for(int row=0;row<a.length;row++)
		{
			System.out.println("Enter elements in row:"+row);
			for(int col=0;col<a[row].length;col++)
			{
				a[row][col]=scanner.nextInt();
			}
		}
		System.out.println("2D array is:");
		
		for(int row=0;row<a.length;row++)
		{
			
			for(int col=0;col<a[row].length;col++)
			{
				System.out.print(a[row][col]+" ");
			}

			System.out.println();
		}
		

	}

}
