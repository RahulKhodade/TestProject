package Assignment4;

//Q	13
public class PrintDemo {
	
	int n;
	char ch;
	
	public void form(int n,char ch)
	{
	System.out.println(n+" "+ch);	
	}

	public void from(char ch,int n)
	{
		System.out.println(ch+" "+n);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintDemo p1=new PrintDemo();
		p1.form(11,'R');
		p1.from('U',2);
		
		

	}

}
