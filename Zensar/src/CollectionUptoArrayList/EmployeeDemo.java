package CollectionUptoArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Employee implements Comparable<Employee>
{

	String ename;
	String designation;
	int age;

	public Employee(String ename, String designation, int age) {

		this.ename = ename;
		this.designation = designation;
		this.age = age;
	}


	public String toString() {
		return "Employee [ename=" + ename + ", designation=" + designation + ", age=" + age + "]";
	}



	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		
		return this.ename.compareTo(o.ename);
			
		}
	
	
}



class EmployeeDemo {

	public static void main(String[] args) {
		
		ArrayList<Employee> emp=new ArrayList<>();
		emp.add(new Employee("Rahul","Developer",23));
		emp.add(new Employee("Nishant","Testing",22));
		emp.add(new Employee("Amol","Senior Programmer",34));
		emp.add(new Employee("Sachin","Senior Software Engineer",25));
		
		Collections.sort(emp);
		
		for(Employee e:emp)
		{
			System.out.println(e);
		}
		
		
		

	}

}
