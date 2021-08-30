package AbstractAndInterface;



interface Bank
{
	float rateOfInterest();
}

class SBI implements Bank{
	
	public float rateOfInterest()
	{
		return 9.0f;
	}
	
}

class ICICI implements Bank
{
	public float rateOfInterest()
	{
		return 8.15f;
	}
}


class HDFC implements Bank
{
	
public float rateOfInterest() {
		
		return 9.2f;
	}
}

public class BankDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Bank bank=new ICICI();
		System.out.println(bank.rateOfInterest());
		

	}

}
