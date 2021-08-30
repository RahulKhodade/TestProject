package classesObject;

public class CompanyTraining {
	
	private int cid;
	private String companyName;
	private Trainer t;
	
	public CompanyTraining(int cid, String companyName, Trainer t) {
		super();
		this.cid = cid;
		this.companyName = companyName;
		this.t = t;
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public Trainer getT() {
		return t;
	}

	public void setT(Trainer t) {
		this.t = t;
	}

	@Override
	public String toString() {
		return "CompanyTraining [cid=" + cid + ", companyName=" + companyName + ", t=" + t + "]";
	}
	
	
	
	
	
	
		
	}

