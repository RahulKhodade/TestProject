package Assignment4;

public class Area {
	
	
	int length,breadth;
	
	public void area(int sq)
	{
		int square=sq*sq;
		System.out.println(square);
	}
	
	public void area(int length,int breadth)
	{
		int rect=length*breadth;
		System.out.println(rect);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Area a1=new Area();
		a1.area(2);
		a1.area(2,3);

	}

}
