package multithreadingExamples;

public class CallingThreadUsingThreadClass {

  public static void main(String[] args) {
    
    System.out.println("Calling start method");
    A a = new A();
    Thread t = new Thread(a);
    t.start();
    B b = new B();
    b.setPriority(Thread.MAX_PRIORITY);
    b.start();
    new C().start();
  }

}

class A implements Runnable{
  public void run() {
    for(int i=1; i<=5; i++){
      System.out.println("\t From Thread A : i = "+i);
    }
    System.out.println("Exit from A");
  }
}

class B extends Thread{
  public void run() {
    for(int j=1; j<=5; j++){
      System.out.println("\t From Thread B : i = "+j);
    }
    System.out.println("Exit from B");
  }
}

class C extends Thread{
  public void run() {
    for(int k=1; k<=5; k++){
      System.out.println("\t From Thread C : i = "+k);
    }
    System.out.println("Exit from C");
  }
}
