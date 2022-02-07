package collections;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueExamples {

  public static void main(String[] args) {
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
     * Perform operations like - offer(), peek(), poll()
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
