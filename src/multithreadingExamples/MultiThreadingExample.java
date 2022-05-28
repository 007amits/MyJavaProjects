package multithreadingExamples;

public class MultiThreadingExample {
  final static int MAX_NUMBERS = 10;

  public static void main(String[] args) {
    MultiThreadingExample obj = new MultiThreadingExample();
    Thread t1 = new Thread(new NumberRunnable(obj, 0), "T1");
    Thread t2 = new Thread(new NumberRunnable(obj, 1), "T2");
    Thread t3 = new Thread(new NumberRunnable(obj, 2), "T3");
    t1.start();
    t2.start();
    t3.start();

  }

}

class NumberRunnable implements Runnable {
  MultiThreadingExample obj;
  int threadNumber;
  static int number = 0;
  public NumberRunnable(MultiThreadingExample obj, int result) {
    this.obj = obj;
    this.threadNumber = result;
  }

  @Override
  public void run() {
    while(number < MultiThreadingExample.MAX_NUMBERS) {
      synchronized (obj) {
        if(number % 3 == threadNumber && number < MultiThreadingExample.MAX_NUMBERS) {
          System.out.println(Thread.currentThread().getName()+" - "+ ++number);
        }
      }
    }
    
  }
  
}
