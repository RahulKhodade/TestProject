package Day2;

import java.util.Scanner;

public class NumberIsDivisibleOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a nummber:");
		int num=sc.nextInt();
		
		if(num%5==0 && num%11==0)
		{
			System.out.println("Number is divisible by 5 and 11");
			
		}
		else
		{
			System.out.println("Number is not divisible:");
		}
		
		



	}

}
