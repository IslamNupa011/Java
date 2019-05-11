
package FinalCodes;

import java.io.*;
public class ReadFile {
    public static void main(String[] args){
        File file=new File("D:","nupa.text");
        try{
            BufferedReader in=new BufferedReader(new FileReader(file));
            String str=in.readLine();
            while(str!=null){
                System.out.println("Read:"+str);
                str=in.readLine();
              
            
            }                
                  in.close();
        }
            /*catch(FileNotFoundException e1){
                   System.out.println("File not found");
                    }
            catch(IOException e2){
                System.out.println("Input output problem");
            }*/
            catch(Exception e){
                e.printStackTrace();
            }
    }
    
}
