package com.forlopp;

public class SumOfEvenNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0,avg=0;
		for(int i=1;i<10;i=i+2)
		{
          sum=sum+i;
		}
		System.out.println(sum);
		avg=sum/10;
		System.out.println("Avg:"+avg);

	}

}
