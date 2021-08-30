package com.whileloop;
//odd number 1 to 100 in reverse order
public class OddNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=100;
		while(i>=1)
		{
			if(i%2!=0)
			{
				System.out.println(i);
			}
			i--;
		}

	}

}
