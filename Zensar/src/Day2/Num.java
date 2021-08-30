package Day2;

import java.util.Scanner;

public class Num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter 3 number");
int num1=sc.nextInt();
byte num2=sc.nextByte();
short num3=sc.nextShort();

System.out.println("Addition of three num is:"+(num1+num2+num3));

System.out.println("Enter ht:");
float ht=sc.nextFloat();

System.out.println("Enter name:");
String name=sc.next();

System.out.println("Enter Gender M/F");
char ch=sc.next().charAt(0);

System.out.println("Enter boolean Value");
boolean b=sc.nextBoolean();
		
	}

}
