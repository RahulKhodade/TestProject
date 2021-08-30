package AbstractAndInterface;

interface Printable
{
	void print();
}

interface Showable
{
	void print();
}

public class TestInterface implements Printable,Showable {
	
	public void print()
	{
		System.out.println("Hello");
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TestInterface t1=new TestInterface();
		t1.print();

	}

}
