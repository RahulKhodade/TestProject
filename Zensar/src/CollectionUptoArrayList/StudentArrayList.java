package CollectionUptoArrayList;

import java.util.ArrayList;
import java.util.Scanner;

class Student1
{
	int rollno;
	String name;


	public Student1(int rollno,String name) {

		this.rollno=rollno;
		this.name=name;


	}

	public String toString()
	{
		return "Roll no:"+rollno+" Name:"+name;
	}

}

public class StudentArrayList {
	public static void main(String[] args) {

		ArrayList<Student1> s1=new ArrayList<>();

		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter size of student");
		int size=scanner.nextInt();

		for(int i=0;i<size;i++)

		{
			System.out.println("Enter Student roll no and name");

			int rollno=scanner.nextInt();
			String name=scanner.next();

			Student1 s2=new Student1(rollno,name);
			s1.add(s2);

		}


		for(Student1 s:s1)
		{
			System.out.println(s);
		}


		//	   s1.add(new Student(10,"Rahul"));
		//	   s1.add(new Student(11,"Prashant"));
		//	   s1.add(new Student(12,"Amol"));
		//	   s1.add(new Student(13,"Vikas"));
		//	   
		//	   for(Student s:s1)
		//	   {
		//		   System.out.println(s);
		//	   }
		//	   



	
	}

}
