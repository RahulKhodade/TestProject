package StringAssignment;

//9
public class CountTotalNumberOfWords {

	public static int Count(String s1)
	{
		int count=1;

		for(int i=0;i<s1.length();i++)
		{
         
			if(s1.charAt(i)==' '&&s1.charAt(i+1)!=' ')
			{
				count++;
				
			}
			
		}

		return count;
	}



	public static void main(String[] args) {

		String str=new String("Java is object oriented language");
		System.out.println(Count(str));


	}

}
