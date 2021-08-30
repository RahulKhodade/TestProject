package Day2;

import java.util.Scanner;

public class SwapTwoNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
System.out.println("Enter two number");
int num1=sc.nextInt();
int num2=sc.nextInt();

System.out.println("Before Swapping num is:");
System.out.println("Num1:"+num1);
System.out.println("Num2:"+num2);


int temp=num1;
num1=num2;
num2=temp;

System.out.println("After swapping number is:");
System.out.println("Num1:"+num1);
System.out.println("Num2:"+num2);



	}

}
