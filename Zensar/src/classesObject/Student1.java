package classesObject;

import java.util.Scanner;



public class Student1 {

	private int sid;
	private String sname;
	private long mobileNo;
	private int passoutYear;
	private CompanyTraining ct;
	
	

	public Student1(int sid, String sname, long mobileNo, int passoutYear, CompanyTraining ct) 
	{
		super();
		this.sid = sid;
		this.sname = sname;
		this.mobileNo = mobileNo;
		this.passoutYear = passoutYear;
		this.ct = ct;
	}

	


   @Override
	public String toString() {
		return "Student1 [sid=" + sid + ", sname=" + sname + ", mobileNo=" + mobileNo + ", passoutYear=" + passoutYear
				+ ", ct=" + ct + "]";
	}


public int getSid() {
		return sid;
	}


	public void setSid(int sid) {
		this.sid = sid;
	}


	public String getSname() {
		return sname;
	}



	public void setSname(String sname) {
		this.sname = sname;
	}



	public long getMobileNo() {
		return mobileNo;
	}


	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}


	public int getPassoutYear() {
		return passoutYear;
	}

	public void setPassoutYear(int passoutYear) {
		this.passoutYear = passoutYear;
	}


	public CompanyTraining getCt() {
		return ct;
	}


	public void setCt(CompanyTraining ct) {
		this.ct = ct;
	}



 public static void main(String[] args) {
		// TODO Auto-generated method stub
	 
	 Student1 s2=new Student1(1,"Rahul",123344,2020,new CompanyTraining(11,"Zensar",new Trainer(11,"hhh")));
	 System.out.println(s2);

	 

	}

}
