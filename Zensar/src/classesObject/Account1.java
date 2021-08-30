package classesObject;
//Q8



public class Account1 {

	public long accountNo;
	public String customerName;
	
	public Account1()
	{
		System.out.println("I am in default ");
	}
	
	public Account1(long accountNo,String customerName)
	{
	this.accountNo=accountNo;
	this.customerName=customerName;
	
	System.out.println("I am in parametrized constructor");
	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Account1 a1=new Account1();
		Account1 a2=new Account1(737347487,"Rahul");
		System.out.println(a2.accountNo+" "+a2.customerName);
	}

}
