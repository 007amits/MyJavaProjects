package reverseString;

import java.util.Scanner;

public class ReverseString {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter a String"); 
		String str = sc.next();
		System.out.println(reverseString(str));

	}
	
	private static String reverseString(String str) {
		char ch[] = str.toCharArray();  
	    String rev = "";  
	    for(int i=ch.length-1;i>=0;i--) {
	    	rev+=ch[i];  
	    }
	    return rev; 
    } 

}
