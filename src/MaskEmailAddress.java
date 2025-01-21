import java.util.Scanner;

public class MaskEmailAddress {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String email = sc.next();
    
    System.out.println("Masked email address = "+maskEmailAddress(email));
    sc.close();
    
  }

  private static String maskEmailAddress(String email) {
    String arr[]= email.split("@");
    String username = arr[0];
    StringBuilder sb1 = new StringBuilder(username);
    for(int i=3; i<sb1.length()-2; i++) {
      sb1.setCharAt(i, '*');
    }
    sb1.setCharAt(sb1.length()-1, '*');
    username = sb1.toString();
    
    String substring = arr[1];
    String arr2[] = substring.split("\\.");
    String domain = arr2[0];
    StringBuilder sb2 = new StringBuilder(domain);
    for(int i=2; i<sb2.length(); i++) {
      sb2.setCharAt(i, '*');
    }
    domain = sb2.toString();
    
    String maskedEmail = username+"@"+domain+"."+arr2[1];
    return maskedEmail;
  }

}
