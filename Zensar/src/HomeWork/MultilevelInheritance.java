package HomeWork;



class AnimalDemo
{
	void eat()
	{
		System.out.println("Eating");
	}
}

class DogDemo extends AnimalDemo

{
	
	void bark()
	{
		System.out.println("Barking");
	}
}

class Cat extends DogDemo
{
	void sleep()
	{
		System.out.println("Slepping");
	}
}


public class MultilevelInheritance {

public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	Cat c1=new Cat();
	c1.sleep();
	c1.bark();
	c1.eat();

	}

}
