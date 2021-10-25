package samplePrograms;

import java.util.Scanner;

public class Program3 {
	/* This program will remove numeric value from a given String. */
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		String s1 = null;
		String s2 = null;
		System.out.println("Enter a string");
		s1 = sc.next();
		StringBuilder builder = new StringBuilder();
		for(int i = 0; i<s1.length(); i++) {
			if(!Character.isDigit(s1.charAt(i))) {
				builder.append(s1.charAt(i));
			}
		}
		s2 = builder.toString();
		System.out.println(s2);

	}

}
