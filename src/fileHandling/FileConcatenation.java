package fileHandling;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.SequenceInputStream;

public class FileConcatenation {

  public static void main(String[] args) throws IOException {
    
    FileInputStream file1 = new FileInputStream("D:\\\\testout1.txt");
    FileInputStream file2 = new FileInputStream("D:\\\\testout2.txt");
    
    SequenceInputStream file3 = new SequenceInputStream(file1, file2);
    
    BufferedInputStream inBuffer = new BufferedInputStream(file3);
    BufferedOutputStream outBuffer = new BufferedOutputStream(System.out);
    
    int ch;
    while((ch = inBuffer.read())!=-1) {
      outBuffer.write((char)ch);
    }
    inBuffer.close();
    outBuffer.close();
    file1.close();
    file2.close();

  }

}
