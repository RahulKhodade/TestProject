package classesObject;
//Q9
public class Emp {

	private int id;
	private String name;
	private float salary;

	
	public void setId(int id)
	{
		this.id=id;
	}
	
	public int getId()
	{
		return id;
	}
	
	public void setName(String name)
	{
		this.name=name;
	}
	
	public String getName()
	{
		return name;
		
	}
	
	public void setSalary(float salary)
	{
		this.salary=salary;
	}
	
	public float getSalary()
	{
		return salary;
	}
	
	public String toString()
	{
		return "Id:"+id +" Name:"+name+" Salary:"+salary;
	}
	
	public static void main(String[] args) {
		
		Emp e1=new Emp();
		e1.setId(10);
		e1.setName("Rahul");
		e1.setSalary(10000);
		
		System.out.println(e1);
		
		

	}

}



