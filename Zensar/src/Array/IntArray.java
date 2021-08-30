package Array;

import java.util.Scanner;

public class IntArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int []arr=new int[5];
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter 5 number");
		for(int i=0;i<5;i++)
		{
			arr[i]=scanner.nextInt();
				
		}
		
	 System.out.println("Elements of an array");
	//for(int i=0;i<5;i++)
			for(int i=4;i>=0;i--)
		{
			System.out.print(arr[i]+" ");
		}
		
		
			System.out.println("Alternat ");
			for(int i=0;i<5;i=i+2)
			{
				System.out.print(arr[i]+" ");
			}
		
			
			
			
			
			//String array
		
//		
//		String []str=new String[5];
//		System.out.println("Enter 5 string variable");
//		for(int i=0;i<5;i++)
//		{
//			str[i]=scanner.next();
//		}
//		
//		for(int i=0;i<5;i++)
//		{
//			System.out.println(str[i]);
//		}
//		
	}

}
