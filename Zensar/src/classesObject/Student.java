package classesObject;

//Q 1-4

public class Student {
	
	int id=10;
	String name="rahul";
	
	public void display() {
		
		System.out.println("Id:"+id+" Name:"+name);
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1=new Student();
		Student s2=new Student();
//		System.out.println(s1);
//		System.out.println(s2);
		
		System.out.println(s1.id);
		System.out.println(s1.name);
		
	s1.display();
		
		
		
		
	}

}
