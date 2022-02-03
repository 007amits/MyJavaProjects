package samplePrograms;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;
import java.util.TreeSet;
import java.util.Vector;

public class CollectionsExamples {
  //Amit Shukla

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
    
  //------------------------------------------------------------------------------------//
    
    List<Float> arr1 = new ArrayList<>();
    arr1.add(23.5f);
    arr1.add(26.8f);
    arr1.add(21f);
    System.out.println("List elements are : "+arr1);
    
    /* 
     * List can not take different types of data Types. 
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
    
  //------------------------------------------------------------------------------------//
    
    Queue<Integer> queue = new LinkedList<>();
    queue.offer(23);
    queue.add(26);
    queue.offer(18);
    
    System.out.println("Queue elements are : "+queue);
    queue.poll();
    System.out.println("Queue elements are : "+queue);
    
    /* 
     * Queue extends Collection 
     * Queue store elements in inserted order
     * Works on FIFO - First in First out
     * Perform operations like - offer(), peek(), poll() in addition to vector
     * */
    
    Queue<Integer> pq = new PriorityQueue<Integer>();
    pq.offer(23);
    pq.add(26);
    pq.add(15);
    pq.add(12);
    pq.add(10);
    
    System.out.println("PriorityQueue elements are : "+pq);
    pq.poll();
    System.out.println("PriorityQueue elements are : "+pq);
    
    PriorityQueue<Integer> pq1 = new PriorityQueue<Integer>();
    pq1.offer(23);
    pq1.add(26);
    pq1.add(15);
    pq1.add(12);
    pq1.add(10);
    
    System.out.println("PriorityQueue elements are : "+pq1);
    pq1.remove();
    System.out.println("PriorityQueue elements are : "+pq1);
  }

}
