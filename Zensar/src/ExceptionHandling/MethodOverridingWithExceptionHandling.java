package ExceptionHandling;

import java.io.IOException;

//if the superclass method does not declare an exception then subclass overriden method cannot declare checked exception

class Parent
{
	void m1() 
	{
		System.out.println("Parent method");
	}
}

class Child extends Parent
{
	void m1() throws IOException //we can't declare checked exception
	{
		System.out.println("Child Method");
	}
}

//if the superclass method does not declare an exception then subclass overriden method can't declare checked exception but 
//we can declare uncheked exception

class Parent1
{
	void m2()
	{
		System.out.println("Parent method");
	}
	
	
}

class Child1 extends Parent1
{
	void m2() throws ArithmeticException
	{
		System.out.println("Child method");
	}
}

public class MethodOverridingWithExceptionHandling {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent1 p=new Child1();
		p.m2();
	
	

	}

}
