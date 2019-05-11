
package FinalCodes;
import java.io.*;

public class Read_Write {
    public static void main(String[] args){
        File file = new File("E:","bamboo.txt");
        
        try{
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader in = new BufferedReader(isr);
            PrintWriter out = new  PrintWriter(new FileWriter(file)); 
            
           
          
            System.out.println("Write Here:  ");
            String str= in.readLine();
            out.println(str);
            in.close();
            out.close();
            
            BufferedReader br = new BufferedReader(new FileReader(file));
            String s1 = br.readLine();
            
            while(s1!=null){
                System.out.println("From The Text File: "+s1);
                s1 = br.readLine();
                
            }
            br.close();
           
            
            
        }catch(Exception e){
            e.printStackTrace();
        }
        
        
        
    }

    
}
