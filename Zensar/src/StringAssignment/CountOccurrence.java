package StringAssignment;

import java.util.Scanner;

//Q3
public class CountOccurrence {
	
	public static int count(String s,char c)
	{
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)==c)
			count++;
		}
		
	return count;
	
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a string");
		String str=scanner.nextLine();
		System.out.println("Enter Character ");
		char ch=scanner.next().charAt(0);


		count(str,ch);
		System.out.println(count(str,ch));
		




	}

}
