package fibonacci;

import java.util.Scanner;

public class Fibonacci {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter a number");
		int n=sc.nextInt();
		if(n == 0) {
			System.out.print("Invalid position");
		} else if(n == 1) {
			System.out.print("The "+n+"st fibonacci number is : "+fibo(n-1));
		} else if(n == 2) {
			System.out.print("The "+n+"nd fibonacci number is : "+fibo(n-1));
		} else if(n == 3) {
			System.out.print("The "+n+"rd fibonacci number is : "+fibo(n-1));
		} else {
			System.out.print("The "+n+"th fibonacci number is : "+fibo(n-1));
		}

	}
	
	static int fibo(int num) {
		int first = 0, second = 1, temp;
		if (num == 0)
			return first;
		if (num == 1)
			return second;
		for (int i = 2; i <= num; i++) {
			temp = first + second;
			first = second;
			second = temp;
		}
		return second;
	}

}
