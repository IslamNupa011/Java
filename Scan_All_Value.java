
package code_fo_rfinall;
import java.util.Scanner;

public class Scan_All_Value {
     public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A Word ");
        String a = sc.next();
        System.out.println("The Word: "+a);
        System.out.println("Enter A Line: ");
        String b = sc.nextLine();
        System.out.println("The Line: "+b);
        System.out.println("Enter A Integer ");
        int c = sc.nextInt();
        System.out.println("The Integer: "+c);
        System.out.println("Enter A Float ");
        float d = sc.nextFloat();
        System.out.println("The Float Value: "+d);
        System.out.println("Enter A Double ");
        double e = sc.nextDouble();
        System.out.println("The Double Value: "+e);
   
        
    }
}
