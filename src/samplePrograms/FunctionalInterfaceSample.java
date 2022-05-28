package samplePrograms;

import java.util.Scanner;

public class FunctionalInterfaceSample {

  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    
    Addable c = (a1, b1) -> (a1+b1);
    int sum = c.add(a, b);
    System.out.println(sum);

  }

}

@FunctionalInterface
interface Addable {
  int add(int a, int c);
}
