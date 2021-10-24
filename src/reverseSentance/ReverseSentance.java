package reverseSentance;

import java.util.Scanner;

public class ReverseSentance {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter a String"); 
		String str = sc.nextLine();
		System.out.println(reverseWords(str));

	}
	
	static String reverseWords(String str) {
		String[] temp = str.split(" ");
        String result = "";
        
        for (int i = temp.length-1; i >= 0; i--) {
            result = result + temp[i] + " ";
        }
        
        return result;
    }

}
