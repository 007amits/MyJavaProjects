package samplePrograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Program2 {
	/* This program will find top racer excluding the finishers. */
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		List<Float> arr1 = new ArrayList<>();
		List<Float> arr2 = new ArrayList<>();
		System.out.println("Enter the time(in seconds) and press a to finish listing.");
		while(sc.hasNext()) {
			if(sc.hasNextFloat()) {
				arr1.add(sc.nextFloat());
			} else if(sc.hasNextLine()) {
				if(sc.nextLine().equalsIgnoreCase("a"))
					break;
			} else {
				System.out.println("Invalid input.");
			}
		}
		if(arr1.size() < 2)
			System.out.println("Not enough entries.");
		Collections.sort(arr1);
		float num = arr1.get(0);
		for(int i=1; i<arr1.size(); i++) {
			if(arr1.get(i) != num) {
				arr2.add(arr1.get(i));
			}
		}
		System.err.println("Time for Second top player is "+arr2.get(0));

	}

}
