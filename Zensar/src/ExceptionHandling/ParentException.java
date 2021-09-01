package ExceptionHandling;

public class ParentException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		try
		{
			int a=100/0;
		}
		
		//parent class Exception
		catch(Exception e) {
		
			System.out.println(e);
			//System.out.println("You can't divide by zero");
			
		}

	}

}
