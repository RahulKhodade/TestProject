package Assignment4;



public class Student {
	
	String name;
	int age;
	String address;
	
	public void setInfo(String name,int age)
	{
		System.out.println(name+" "+age);
		
	}
	public void setInfo(String name,int age,String address)
	{
		System.out.println(name+" "+age+" "+address);
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1=new Student();
		s1.setInfo("Amol",22);
		s1.setInfo("Rahul",24,"Parner");

	}

}
