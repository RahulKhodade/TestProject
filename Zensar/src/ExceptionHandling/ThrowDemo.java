package ExceptionHandling;

import java.util.Scanner;

public class ThrowDemo {
	
	static void valid(int num) {
		
		
		if(num<10)
			throw new ArithmeticException();
		else
	
		System.out.println("Number is greater then 10");
	}
		
		public static void main(String[] args)
		{
			Scanner scanner=new Scanner(System.in);
			System.out.println("Enter a number");
			int num=scanner.nextInt();
			valid(num);
			
			
			
			
	}
		

}
