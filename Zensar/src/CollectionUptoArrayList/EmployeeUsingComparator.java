package CollectionUptoArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Emp 
{

	String ename;
	String designation;
	int age;

	public Emp(String ename, String designation, int age) {

		this.ename = ename;
		this.designation = designation;
		this.age = age;
	}


	public String toString() {
		return "Employee [ename=" + ename + ", designation=" + designation + ", age=" + age + "]";
	}



	
}

class AgeComparator implements Comparator<Emp>
{

	
	public int compare(Emp o1, Emp o2) {
		if(o1.age==o2.age)
		return 0;
		
		else if(o1.age>o2.age)
		return 1;
		
		else 
			
			return -1;
		}
	
	
}




public class EmployeeUsingComparator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Emp> emp=new ArrayList<>();
		emp.add(new Emp("Rahul","Developer",23));
		emp.add(new Emp("Nishant","Testing",22));
		emp.add(new Emp("Amol","Senior Programmer",34));
		emp.add(new Emp("Sachin","Senior Software Engineer",25));
		
		Collections.sort(emp,new AgeComparator());
		
		for(Emp e:emp)
		{
			System.out.println(e);
		}
		

	}

}
