package Array;

import java.util.Scanner;

public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char[] ch=new char[5];
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter char");
		
		int count=0;
		for(int i=0;i<ch.length;i++)
		{
			ch[i]=scanner.next().charAt(0);
		}

		for(int i=0;i<ch.length;i++)
			
		{
			if(ch[i]=='a' || ch[i]=='e' || ch[i]=='i' || ch[i]=='o' || ch[i]=='u')
			{
				count++;
			}
		}
		System.out.println(count);
	}

}
