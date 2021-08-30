package StringAssignment;
//Q11
public class EmailValidOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String email="rahulkhodade11@gmail.com";

		if(email.contains("@") && email.contains("."))
		{
			int i1=email.indexOf('@');
			int i2=email.indexOf('.');

			if(i1<i2)
			{
				System.err.println("Valid email");
			}
			else {
				System.out.println("Not valid");
			}
		}
		else {
			System.out.println("Not valid");
		}
	}

}
