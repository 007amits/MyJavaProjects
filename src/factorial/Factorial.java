package factorial;

import java.util.Scanner;

public class Factorial {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int i,fact=1;
		System.out.println("Enter a number");
		int n=sc.nextInt();
		for(i=1; i<=n; i++) {
			fact = fact*i;
		}
		
		System.out.println("Factorial of "+n+" is: "+fact); 

	}

}
