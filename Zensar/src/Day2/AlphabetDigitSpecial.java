package Day2;

import java.util.Scanner;

public class AlphabetDigitSpecial {

	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a character:");
		char ch=sc.next().charAt(0);
		
		if(ch>='a'&& ch<='z'|| ch>='A' && ch<='Z')
		{
			System.out.println("Character is alphabate");
		}
		else if(ch>='0'&& ch<='9')
		{
			System.out.println("Character is digit");
		}
		else
		{
			System.out.println("Character is special");
		}
		
		
	}

}
