package Day4Assignment;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Scanner scanner=new Scanner(System.in);
	System.out.println("Entre a number");
	int num=scanner.nextInt();
	
	int temp=num;
	int pali=0,sum=0;
	
	
	while(num>0)
	{
		pali=num%10;
		sum=sum*10+pali;
		num=num/10;
		
		
	}
	if(sum==temp) {
		System.out.println("Pali number");
	}
	else {
		System.out.println("Not pali");
	}

	}

}
