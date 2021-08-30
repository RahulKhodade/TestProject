package AbstractAndInterface;


abstract class Demo
{
	public int a;
	
	Demo()
	{
		a=10;
	}
	
	abstract public void set();
	abstract  public void get();
}

class Test extends Demo{
	
	
		 public void set(int a)
		{
			this.a=a;
		}
		 
		 public void get()
		 {
			 System.out.println(a);
		 }

			public void set() {
			// TODO Auto-generated method stub
			
		}
	}
	


public class AbstractDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test obj=new Test();
		obj.set(20);
		obj.get();
		

	}

}
