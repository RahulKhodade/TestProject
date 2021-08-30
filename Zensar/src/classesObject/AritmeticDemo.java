package classesObject;



//Q7
public class AritmeticDemo {

	public int add(int a,int b)
	{
		return a+b;
	}

	public int subtraction(int a,int b)
	{
		return a-b;
	}

	public int multiplicaton(int a,int b)
	{
		return a*b;
	}
	
	public int division(int a,int b)
	{
		return a/b;
	}
	
	public int modulo(int a,int b)
	{
		return a%b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AritmeticDemo a1=new AritmeticDemo();
		System.out.println("Addition is:"+a1.add(10, 20));
		System.out.println("Sub is:"+a1.subtraction(20, 10));
		System.out.println("Multi is:"+a1.multiplicaton(10,10));
        System.out.println("Division is:"+a1.division(10,5));
        System.out.println("Modulo is:"+a1.modulo(1,5));
		



	}

}
