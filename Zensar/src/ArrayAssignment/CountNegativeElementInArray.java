package ArrayAssignment;
//8
import Assignment4.Area;

public class CountNegativeElementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]= {-2,34,-4,-5,60,25,-78,9,-67,-8};
		int count=0;
		System.out.println("Original array elements");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}

		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<0)
			{
				count++;
			}
		}
		System.out.println("Total Negative number in array:"+count);





	}

}
