package samplePrograms;

import java.util.HashMap;

public class HashMapExample {
  /* 
   * 
   * Java HashMap class implements the Map interface which allows us to store key and value pair.
   * Here keys should be unique and each can map at max one value.
   * It allows one null key and multiple null values.
   * It is non synchronized.
   * */

  public static void main(String[] args) {
    HashMap<Integer,String> map = new HashMap<Integer,String>();
    map.put(1,"Mango");
    map.put(2,"Apple");
    map.put(3,"Banana");
    map.put(4,"Grapes");
    
    System.out.println("HashMap elements are : "+map);
  }

}
