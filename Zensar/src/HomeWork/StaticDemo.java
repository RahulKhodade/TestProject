package HomeWork;

public class StaticDemo {
	
	int rollno;
	String name;
	
	static String college="CTBORA";
	
	public StaticDemo(int r,String n ) {
		rollno=r;
		name=n;
		
		
	}
	
	void dispaly()
	{
		System.out.println(rollno+" "+name+" "+college);
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		StaticDemo s1=new StaticDemo(10,"Rahul");
		s1.dispaly();
		

	}

}
