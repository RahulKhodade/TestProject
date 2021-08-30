package AbstractAndInterface;

interface Print
{
	void print();
}

interface Show
{
	void show();
}




public class InterfaceDemo implements Print,Show {


	public void print()
	{
		System.out.println("Welcome");

	}

	public void show() 
	{
		System.out.println("Print");
	}
	public static void main(String[]args){

		InterfaceDemo demo=new InterfaceDemo();
		demo.print();
		demo.show();

	}

}
