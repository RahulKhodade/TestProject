package HashMap.com;

import java.util.BitSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;



class Student
{
	int rollno;
	String name;
	int age;
	
	public Student(int rollno, String name, int age) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.age = age;
	}

	
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", age=" + age + "]";
	}
	
	
}




public class StudentHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer,Student> st=new HashMap<>();
		
		st.put(1,new Student(11,"Amol",23));
		st.put(2,new Student(12,"Rahul",34));
		st.put(3,new Student(13,"Vishal",32));
		st.put(4,new Student(14,"Sachin",30));
//		
//	for(Map.Entry<Integer,Student> em:st.entrySet())
//	{
//		System.out.println(em.getKey()+" "+em.getValue());
//	}
//	
	Set set=st.entrySet();
	Iterator itr=set.iterator();
	while(itr.hasNext())
	{
		Map.Entry em=(Map.Entry)itr.next();
		System.out.println(em);
	}

 
		
	}

}
