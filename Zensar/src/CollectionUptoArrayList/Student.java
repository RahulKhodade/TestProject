package CollectionUptoArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Student implements Comparable<Student>{
	int rollno;
	String name;
	int age;





	public Student(int rollno, String name, int age) {

		this.rollno = rollno;
		this.name = name;
		this.age = age;
	}





	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", age=" + age + "]";
	}




	public int compareTo(Student s)
	{
		if(this.age==s.age)


			return 0;

		else if(age>s.age)
			return 1;

		else 
			return -1;
	}




	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Student> a1=new ArrayList<Student>();
		
		
		a1.add(new Student(13,"Amol",23));
		a1.add(new Student(23,"Rahul",90));
		a1.add(new Student(12, "Vishal",34));

		Collections.sort(a1);

		for(Student s1:a1)
		{
			System.out.println(s1);
		}

	}

}
