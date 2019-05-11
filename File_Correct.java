
package FinalCodes;
import java.io.*;
import java.util.Scanner;
public class File_Correct  {
     public static void main( String[] args )
   {	
      try{
          File file =new File("D:","myfile.txt");
    	  if(!file.exists()){
    	 	file.createNewFile();
    	  }
    	  FileWriter fw = new FileWriter(file,true);
    	  BufferedWriter bw = new BufferedWriter(fw);
    	  PrintWriter pw = new PrintWriter(bw);
          //This will add a new line to the file content
    	  pw.println("");
          /* Below three statements would add three 
           * mentioned Strings to the file in new lines.
           */
          Scanner s = new Scanner ( System . in ) ;
          System.out.println("Wrtie Something");
          String str = s.nextLine();
          pw.println(str);

   	  pw.close();

	  System.out.println("Data successfully appended at the end of file");

       }catch(IOException e){
    	  
    	   e.printStackTrace();
      }
   }
    
}

