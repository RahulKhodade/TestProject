package Array2D.com;

import java.util.Scanner;

public class SumIsGivenNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]=new int[] {2,4,3,5,6,-2,4,7,8,9};

		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=scanner.nextInt();
		
		int count=0;
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)

			{
				if(arr[i]+arr[j]==num)

				{
					count++;
					System.out.print("("+arr[i]+","+arr[j]+")");
				}

			}


		}

		if(count==0)
		{
			System.out.println("Not  found");
		}


	}

}
