package Day2;

import java.util.Scanner;

public class NUmberCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int num=sc.nextInt();
		
		if(num>0)
		{
			System.out.println("Numnber is positive");
			
		}
		
		else if(num<0)
		{
			System.out.println("Number is negative:");
			
		}
		else
		{
			System.out.println("Number is zero");
		}
	}

}
