package exceptionHandling;
import java.util.Scanner;

public class CustomException {

  public static void main(String[] args) {
    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the age");
    int age = sc.nextInt();
    CustomException obj = new CustomException();
    obj.vaildateAge(age);

  }
  
  public void vaildateAge(int n) {
    try {
      if(n < 18) {
        throw new InvalidAgeException("Invalid Age : "+n, 206);
      } else {
        System.out.println("Age is valid");
      }
    } catch(InvalidAgeException ex) {
      System.out.println(ex.getMessage());
      System.out.println(ex.getStatusCode());
    }
  }

}

class InvalidAgeException extends Exception {
  /**
   * 
   */
  private static final long serialVersionUID = 1L;
  
  int StatusCode;
  
  InvalidAgeException(String str, int statusCode){
    super(str);
    this.StatusCode = statusCode;
  }

  public int getStatusCode() {
    return StatusCode;
  }

  public void setStatusCode(int statusCode) {
    StatusCode = statusCode;
  }
  
}
