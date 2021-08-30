package Lab3rdDay;

import java.util.Scanner;


public class MaxiAndMinNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter  a three number");
		int num1=scanner.nextInt();
		int num2=scanner.nextInt();
		int num3=scanner.nextInt();
		
		if(num1>num2 && num1>num3)
		{
			System.out.println(num1);
		}
		else if(num2>num3)
		{
			System.out.println(num2);
		}
		else {
			System.out.println(num3);
		}
		  
		
		}

	                           //5349

}
