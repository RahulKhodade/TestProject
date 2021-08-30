package HomeWork;

public class StaticBlock {
	
	static int a;

	static
	{
		a=11;
		System.out.println(a);
		
		System.out.println("Static block is invoked 1st");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Main");
		
	}

}
