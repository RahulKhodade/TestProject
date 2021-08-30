package Day4Assignment;

import java.util.Scanner;

 
public class SumOfOddNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner scanner=new Scanner(System.in);
   System.out.println("Enter a number");
   int num=scanner.nextInt();
   int sum=0;
   for(int i=0;i<=num;i++)
   {
	   if(i%2!=0)
	   {
		   sum=sum+i;
	   }
   }
   System.out.println(sum);
   
   
	}

}
