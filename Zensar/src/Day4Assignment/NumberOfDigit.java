package Day4Assignment;

import java.util.Scanner;

public class NumberOfDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=scanner.nextInt();
     int count=0;     
	while(num>0)
	{
		count++;
		num=num/10;
	}
System.out.println(count);
	}

}
