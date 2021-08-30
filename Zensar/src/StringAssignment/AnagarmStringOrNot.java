package StringAssignment;
//Q8
import java.util.Arrays;
import java.util.Scanner;

public class AnagarmStringOrNot {

	public static void main(String[] args) {
		 //TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter First String");
		String str1=scanner.nextLine();
		System.out.println("Enter second String");
		String str2=scanner.nextLine();
		
		char[]arr1=str1.toCharArray();
		char[]arr2=str2.toCharArray();
		
		Arrays.sort(arr1);
		
		Arrays.sort(arr2);
		
		if(String.valueOf(arr1).equals(String.valueOf(arr2)))
		{
			System.out.println("Anagram String");
		}
		else {
			System.out.println("Not Anagram String");
		}
		
		

	}

}
