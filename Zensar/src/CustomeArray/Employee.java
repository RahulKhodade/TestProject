package CustomeArray;

import java.util.Scanner;

public class Employee {

	int id;
	String name;
	float salary;


	public Employee() {
		// TODO Auto-generated constructor stub
	}	

	public Employee(int id,String name,float salary)
	{
		this.id=id;
		this.name=name;
		this.salary=salary;
	}

	public String toString()
	{
		return "Id:"+id+" Name:"+name+" Salary:"+salary;


	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);

		System.out.println("Enter size of employee arrray");
        int size=scanner.nextInt();
        
		Employee []e1=new Employee[size];
        for(int i=0;i<e1.length;i++)
        {
		

			System.out.println("Enter id,name,salary");
			int id=scanner.nextInt();
			String name=scanner.next();
			float salary=scanner.nextFloat();

			e1[i]=new Employee(id,name,salary);


		}
        
        for(Employee e:e1)
        {
        	System.out.println(e);
        }
       
        
//        System.out.println("Max salary");
//        for(int i=0;i<e1.length;i++)
//        {
//        	if(e1[i].salary>10000)
//        	{
//        		System.out.println(e1[i]+" ");
//        	}
//        }


	}
	}
	

