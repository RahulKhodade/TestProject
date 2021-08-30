package classesObject;

public class Actor {
	
	private int actorId;
	private String actorName;
	private String gender;
	
	public Actor(){
		
	}
	
	
  public Actor(int actorId, String actorName, String gender) {
		super();
		this.actorId = actorId;
		this.actorName = actorName;
		this.gender = gender;
	}




	public void setActorId(int actorId)
	{
		this.actorId=actorId;
	}
	
	public int getActorId()
	{
		return actorId;
	}
	
	public void setActorName(String actorName)
	{
		this.actorName=actorName;
	}
	
	public String getActorName()
	{
		return actorName;
	}
	
	public void setGender(String gender)
	{
		this.gender=gender;
	}
	
	public String getGender()
	{
		return gender;
	}


		
	}


	
		
		
	
	


