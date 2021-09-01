package ExceptionHandling;

public class ArrayIndexException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {1,2,3,4};
		
		
			try {
			System.out.println(arr[5]);
			}
			catch (Exception e) {
				System.out.println(e);
				
			}
			finally {
				System.out.println("Finally block");
			}
		
		
	}

}
