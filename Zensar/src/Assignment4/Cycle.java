package Assignment4;



public class Cycle {
	int accountNo;
	int noOfWheels;
	
	public Cycle()
	{
		this(100,1);
		System.out.println("I am default constructor");
	}
	
	public Cycle(int accountNo,int noOfWheels)
	{
		//this();
		System.out.println("I am in another con");
	
		this.accountNo=accountNo;
		this.noOfWheels=noOfWheels;
		
		
	}
	
	public void getCycle()
	{
		System.out.println("1st method");
	}
	
	public void getCycle2()
	{
		this.getCycle();
		System.out.println("2nd method");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cycle c2=new Cycle();
		Cycle c1=new Cycle(100,12);
		
		c2.getCycle2();
		
		
		
	}

}




