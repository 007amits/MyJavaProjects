package maps;

import java.util.Hashtable;

public class HashTableExample {
  
  /*
   * 1. A Hashtable is an array of a list. 
   * 2. Each list is known as a bucket. 
   * 3. The position of the bucket is identified by calling the hashcode() method. 
   * 4. A Hashtable contains values based on the key.
   * 5. Java Hashtable class contains unique elements. 
   * 6. Java Hashtable class doesn't allow null key or value. 
   * 7. Java Hashtable class is synchronized. 
   * 8. The initial default capacity of Hashtable class is 11 whereas loadFactor is 0.75.
   */

  public static void main(String[] args) {
    Hashtable<String, String> table = new Hashtable<String, String>();
    table.put("item1", "apple");
    table.put("item2", "orange");
    table.put("item3", "grape");
    table.put("item4", "pine");
    
    System.out.println("HashTable elements are : "+table);

  }

}
