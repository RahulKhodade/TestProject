package ArrayExtraAssignment;

public class MergeArray {

	public static void main(String[] args) {
		
		int arr[]= {23,1,34,56,38};
		int arr1[]= {54,1,23,44,90};
		int arr2[]=new int[arr.length+arr1.length];
		System.err.println(arr2.length);
		
		for(int i=0;i<arr.length;i++)
		{
			arr2[i]=arr[i];
		}
		
         for(int i=0;i<arr1.length;i++)
         {
        	 arr2[arr.length+i]=arr1[i];
         }
         
         for(int i=0;i<arr2.length;i++)
         {
        	 System.out.print(arr2[i]+" ");
         }
	}

}
