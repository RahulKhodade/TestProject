package Containment_Assignment;
//Q2
import java.util.Scanner;

;

public class Pen {

	private int capLength;
	private String brand;
	private Refill r;




	public int getCapLength() {
		return capLength;
	}

	public void setCapLength(int capLength) {
		this.capLength = capLength;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public Refill getR() {
		return r;
	}

	public void setR(Refill r) {
		this.r = r;
	}

	
	public String toString() {
		return "Pen [capLength=" + capLength + ", brand=" + brand + ", r=" + r + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Pen p1=new Pen();
//		p1.setBrand("AAA");
//		p1.setCapLength(5);
//		
//		Refill r1=new Refill();
//		r1.setInkColor("Red");
//		r1.setLength(2);
//		
//		Nib n1=new Nib();
//		n1.setMaterialType("bbbb");
//		n1.setWidth(9);
//		
//		r1.setN(n1);
//		p1.setR(r1);
//		
//		System.out.println(p1);
//		
		
		Pen p2=new Pen();
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enetr capacity length,brand");
		int length=scanner.nextInt();
		String brand=scanner.next();
		p2.setCapLength(length);
		p2.setBrand(brand);
		
		Refill r2=new Refill();
		System.out.println("Enter inkColor,length");
		String color=scanner.next();
		int len=scanner.nextInt();
		r2.setInkColor(color);
		r2.setLength(len);
		
		Nib n2=new Nib();
		System.out.println("Enter Material type,width");
		String mtype=scanner.next();
		int width=scanner.nextInt();
		n2.setMaterialType(mtype);
		n2.setWidth(width);
		
		r2.setN(n2);
		p2.setR(r2);

		System.out.println(p2);
		
		
		
		
		
		
		
		}
		
		
	}


