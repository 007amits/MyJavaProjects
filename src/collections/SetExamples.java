package collections;

import java.util.HashSet;
import java.util.TreeSet;

public class SetExamples {

  public static void main(String[] args) {
    HashSet hs = new HashSet();
    hs.add("A");
    hs.add(2);
    hs.add(10);
    hs.add('b');
    hs.add(50);
    System.out.println("HashSet elements are : "+hs);
    
    /* 
     * HashSet extends AbstractSet class and implements Set interface
     * HashSet can take different types of data Types. 
     * HashSet can store elements in any order
     * */
    
  //------------------------------------------------------------------------------------//
    
    TreeSet ts = new TreeSet();
    ts.add("Amit");
    ts.add("Gaurav");
    ts.add("Sunil");
    ts.add("Niru");
    ts.add("Ashish");
    System.out.println("TreeSet elements are : "+ts);
    
    /* 
     * TreeSet implements Set interface
     * TreeSet can not take different types of data Types. 
     * TreeSet store elements in sorted order
     * */
  }

}
