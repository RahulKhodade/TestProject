package StringAssignment;

//Q1
public class StringsMethod {

	public static void main(String[] args) {

		//charAt
		String str="Rahul";
		System.out.println(str.charAt(2));

		//length: return length of the string
		System.out.println("Length is:"+str.length());

		//Substring :returns the part of the string
		System.out.println("Substring is:"+str.substring(2));  //startindex
		System.out.println("Substring is:"+str.substring(1,4));  //n-1;


		//equals :this method compares two string based on the content of the string

		String str2="Java";
		String str3="Java";
		String str4=new String("Java");
		String str5=new String("Java");
		String str6="C++";

		System.out.println(str2.equals(str3));  //true
		System.out.println(str4.equals(str2)); //true
		System.out.println(str4.equals(str5)); //true
		System.out.println(str2.equals(str6)); //false
		System.out.println(str5.equals(str6)); //false

		//== oprator :this operator compares references 
		System.out.println("== operator");
		System.out.println(str2==str3);  //true
		System.out.println(str2==str4);  //false
		System.out.println(str4==str5);  //false

		//compareTo : str1==str2 return 0; str1>str2:positive value; str1<str2:negative value

		System.out.println(str2.compareTo(str3));  //0
		System.out.println(str2.compareTo(str6));   //positive value:7
		System.out.println(str6.compareTo(str2));    //-7


		//isEmpty :string is empty its return true otherwise its return false

		String s7=new String("");
		String s8="Amol";
		System.out.println(s7.isEmpty()); //true
		System.out.println(s8.isEmpty());  //false
		
		
		//indexOf
		
		String str7=new String("Java is my favourite language");
		System.out.println(str7.indexOf('i'));  //5
		System.out.println(str7.indexOf("my")); //8
		System.out.println(str7.indexOf("is",4)); //s
		System.out.println(str7.indexOf('a',12));  //12
		
		
		//contains :this method searches the sequence of char in the string,//return true or false
		
		System.out.println(str7.contains("my"));
		System.out.println(str7.contains("hi"));
		
		
		//concat
		
		str2.concat("Programming");
		System.out.println(str2);
		
		str2=str2.concat("Progamming");
		System.out.println(str2);
		
		//intern
		 String string=str2.intern(); //same copy
		System.out.println(string);
		
		//toLowerCase and toUpperCase
		
		String s="Rahul";
		System.out.println(s.toLowerCase());
		System.out.println(s.toUpperCase());
		
	}

}
