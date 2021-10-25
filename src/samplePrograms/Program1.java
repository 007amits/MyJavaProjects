package samplePrograms;

import java.util.Scanner;

public class Program1 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.print("Given Series = ");
		System.out.println("2, 0, 3, 1, 5, 1, 7, 2, 11, 3, 13, 5, 17, 8, 19, 13, 23, 21, 29, 34, 31, 55, 37, 89, 41, 144, 43, .......");
		System.out.println("Enter a number");
		int n = sc.nextInt();
		if(n % 2 == 0) {
			int N = n/2;
			System.out.println(n+"th term is "+fibonacciNumber(N-1)+" (Fibonacci Number)");
		} else {
			int N = (n+1)/2;
			System.out.println(n+"th term is "+primeNumber(N)+" (Prime Number)");
		}
	}

	private static int primeNumber(int n) {
		int num=1, count=0, i;  
		while (count < n) {
			num=num+1;
			for(i = 2; i <= num; i++) {
				if (num % i == 0) {
					break;
				}
			}
			if (i == num) {
				count = count+1;
			}
		}
		return num;
	}

	private static int fibonacciNumber(int n) {
		int first = 0, second = 1, temp;
		if (n == 0)
			return first;
		if (n == 1)
			return second;
		for (int i = 2; i <= n; i++) {
			temp = first + second;
			first = second;
			second = temp;
		}
		return second;
	}

}
