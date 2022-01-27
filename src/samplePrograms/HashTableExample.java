package samplePrograms;

import java.util.Hashtable;

public class HashTableExample {
  
  /* 
   * 
   * Java HashTable class implements the Map interface which allows us to store key and value pair.
   * Here keys should be unique and each can map at max one value.
   * It does not allow any null key or null values.
   * It is synchronized.
   * */

  public static void main(String[] args) {
    Hashtable<String, String> table = new Hashtable<String, String>();
    table.put("item1", "apple");
    table.put("item2", "orange");
    table.put("item3", "grape");
    table.put("item4", "pine");
    
    System.out.println("HashTable elements are : "+table);

  }

}
