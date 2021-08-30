package CustomeArray;

import java.util.Arrays;
import java.util.Scanner;




public class Stud {

	int id;
	String name;
	String []hobbies;


	//using constructor

	public Stud() {

	}

	public Stud(int id,String name,String[]hobbies)
	{
		this.id=id;
		this.name=name;
		this.hobbies=hobbies;


	}

	
	
	
	@Override
	public String toString() {
		return "Stud [id=" + id + ", name=" + name + ", hobbies=" + Arrays.toString(hobbies) + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size=scanner.nextInt();
		Stud[] s=new Stud[size];

		for(int i=0;i<size;i++)
		{
			System.out.println("Enter id,name");
			int id=scanner.nextInt();
			String name=scanner.next();

			String hobbies[]=new String[3];
			System.out.println("Enter hobbies");
			for(int j=0;j<hobbies.length;j++)
			{
				hobbies[j]=scanner.next();

			}

			s[i]=new Stud(id,name,hobbies);

		}

		for(Stud ss:s)
		{
			System.out.println(ss);
		}

	}}
