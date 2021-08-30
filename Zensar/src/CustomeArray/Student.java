package CustomeArray;

import java.util.Scanner;

public class Student {

	private int id;
	private String name;
	private int per;




	public Student(int id, String name, int per) {
		
		this.id = id;
		this.name = name;
		this.per = per;
	}



	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getPer() {
		return per;
	}

	public void setPer(int per) {
		this.per = per;
	}






	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", per=" + per + "]";
	}




	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student[] students=new Student[3];
		Scanner scanner=new Scanner(System.in);
		for(int i=0;i<students.length;i++)
		{
			System.out.println("Enter id,name per");
			int id=scanner.nextInt();
			String name=scanner.next();
			int per=scanner.nextInt();

			students[i]=new Student(id, name, per);

		}

		for(Student s1:students)
		{
			System.out.println(s1);
		}

	}

}
