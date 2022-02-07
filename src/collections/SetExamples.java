package collections;

import java.util.HashSet;
import java.util.TreeSet;

public class SetExamples {

  public static void main(String[] args) {
    //Set can not store duplicate elements.
    
    /*
     * The important points about Java HashSet class are:
     * 
     * 1. HashSet stores the elements by using a mechanism called hashing. 
     * 2. HashSet contains unique elements only. 
     * 3. HashSet allows null value. 
     * 4. HashSet class is non synchronized. 
     * 5. HashSet doesn't maintain the insertion order. 
     * 6. Here, elements are inserted on the basis of their hashcode.
     * 7. HashSet is the best approach for search operations. 
     * 8. The initial default capacity of HashSet is 16, and the load factor is 0.75.
     */
    HashSet<String> set=new HashSet<>();  
    set.add("One");    
    set.add("Two");    
    set.add("Three");   
    set.add("Four");  
    set.add("Five");
    System.out.println("HashSet elements are : "+set);
    
  //------------------------------------------------------------------------------------//
    
  /*
   * The important points about Java TreeSet class are:
   * 
   * 1. Java TreeSet class contains unique elements only like HashSet. 
   * 2. Java TreeSet class access and retrieval times are quiet fast. 
   * 3. Java TreeSet class doesn't allow null element. 
   * 4. Java TreeSet class is non synchronized. 
   * 5. Java TreeSet class maintains ascending order.
   */
    TreeSet<String> al=new TreeSet<String>();  
    al.add("Ravi");  
    al.add("Vijay");  
    al.add("Ravi");  
    al.add("Ajay");
    System.out.println("TreeSet elements are : "+al);
  }

}
