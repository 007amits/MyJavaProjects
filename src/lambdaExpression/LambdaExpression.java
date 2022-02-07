package lambdaExpression;
import java.util.ArrayList;

public class LambdaExpression {
  public static void main(String[] args) {
    ArrayList<Integer> numbers = new ArrayList<Integer>();
    numbers.add(5);
    numbers.add(9);
    numbers.add(8);
    numbers.add(1);
    numbers.forEach( (n) -> { 
      System.out.println(n); 
      } );
    
    Addable ad1=(int a,int b)->(a+b);  
    System.out.println(ad1.add(10,20)); 
    Addable ad2=(a,b)->{  
      return (a+b);   
      };  
      System.out.println(ad2.add(100,200)); 
  }
}

interface Addable{  
  int add(int a,int b);  
} 