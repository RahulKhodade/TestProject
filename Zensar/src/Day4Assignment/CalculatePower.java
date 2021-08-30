package Day4Assignment;

import java.util.Scanner;

public class CalculatePower {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter base:");
		int base=scanner.nextInt();
		System.out.println("Enter index");
		int index=scanner.nextInt();

		int num=1;
		//for(int i=base;i>=0;i--)
		while(index>0)
		{
			num=num*base;
			index--;


		}

          System.out.println("Pow of num:"+num);

	}

}
