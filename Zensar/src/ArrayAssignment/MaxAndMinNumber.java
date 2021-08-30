package ArrayAssignment;
//Q10
public class MaxAndMinNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int []arr= {23,2,34,56,76,34,67};
		int max=arr[0];
		int min=arr[0];
		System.out.println("Maximum value in array:");
		for(int i=1;i<arr.length;i++)
		{
			if(max<arr[i])
			{
				max=arr[i];
				
			}
			
		}
		System.out.println(max);
		
		System.out.println("Minimum value in array ");
		for(int j=0;j<arr.length;j++)
		{
			if(min>arr[j])
			{
				min=arr[j];
			}
		}

		System.out.println(min);
	}

}
