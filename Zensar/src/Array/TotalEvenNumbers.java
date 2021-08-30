package Array;

import java.util.Scanner;

public class TotalEvenNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] a=new int[5];
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter 5 number");
		
		int even=0,odd=0;
		for(int i=0;i<a.length;i++)
		{
			a[i]=scanner.nextInt();
			
		}

		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			
				even++;
				
			
			else 
				odd++;
			
		}
		
		System.out.println(even);
		System.out.println(odd);
	}
	}
	

