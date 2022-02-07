package collections;

import java.util.Map;
import java.util.TreeMap;

class TreeMapExample {
  
  /*
   * The important points about Java TreeMap class are:
   * 
   * 1. Java TreeMap contains values based on the key. 
   * 2. It implements the NavigableMap interface and extends AbstractMap class. 
   * 3. Java TreeMap contains only unique elements. 
   * 4. Java TreeMap cannot have a null key but can have multiple null values. 
   * 5. Java TreeMap is non synchronized. 
   * 6. Java TreeMap maintains ascending order.
   */
  public static void main(String args[]) {
    TreeMap<Integer, String> map=new TreeMap<Integer, String>();
    map.put(100,"Amit");
    map.put(102,"Ravi");
    map.put(101,"Vijay");
    map.put(103,"Rahul");
    
    for(Map.Entry<Integer, String> m:map.entrySet()) {
      System.out.println(m.getKey()+" "+m.getValue());
    }
  }  
}  