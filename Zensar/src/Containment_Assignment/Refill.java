package Containment_Assignment;



public class Refill {
	
	private String inkColor;
	private int length;
	private Nib n;
	
	
	public String getInkColor() {
		return inkColor;
	}
	public void setInkColor(String inkColor) {
		this.inkColor = inkColor;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public Nib getN() {
		return n;
	}
	public void setN(Nib n) {
		this.n = n;
	}
	
	public String toString() {
		return "Refill [inkColor=" + inkColor + ", length=" + length + ", n=" + n + "]";
	}
	
	
	

}
