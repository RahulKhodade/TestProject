package com.forlopp;

public class FactSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int fact;
		for(int i=1;i<=5;i++)
		{
			fact=1;
			for(int j=1;j<=i;j++)
			{
				fact=fact*j;
			}
			System.out.println(fact);
		}
		

	}

}
