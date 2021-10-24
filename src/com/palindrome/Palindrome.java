package com.palindrome;

import java.util.Scanner;

public class Palindrome {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int r,sum=0,temp;
		System.out.println("Enter a number");
		int n=sc.nextInt();
		
		temp=n;
		
		while(n>0) {
			r=n%10;  //getting remainder
			sum=(sum*10)+r;
			n=n/10;
		}
		
		if(temp==sum)
			System.out.println(temp+" is a Palindrome number");
		else
			System.out.println(temp+" is not a Palindrome number");  

	}

}
