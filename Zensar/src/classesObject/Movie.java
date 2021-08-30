package classesObject;

import java.util.Scanner;


public class Movie {

	private int movieId;
	private String movieName;
	private Actor a1;

	public Movie()
	{
		
	}

	public Movie(int movieId, String movieName, Actor a1) {
		super();
		this.movieId = movieId;
		this.movieName = movieName;
		this.a1 = a1;
	}


	public int getMovieId() {
		return movieId;
	}

	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public Actor getA1() {
		return a1;
	}

	public void setA1(Actor a1) {
		this.a1 = a1;
	}


   public static void main(String[] args) {
	 Movie m1=new Movie();
	 m1.setMovieId(100);
	 m1.setMovieName("Indian");

	 
	 Actor a1=new Actor();
	 a1.setActorId(10);
	 a1.setActorName("akshay");
	 a1.setGender("male");
	 
    m1.setA1(a1);
    
    System.out.println(m1.getMovieId()+" "+m1.getMovieName()+" "+m1.getA1().
    		getActorId()+" "+m1.getA1().getActorName()+" "+m1.getA1().getGender());
	  
	  
	   
	   
	   
	   
	   
	 
	   
		

	}

}
