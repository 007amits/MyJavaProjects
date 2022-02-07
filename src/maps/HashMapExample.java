package maps;

import java.util.HashMap;

public class HashMapExample {
  /*
   * 1. Java HashMap contains values based on the key. 
   * 2. Java HashMap contains only unique keys. 
   * 3. Java HashMap may have one null key and multiple null values. 
   * 4. Java HashMap is non synchronized. 
   * 5. Java HashMap maintains no order. 
   * 6. The initial default capacity of Java HashMap class is 16 with a load factor of 0.75.
   */

  public static void main(String[] args) {
    HashMap<Integer,String> map = new HashMap<Integer,String>();
    map.put(1,"Mango");
    map.put(2,"Apple");
    map.put(3,"Banana");
    map.put(4,"Grapes");
    
    System.out.println("HashMap elements are : "+map);
  }

}
