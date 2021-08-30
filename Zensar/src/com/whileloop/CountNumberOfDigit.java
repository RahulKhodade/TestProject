package com.whileloop;

import java.util.Scanner;

public class CountNumberOfDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter a number");
	int num=scanner.nextInt();
	int count=0;
while(num>0)
{
	num=num/10;
	count++;
}
System.out.println("Digit is:"+count);
	}


}
