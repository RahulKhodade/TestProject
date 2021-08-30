package Containment_Assignment;


public class Vehicle {
	
	int vid;
	String vname;
	
	public Vehicle() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Vehicle(int vid, String vname) {
		super();
		this.vid = vid;
		this.vname = vname;
	}


  public int getVid() {
		return vid;
	}

  public void setVid(int vid) {
		this.vid = vid;
	}

  public String getVname() {
		return vname;
	}

  public void setVname(String vname) {
		this.vname = vname;
	}



public String toString() {
	return "Vehicle [vid=" + vid + ", vname=" + vname + "]";
}
	
	
	
	


	
	
	

}
