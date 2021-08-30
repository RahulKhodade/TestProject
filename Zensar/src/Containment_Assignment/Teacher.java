package Containment_Assignment;

//Q1


abstract class Teacher {

	int tid;
	String tname;
	long mobileNo;

	public Teacher(int tid,String tname,long mobileNo)
	{
		this.tid=tid;
		this.tname=tname;
		this.mobileNo=mobileNo;


	}
	public String toString() {
		return "Teacher [tid=" + tid + ", tname=" + tname + ", mobileNo=" + mobileNo + "]";
	}

	abstract void salary();



	public static void main(String[] args) {
		Teacher t1=new HourLybased(10,"Rahul",948948959, 7,6);
		System.out.println(t1);
		t1.salary();

		System.out.println();

		Teacher t2=new SalaryBased(1,"Amol",859959559,60000);
		System.out.println(t2);
		t2.salary();


	}

}

class HourLybased extends Teacher
{
	int rate_per_hr;
	int hr;


	public HourLybased(int tid, String tname, long mobileNo, int rate_per_hr, int hr) {
		super(tid, tname, mobileNo);
		this.rate_per_hr = rate_per_hr;
		this.hr = hr;
	}

	void salary()
	{
		System.out.println("Salary method of HourLybased ");
	}


}


class SalaryBased extends Teacher
{
	int salary;

	public SalaryBased(int tid, String tname, long mobileNo, int salary) {
		super(tid, tname, mobileNo);
		this.salary = salary;
	}





	public String toString() {
		return "SalaryBased [salary=" + salary + "]";
	}




	void salary()
	{
		System.out.println("Salary method for SalaryBased");
	}
}
