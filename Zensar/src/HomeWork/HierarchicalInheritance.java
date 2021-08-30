package HomeWork;

class AnimalDemo1
{
	void eat()
	{
		System.out.println("Eating");
	}
}

class DogDemo1 extends AnimalDemo1

{
	
	void bark1()
	{
		System.out.println("Barking");
	}
}

class Cat1 extends AnimalDemo1
{
	void sleep()
	{
		System.out.println("Slepping");
	}
}




public class HierarchicalInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat c1=new Cat();
		c1.sleep();
		c1.eat();
		

	}

}
