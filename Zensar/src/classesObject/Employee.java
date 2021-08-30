package classesObject;

public class Employee {

	private int id;
	private String name;
	private int salary;


	public int getId() 
	{
		return id;
	}

	public void setId(int id) 
	{
		this.id = id;
	}

	public String getName() 
	{
		return name;
	}

	public void setName(String name) 
	{
		this.name = name;
	}

	public float getSalary() 
	{
		return salary;
	}

	public void setSalary(float salary)
	{
		this.salary = (int) salary;
	}



	public static void main(String[] args) {
		
		Employee e1=new Employee();
		e1.setId(10);
		e1.setName("Rahul");
		e1.setSalary(14242);
		
		System.out.println(e1.getId()+" "+e1.getName()+" "+e1.getSalary());
		
		

	}

}
