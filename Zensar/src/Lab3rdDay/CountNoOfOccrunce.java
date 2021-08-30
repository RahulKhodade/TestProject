package Lab3rdDay;

import java.util.Scanner;

public class CountNoOfOccrunce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=scanner.nextInt();
		
		
		for(int i=0;i<num;i++)
		{
			int count=0;
			int temp=num;
		while(temp>0)
		{
			int d=temp%10;
			if(d==i)
			{
				count++;
			}
			temp=temp/10;
		}
		if(count>0)
		{
			System.err.println(i+"----------"+count );
		}
			
		
		}
		
				
			}

		}

	
