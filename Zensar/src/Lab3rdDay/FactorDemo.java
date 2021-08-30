package Lab3rdDay;

import java.util.Scanner;

public class FactorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a number:");
		int num=scanner.nextInt();

	
		for(int i=1;i<=num;i++)
		{

			if(num%i==0)
			
			{
				System.out.print(i+" ");
			}
		


		}
		
}

}
