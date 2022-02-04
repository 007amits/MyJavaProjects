package samplePrograms;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionSample {

  public static void main(String[] args) throws IOException {
    ExceptionSample obj = new ExceptionSample();
    obj.fileNotFoundException();
    obj.devideByZeroException();
  }
  
  public int devideByZeroException() {
    int c = 0;
    try {
      int a = 15;
      int b = 0;
      c = a/b;
      System.out.println(c);
    } catch(ArithmeticException ex) {
      System.out.println("Exception occured : "+ex.getClass());
      System.out.println(ex.getMessage());
    }
    return c;
  }
  
  public void fileNotFoundException() throws IOException {
    try {
      FileReader reader = new FileReader("C:\\testout.txt");
      int i;
      while((i=reader.read())!=-1) {
        System.out.print((char)i);
      }
      System.out.println();
      reader.close();
    } catch(FileNotFoundException ex) {
      System.out.println("Exception occured : "+ex.getClass());
      System.out.println(ex.getMessage());
    }
    
  }

}
