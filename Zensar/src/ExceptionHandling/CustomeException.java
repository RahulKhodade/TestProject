package ExceptionHandling;

import java.util.Scanner;

class InvalidAgeException extends Exception
{

	public InvalidAgeException(String msg) {


		super(msg);

	}

}




public class CustomeException {

	static void valid(int age) throws InvalidAgeException
	{
		if(age<18)
		{
			throw new InvalidAgeException("Age is not valid to vote");
		}
		else {
			System.out.println("Welcome to vote");
		}
	}


	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name");
		String name=sc.nextLine();
		System.out.println("Enter age");
		int age=sc.nextInt();


		try 
		{
			valid(age);
		} 

		catch (InvalidAgeException ee)

		{
			System.out.println(ee);
		}

		

	}







}	


