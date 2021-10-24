package reverseString;

import java.util.Scanner;

public class ReverseStringUsingStringBuilder {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter a String"); 
		String str = sc.next();
		System.out.println(reverseString(str));

	}
	
	private static String reverseString(String str) {  
	    StringBuilder sb=new StringBuilder(str);  
	    sb.reverse();  
	    return sb.toString();  
	    }  

}
