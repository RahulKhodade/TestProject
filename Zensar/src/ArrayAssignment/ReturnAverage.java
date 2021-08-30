package ArrayAssignment;


import classesObject.Stud1;

public class ReturnAverage {


	public static int average(int arr[])
	{
		int sum=0,avg=0;
		for(int i=0;i<arr.length;i++)

		{
			sum=sum+arr[i];
		}
		avg=sum/arr.length;
		return avg;

		//Double type array

}


public static double average(double d1[])
{
	double sum=0,avg=0;
	for(int i=0;i<d1.length;i++)
	{
		sum=sum+d1[i];
	}
	avg=sum/d1.length;
	return avg;
	
}



	public static void main(String[] args) {


		int a[]=new int[] {11,65,78,23,89,25};
		average(a);
		System.out.println("Avg is:"+average(a));

		
       double d[]=new double[] {12.2,56.6,89.4};
       average(d);
       System.out.println("Avg is:"+average(d));

	}

}
