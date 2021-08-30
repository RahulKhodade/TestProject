package Inheritance;



class Employee
{
	int salary=4000;
	
}

class Progammer extends Employee
{
	 int bonus=10000;
}



//Singal Inheritance

class Student
{
	int rollno=1;
	 String name="rahul";
}


class College extends Student
{
	int rollno=11;
}

public class InheritanceDemo {

	public static void main(String[] args) {
		
		Progammer p1=new Progammer();
		System.out.println(p1.bonus+" "+p1.salary);
	
		
		College c1=new College();
		System.out.println();
		
		
		
		

	}

}
