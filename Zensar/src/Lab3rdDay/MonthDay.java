package Lab3rdDay;

import java.util.Scanner;





public class MonthDay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter month");
		String month=scanner.next();
		
		switch(month)
		{
		
		case "Jan":
		case "March":
		case "May":
		case "July":
		case "Aug":
		case "Oct":
		case "Dec":
		 
			System.out.println("31 days");
			break;
			
		case "April":
		case "Jun":
		case "Sep":
		case "Nov":
			
			System.out.println("30 days");
			break;
			
		case "Feb":
			System.out.println("28 or 29");
			break;
			
			default:
			System.out.println("Ivalid");
		
		}
		
		
	}

}
