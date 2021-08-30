package Lab3rdDay;

public class EvenNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int i=1;
		while(i<50)
		{
			if(i%2==0)
			{
				System.out.print(i+" ");
				
			}
			
			i++;
		}
		
System.out.println(" ");
		System.out.println("Reverse even number");
		
		//reverse even number
		int j=50;
		while(j>0)
		{
			if(j%2==0)
			{
				System.out.print(j+" ");
			}
			j--;
		}
		
		
	}

}
