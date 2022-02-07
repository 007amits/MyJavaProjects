package collections;

import java.util.Stack;

public class StackExamples {

  public static void main(String[] args) {
    Stack<Object> st = new Stack<>();
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
