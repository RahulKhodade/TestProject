package ExceptionHnadling;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Exception2 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try 
		{
			FileReader fReader=new FileReader("d:\\rahul.txt");
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
	}
}
