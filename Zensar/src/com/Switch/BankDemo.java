package com.Switch;

import java.util.Scanner;

public class BankDemo {

	public static void main(String[] args) {

		int currentBalance=5000;

		Scanner scanner=new Scanner(System.in);

		System.out.println("Menu");
		System.out.println(" 1:Deposite\n 2:Withdraw\n 3:Check Balance");

		System.out.println("Enter your choice");
		int ch=scanner.nextInt();


		switch(ch)
		{

		case 1:

			System.out.println("how money you want to deposite");
			int amt=scanner.nextInt();

			currentBalance=currentBalance+amt;
			System.out.println("Total amount is:"+currentBalance);
			break;

		case 2:
			System.out.println("enter how money you withdraw");
			int withdraw=scanner.nextInt();

			if(withdraw>currentBalance)
			{
				System.out.println("No sufficent balance");
			}
			else
			{
				currentBalance=currentBalance-withdraw;
				System.out.println(withdraw+" amount is withdraw and after withdrawl total balance is "+currentBalance);
                break;
                
                }
		case 3:
			System.out.println("Total balance is:"+currentBalance);
			break;
			
			default:
		            System.out.println("No match found");


		}
	}

}
