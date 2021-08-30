package StringAssignment;

import java.util.Scanner;


public class LongestWordInGivenString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String");
		String str=sc.nextLine();

		int res=0,length=0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)!=' ')
			{
				length++;

			}
			else {
                res=Math.max(res,length);
                length=0;
			}

		}



	}

}
