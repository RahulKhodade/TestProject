package ExceptionHandling;

public class CatchMultipleException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]=new int[5];
		
		try
		{
			
		a[6]=30/0;
			
		
		}
		
		catch(ArithmeticException e)
		{
			e.printStackTrace();
		}

		catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
			
		}
		System.out.println();
	}

}
