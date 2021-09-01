package ExceptionHandling;

public class ResolvingException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=20;
		int b=0;

		try {

			int data=a/b;  //throw exception			
		} 

		catch (Exception e) {
		
			//resolving
			System.out.println(a/(b+2));
		}

	}

}
