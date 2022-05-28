package samplePrograms;

import java.util.HashMap;
import java.util.Scanner;

public class Program4 {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    Scanner sc =new Scanner(System.in);
    String str = sc.next();
    HashMap<Character, Integer> map = new HashMap<Character, Integer>();
    for(int i=0; i<str.length(); i++) {
      int count = 0;
      for(int j=0; j<str.length(); j++) {
        if(str.charAt(i)==str.charAt(j)) {
          count = count + 1;
          map.put(str.charAt(i), count);
        }
      }
      count = 0;
    }
    System.out.println(map.entrySet());

  }

}
