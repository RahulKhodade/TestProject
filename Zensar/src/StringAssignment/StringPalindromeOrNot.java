package StringAssignment;

import java.util.Scanner;



public class StringPalindromeOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 String b="";
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a string");
		String str=scanner.nextLine();
       
		int length=str.length();
		for(int i=length-1;i>=0;i--)
		{
			b=b+str.charAt(i);
		}
			if(str.equalsIgnoreCase(b))
			{
				System.out.println("The string is pali");
			}
			
           else 
           {
				System.out.println("The string is not pali");

		
	}}
}

