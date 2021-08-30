package Array;

import java.util.Scanner;

public class ArrayInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]=new int[5];
		Scanner scanner=new Scanner(System.in);
		for( int i=0;i<a.length;i++)
		{
			a[i]=scanner.nextInt();
		}
		
		
		int even=0;
		int b[]= {1,2,3,4,5};
		for(int i=0;i<b.length;i++)
		{
			if(b[i]%2==0)
			{
				even++;
			}
		}

for(int t:b)
{
	System.out.println(t);
}
		char ch[]= {'r','h','u','l'};
//		for(int i=0;i<ch.length;i++)
//		{
//			System.out.println(ch[i]);
//		}

		for(char d:ch)
		{
			System.out.println(d);
		}
		

	}

}
