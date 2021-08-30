package Array2D.com;

import java.util.Scanner;

public class MaximumInRowwise {
	public static void main(String[] args) {
		// TODO Auto-generated method stub


		int arr[][]=new int[3][3];
		Scanner scanner=new Scanner(System.in);
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter elements in row:"+i);
			for(int j=0;j<arr[i].length;j++)
			{
				arr[i][j]=scanner.nextInt();
			}
		}


		System.out.println("Original 2D array");
		for(int i=0;i<arr.length;i++) {

			for(int j=0;j<arr[i].length;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println(" ");
		}

		int max=0;
		System.out.println("Maximum in each row");
		for(int i=0;i<arr.length;i++) {

			for(int j=0;j<arr[i].length;j++)
			{
				if(arr[i][j]>max)
				{
					max=arr[i][j];
				}
			}
			System.out.println(max);
		}
	}
}
