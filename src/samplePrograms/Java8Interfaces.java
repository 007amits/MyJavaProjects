package samplePrograms;

public class Java8Interfaces implements Sayable {

  public static void main(String[] args) {
    Java8Interfaces java8Interfaces = new Java8Interfaces();
    java8Interfaces.say("Amit");
    java8Interfaces.sayMore("Amit more");
    Sayable.sayLouder("Amit Louder");

  }

  @Override
  public void say(String message) {
    System.out.println("Calling Abstract method of interface = "+message);
    
  }
  
  /* Default method of the interface can be overridden as below 
   * Static method of the interface can not be overridden
   * */
  @Override
  public void sayMore(String message) {
    System.out.println("Calling Overridden Default method of interface = "+message);
  }

}

interface Sayable {
  void say(String message);
  
  default void sayMore(String message) {
    System.out.println("Calling Default method of interface = "+message);
  }
  
  static void sayLouder(String message) {
    System.out.println("Calling Static method of interface = "+message);
  }
}
