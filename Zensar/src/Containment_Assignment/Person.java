package Containment_Assignment;
//Q3
import java.util.Scanner;

public class Person {

	int id;
	String name;
	Vehicle v;

	public Person() {
		// TODO Auto-generated constructor stub
	}


	public Person(int id, String name, Vehicle v) {
		super();
		this.id = id;
		this.name = name;
		this.v = v;
	}


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

	public Vehicle getV() 
	{
		return v;
	}


	public void setV(Vehicle v) 
	{
		this.v = v;
	}


	public String toString()
	{
		return "Person [id=" + id + ", name=" + name + ", v=" + v + "]";
	}


	public static void main(String[] args) 
	{
		
//		Person p1=new Person(100,"Rahul",new Vehicle(10,"Shaine"));
//		System.out.println(p1);
//		
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter PersonId,Person name");
		int id=scanner.nextInt();
		String name=scanner.next();
		
		Person p2=new Person();
		p2.setId(id);
		p2.setName(name);
		
		System.out.println("Enter vehicle id,Vehicle name:");
		int vid=scanner.nextInt();
		String vname=scanner.next();
		
		Vehicle v1=new Vehicle();
		v1.setVid(vid);
		v1.setVname(vname);
		
		p2.setV(v1);
		
		System.out.println(p2);
	
//		p2.setV(new Vehicle());
//		p2.getV().setVid(vid);
//		p2.getV().setVname(vname);
		
		
		//System.out.println("Pid:"+ p2.getId()+" "+"Pname:"+ p2.getName()+" Vid:"+ p2.getV().getVid()+" "+"Vname:"+p2.getV().getVname());
		
		
		
		
		
    }

}


