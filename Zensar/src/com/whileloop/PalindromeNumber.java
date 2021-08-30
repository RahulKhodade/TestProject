package com.whileloop;

import java.util.Scanner;



public class PalindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner scanner=new Scanner(System.in);
			
	System.out.println("Enter a number:");
	int num=scanner.nextInt();
	int temp=num;
	  int sum=0; 
	  for(int i=num;i>0;i--)
	//while(num>0)
	{
		int n=num%10;
	    sum=(sum*10)+n;
	    num=num/10;
	    
	    
	}
	if(sum==temp)
	{
		System.out.println("Number is pali");
	}
	else {
		System.out.println("Not pali");
	}
	}

}
