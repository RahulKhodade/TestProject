package LabClassWork;



public class Institude {

	int id;
	String name;
	Branch b1;
	
	public Institude() {
		// TODO Auto-generated constructor stub
	}



	public Institude(int id, String name, Branch b1) {
		super();
		this.id = id;
		this.name = name;
		this.b1 = b1;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}

	public Branch getB1() {
		return b1;
	}

	public void setB1(Branch b1) {
		this.b1 = b1;
	}



	public String toString() {
		return "Institude [id=" + id + ", name=" + name + ", b1=" + b1 + "]";
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Institude i1=new Institude(10,"Pune",new Branch(11,"Bas",new Subject(20,"Java",new Topic
				(30,"Method Overloading",new SubTopic(40,"Method Overriding",new Question(50,"What is class"))))));
		
		System.out.println(i1);
		
		
//		Institude i1=new Institude();
//		i1.setId(10);
//		i1.setName("Pune");
//		
//		Branch b1=new Branch();
//		b1.setId(11);
//		b1.setName("Bsc");
//		
//		Subject s1=new Subject();
//		s1.setId(20);
//		s1.setName("Java");
//		
//		Topic t1=new Topic();
//		t1.setId(30);
//		t1.setName("Method Overloading");
//		
//		SubTopic s2=new SubTopic();
//		s2.setId(40);
//		s2.setName("Method overriding");
//		
//		Question q1=new Question();
//		q1.setId(50);
//		q1.setName("What is Class ?");
//		
//		
//		i1.setB1(b1);
//		b1.setS1(s1);
//		s1.setT1(t1);
//		t1.setSt(s2);
//		s2.setQ1(q1);
//		
//		System.out.println(i1);
	
		}

}

class Branch
{
	int id;
	String name;
	Subject s1;
	
	public Branch() {
		
	}
	
	
	public Branch(int id, String name, Subject s1) {
		super();
		this.id = id;
		this.name = name;
		this.s1 = s1;
	}
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Subject getS1() {
		return s1;
	}
	public void setS1(Subject s1) {
		this.s1 = s1;
	}
	
	
	public String toString() {
		return "Branch [id=" + id + ", name=" + name + ", s1=" + s1 +"]";
	}
	
}



class Subject
{
	int id;
	String name;
	Topic t1;
	
	
	
	public Subject() {
		
	}
	
	
	
	public Subject(int id, String name, Topic t1) {
		super();
		this.id = id;
		this.name = name;
		this.t1 = t1;
	}
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Topic getT1() {
		return t1;
	}
	public void setT1(Topic t1) {
		this.t1 = t1;
	}

	public String toString() {
		return "Subject [id=" + id + ", name=" + name + ", \n t1=" + t1 + "]";
	}
	
	
	
	
	
}

class Topic
{
	int id;
	String name;
	SubTopic st;
	
	
	public Topic() {
		
	}
	
	
	public Topic(int id, String name, SubTopic st) {
	
		this.id = id;
		this.name = name;
		this.st = st;
	}
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public SubTopic getSt() {
		return st;
	}
	public void setSt(SubTopic st) {
		this.st = st;
	}

	public String toString() {
		return "Topic [id=" + id + ", name=" + name + ", st=" + st + "]";
	}
	
	
	
	
}

class SubTopic
{
	int id;
	String name;
	Question q1;
	
	public SubTopic() {
		
	}
	
	
	
	public SubTopic(int id, String name, Question q1) {
		super();
		this.id = id;
		this.name = name;
		this.q1 = q1;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Question getQ1() {
		return q1;
	}
	public void setQ1(Question q1) {
		this.q1 = q1;
	}

	
	public String toString() {
		return "SubTopic [id=" + id + ", name=" + name + ", q1=" + q1 + "]";
	}
	
	
	
	
}
class Question
{
	
   int id;
	String name;
	
	
	public Question() {
		
	}
	
	
	public Question(int id, String name) {

		this.id = id;
		this.name = name;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String toString() {
		return "Question [id=" + id + ", name=" + name + "]";
	}
	
	
}