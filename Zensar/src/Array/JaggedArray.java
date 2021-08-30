package Array;

import java.util.Scanner;

public class JaggedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [][]a=new int[3][];
		a[0]=new int[4];
		a[1]=new int[1];
		a[2]=new int[3];
		
		Scanner scanner=new Scanner(System.in);
		for(int i=0;i<a.length;i++)
		{
			System.out.println("Enter "+a[i].length+" elements in row:"+i);
			for(int j=0;j<a[i].length;j++)
			{
				a[i][j]=scanner.nextInt();
			}
		}
		System.out.println("Jagged array is");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}

}
