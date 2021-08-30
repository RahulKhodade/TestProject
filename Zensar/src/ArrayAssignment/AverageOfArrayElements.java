package ArrayAssignment;


import java.util.Scanner;

//Q2
public class AverageOfArrayElements {

	public static void main(String[] args) {

		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter size of array");
		int size=scanner.nextInt();
		System.out.println("Enter the elements in array");
		int []arr=new int[size];

		int sum=0,avg=0;
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=scanner.nextInt();

		}

		for(int i=0;i<arr.length;i++)
		{
			sum=sum+arr[i];
		}

		System.out.println("Sum is:"+sum);

		avg=sum/5;

		System.err.println("Avg is:"+avg);
	}

}
