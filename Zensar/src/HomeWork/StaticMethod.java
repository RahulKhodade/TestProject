package HomeWork;



public class StaticMethod {
	
	int rollno;
	String name;
	static String colleg="ITS";
	
	public StaticMethod(int r,String name) {
		rollno=r;
		this.name=name;
	}
	
	
	static void change()
	{
		
		
	   colleg="CTOBORA";
	}

	void display()
	{
		System.out.println(rollno+" "+name+" "+colleg);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StaticMethod.change();
		StaticMethod s1=new StaticMethod(10,"rahul");
		
		s1.display();
		
		
	}

}
