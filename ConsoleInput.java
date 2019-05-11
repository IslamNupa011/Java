
package code_fo_rfinall;
import java.io.*;

public class ConsoleInput {
    public static void main(String[] args){
        String s;
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(isr);
        try{
            System.out.println("Input");
            s=in.readLine();
            System.out.println("Read:"+s);
            in.close();
        }
        catch(IOException e){
            e.printStackTrace();
        }
                
    }
}
