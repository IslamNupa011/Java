
package FinalCodes;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;


public class File_Work {
    
    
    
    public static void main(String[] args){
        
        File file = new File("D:","Cat.txt");
        File file1 = new File("D:","Rat.txt");
        
        
        try{
            BufferedReader in = new BufferedReader(new FileReader(file));
            PrintWriter out = new PrintWriter(new FileWriter(file1));
            
            String s = in.readLine();
            
            while(s!=null){
                out.println(s);
                s=in.readLine();
            }
            in.close();
            out.close();
            
            
        }catch(Exception e){
            e.printStackTrace();
        }
        
        
    }
    
}

