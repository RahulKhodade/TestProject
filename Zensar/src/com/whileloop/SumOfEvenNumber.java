package com.whileloop;

public class SumOfEvenNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i=1,sum=0,avg=0;
	while(i<=10)
	{
		if(i%2==0)
		{
			sum=sum+i;
		}
		
		i++;
	}
	System.out.println("Sum:"+sum);
	avg=sum/10;
	System.out.println("Avg:"+avg);

	}

}
