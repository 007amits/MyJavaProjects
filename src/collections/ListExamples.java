package collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class ListExamples {

  public static void main(String[] args) {
    List<Float> arr1 = new ArrayList<>();
    arr1.add(23.5f);
    arr1.add(26.8f);
    arr1.add(21f);
    System.out.println("List elements are : "+arr1);
    
    /* 
     * List can not take different types of data Types. 
     * List can store duplicate elements.
     * List store elements in inserted order
     * */
    
  //------------------------------------------------------------------------------------//
    
    Vector<String> vec = new Vector<String>();  
    //Adding elements using add() method of List  
    vec.add("Tiger");  
    vec.add("Lion");  
    vec.add("Dog");  
    vec.add("Elephant");  
    //Adding elements using addElement() method of Vector  
    vec.addElement("Rat");  
    vec.addElement("Cat");  
    vec.addElement("Deer");
    
    System.out.println("Vector elements are : "+vec);
    
    /* 
     * Vector extends AbstractList
     * Vector can take different types of data Types. 
     * Vector store elements in inserted order
     * */

  }

}
