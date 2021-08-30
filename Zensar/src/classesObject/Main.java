package classesObject;



//Q5 copy ont object value into another

public class Main {

	int id;
	String name;
	float fee;
	
	public Main(int id,String name,float fee) {
		
		this.id=id;
		this.name=name;
		this.fee=fee;
		
		
		
		
	}
	
	public Main(Main m3)
	{
		this.id=m3.id;
		this.name=m3.name;
		this.fee=m3.fee;
	}
	

	public String toString() {
		return "Main [id=" + id + ", name=" + name + ", fee=" + fee + "]";
	}




	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Main m1=new Main(10,"Rahul",1000);
		System.out.println(m1);
		
		Main m2=new Main(m1);
		System.out.println(m2);
		

	}

}
