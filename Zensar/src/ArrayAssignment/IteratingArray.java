package ArrayAssignment;


public class IteratingArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr= new int[]{12,23,67,-10,89,46,22};
		int[] arr1=new int[arr.length];
		
		System.out.println("Original array elements");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}

		System.out.println("Iterating array elements");
		for(int i=0;i<arr1.length;i++)
		{
			arr1[i]=arr[i];
		}
		for(int i=0;i<arr1.length;i++)
		{
			System.out.println(arr1[i]);
			
		}
	}

}
