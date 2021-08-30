package HomeWork;



class Employee
{
	int salary=10000;
	int id=10;
	
}

public class Programmer extends Employee {

	int bonus=1000;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Programmer p1=new Programmer();
		
		System.out.println(p1.bonus);
		System.out.println(p1.salary);
		System.out.println(p1.id);

	}

}

