package Day2;

import java.util.Scanner;

public class ThreeDigitNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		
		if(num>=100 && num<=999)
		{
			System.out.println("Number is three digit");
			
		
		int last=num%10;
		int first=num;
		 while(first>=10)
		 {
			 first=first/10;
			 
		 }
		 	System.out.println("Sum of 1st and last digit is "+(first+last));
		}
		else
		{
			System.out.println("Number is not three digit");
		}

	}

}
