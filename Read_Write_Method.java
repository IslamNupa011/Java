
package FinalCodes;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.PrintWriter;


public class Read_Write_Method {
    
    File file = new File("E:","bamboooo.txt");
    
    public Read_Write_Method(){
        write_to_the_file();
        read_from_the_file();
    }
    
    public void write_to_the_file(){
        
        try{
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader in = new BufferedReader(isr);
            PrintWriter out = new  PrintWriter(new FileWriter(file)); 
            
           
            System.out.println("Write Here:  ");
            String str= in.readLine();
            out.println(str);
            in.close();
            out.close();
            
            
        }catch(Exception e){
            e.printStackTrace();
        }
        
    }
    
    public void read_from_the_file(){
        
        try{
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
    
    public static void main(String[] args){
        
        Read_Write_Method obj = new Read_Write_Method();
        
    }
    
    
    
    
    
}
