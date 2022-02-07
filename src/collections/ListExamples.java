package collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
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
    
    Vector fruits = new Vector();
    fruits.add("Orange");
    fruits.add("Apple");
    fruits.add("Grapes");
    fruits.add("Pine");
    fruits.add(12);
    
    System.out.println("Vector elements are : "+fruits);
    
    /* 
     * Vector extends AbstractList
     * Vector can take different types of data Types. 
     * Vector store elements in inserted order
     * */
    
    //------------------------------------------------------------------------------------//
    
    Stack st = new Stack();
    st.push("Java");
    st.add(1);
    st.push(55);
    st.add(53);
    st.push("Latest");
    
    System.out.println("Stack elements are : "+st);
    System.out.println("st.peek() : "+st.peek());
    System.out.println("st.pop() : "+st.pop());
    System.out.println("Stack elements are : "+st);
    
    /* 
     * Stack extends Vector
     * Stack can take different types of data Types. 
     * Stack store elements in inserted order
     * Works on FILO - First in Last out/LIFO - Last in First Out
     * Perform operations like - empty(), peek(), pop(), push() in addition to vector
     * */

  }

}
