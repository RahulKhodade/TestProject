package Assignment4;



public class Account {

	long accountNo;
	String customerName;

	
	public Account()
	{
		System.out.println("I am in default constructor");
		
	}

	public Account(long accountNo,String cutomerName)
	{
		this.accountNo=accountNo;
		this.customerName=cutomerName;
		
		System.out.println(accountNo+" "+cutomerName);
		
		System.out.println("I am in para constructor");
	}

	public static void main(String[]args) {
		
		
		Account a1=new Account();
		System.out.println(a1.accountNo+" "+a1.customerName);
		
		Account a2=new Account(10,"Rahul");
		

	}



}
