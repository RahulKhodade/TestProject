package Assignment4;



public class ThisKeyword {

	int rollno;
	String name;
	float fee;



	public ThisKeyword(int rollno,String name,float fee)
	{

		this.rollno=rollno;
		this.name=name;
		this.fee=fee;

	}

	public void display()
	{
		System.out.println(rollno+" "+name+" "+fee);
	}


	//method

	void a(int a)
	{
		System.out.println(a);
		System.out.println("Hello A");
	}

	void b()
	{
		this.a(10);
		System.out.println("Hollo B");

	}

	//Constructor

	public ThisKeyword() {
		
		this(10);

		System.out.println("Default constuctor");

	}
	public ThisKeyword(int a)
	{
		//this();

		System.out.println("Value of a is:"+a);
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ThisKeyword t1=new ThisKeyword(10,"Rahul",1000);
		t1.display();
		t1.b();   //method                                                             
		
		ThisKeyword t2=new ThisKeyword();




	}

}
