package ArrayAssignment;

import java.util.Scanner;



public class SearchGivenNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int []arr= {12,23,54,78,89,15,96};
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=scanner.nextInt();
		
		int found=0;
		for(int i=0;i<arr.length;i++)
		{
			if(num==arr[i])
			{
				found++;
				System.out.println(num+" is found in array present at position "+i);
				
			}
			
			}
		if(found==0)
		{
			System.out.println("Element not present");
		}
		
	}

	}


