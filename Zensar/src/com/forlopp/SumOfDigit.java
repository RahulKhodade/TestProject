package com.forlopp;

import java.util.Scanner;

public class SumOfDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		
		int sum=0;
		for(int i=num;i>0;i=i/10)
		{
			sum=sum+i%10;			
		}
		
		
		System.out.println(sum);
		
	}

}
