
package code_fo_rfinall;
import java.util.Scanner;
import java.io.*;
public class Scanner_Test {
   public static void main(String[] args){     
    Scanner s=new Scanner(System.in);
    System.out.println("Input:");
    String str=s.next();
    System.out.println("Your output is:");
    System.out.println(str);
    
    int num=s.nextInt();
    System.out.println(num);
    
    s.close();
}
}
