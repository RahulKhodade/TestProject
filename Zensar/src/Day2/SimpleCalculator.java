package Day2;

import java.util.Scanner;

public class SimpleCalculator {



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1st number:");
		int n1=sc.nextInt();

		System.out.println("Enter an operator");
		char ch=sc.next().charAt(0); 

		System.out.println("Enter a 2nd number:");
		int n2=sc.nextInt();
		//		
		//		System.out.println("1:Addition");
		//		System.out.println("2:Subtraction");
		//		System.out.println("3:Division");
		//		System.out.println("4:Multiplication");
		//		
		//		System.out.println("Enter your choice");
		//		

		switch(ch)
		{
		case '+':
			result=n1+n2;
			System.out.println(result);
			break;

		case '-':
			result=n1-n2;
			System.out.println(result);
			break;
    
		case '*':
			result=n1*n2;
			System.out.println(result);
			break;

		case '/':
			result=n1/n2;
			System.out.println(result);
			break;
			
			default:
				System.out.println("Invalid oprator");



		}

	}

}
