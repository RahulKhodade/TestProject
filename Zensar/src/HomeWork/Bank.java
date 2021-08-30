package HomeWork;

import java.util.Scanner;


public class Bank {

	static int totalAmount=5000;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
	    System.out.println("1:Check Balnce:\n2:Deposite Amount:\n3:Withdraw Amount:");
		System.out.println("Enter a choice");
		
		int ch=scanner.nextInt();
		
		switch (ch) {
		case 1: 

			System.out.println("Total balnce is:"+totalAmount);

			break;

		case 2:

			System.out.println("Enter amount you deposite");
			int deposite=scanner.nextInt();
			totalAmount=totalAmount+deposite;
			System.out.println("Total balance is:"+totalAmount);

			break;

		case 3:

			System.out.println("Enter amount you withdraw:");
			int withdraw=scanner.nextInt();
			if(totalAmount<withdraw)
			{
				System.out.println("Insufficent Balance");
			}
			else 
			{
				totalAmount=totalAmount-withdraw;
				System.out.println("Total balance is:"+totalAmount);
			}
		

			break;

		default:
			System.out.println("Invaalid choice");
			break;
		}
		}
	

}
