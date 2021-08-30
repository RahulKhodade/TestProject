package com.whileloop;

public class FibonacciSeris {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1=0,num2=1,num3,count=10;
		
//		for(int i=2;i<=10;i++)
//		{
//			num3=num1+num2;
//			System.out.print(" "+num3);
//			num1=num2;
//			num2=num3;
//		}
//		
         int i=1;
         while(i<=count)
         {
        	 System.out.print(num1+" "); 
        	 num3=num1+num2;  
        	 num1=num2;   
        	 num2=num3;    
        	 i++;
         }
		
		
	}

}
