package com.Switch;

import java.util.Scanner;

public class Year {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter month name");
		String month=sc.next();

		switch(month)
		{
		case "jan" :
		case "march":
		case "may":
		case "jul":
		case "aug":
		case "oct":
		case "dec":

			System.out.println("31 days");
			break;

		case "apr" :
		case "jun":
		case "sep":
		case "nov":

			System.out.println("30 days");
			break;

		case "feb":
			System.out.println("enter your year");
			int year=sc.nextInt();

			if(year%4==0)
			{
				System.out.println("29 days");
			}
			else 
			{
				System.out.println("28 days");

			}
			break;

		default:
			System.out.println("It is consonent");
			break;
		}


	}

}
