package dayfive;

public class Calculator {

	int a,b;
	
	public Calculator(int a,int b) {
		this.a=a;
		this.b=b;
		
	}
	void add()
	{
		int c=a+b;
		System.out.println("Addition is:"+c);
	}
	
	int multiply()
	{
		return a*b;
	}
	float division()
	{
		return a/b;
	}
	
	static int factorial(int n)
	{
	int fact=1;
	for(int i=1;i<=n;i++)
	{
		fact=fact*i;
	}
	System.out.println(fact);
	return fact;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calculator c1=new Calculator(20,10);
	   c1.add();
       System.out.println("Multiply is:"+c1.multiply());
       System.out.println("Division is:"+c1.division());
	   
	  
	   
       Calculator.factorial(5);
     
	}

}
