package classesObject;
//Q10
public class Stud1 {

	private int rollNo;
	int admissionNo;
	protected int age;
	public int courseId;

	public int doPublic(int r)
	{
		return r;
		
	}

	int doDefault(int admissionNo)
	{
		return admissionNo;
	}

	protected int doProtected(int age)
	{
		return age;

	}

	private int doPrivate(int rollNo)
	{
		return rollNo;
		
	}




}
