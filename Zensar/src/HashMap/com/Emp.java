package HashMap.com;

import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.Map.Entry;



public class Emp {


	int id;
	String name;

	public Emp(int id,String name)
	{
		this.id=id;
		this.name=name;

	}




	public String toString() {
		return "Emp [id=" + id + ", name=" + name + "]";
	}

	public int hashCode()
	{
		return id;
	}

	public boolean equals(Object o )
	{
		Emp e=(Emp) o;
		if(this.name.equals(e.id))
		{
			return true;
		}
		return false;
	}

	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		LinkedHashMap<Emp,Integer> m=new LinkedHashMap<>();
		for(int i=0;i<3;i++)
		{
			System.out.println("Enter id:");
			int id=sc.nextInt();

			System.out.println("Enter name:");
			String name=sc.next();
			Emp e=new Emp(id,name);
			m.put(e,e.id);

		}
		for(Entry<Emp,Integer> d:m.entrySet())
		{
			System.out.println("Key:"+d.getKey()+" Value:"+d.getValue());
		}
	}

}
