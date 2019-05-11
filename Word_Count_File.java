
package FinalCodes;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;



public class Word_Count_File {


    public static void main(String[] args){
        int charcount = 0;
        int wordcount = 0;
        int linecount = 0;

        File file = new File("D:","advertisements.txt");

       try{
            BufferedReader in = new BufferedReader(new FileReader(file));
            String str = in.readLine();

            while(str!=null){

                linecount++;
                String[] words = str.split(" ");
                wordcount = wordcount+words.length;

                for(String word : words){//element,array name
                    charcount = charcount +word.length();
                }
                str = in.readLine();


            }
            in.close();
            System.out.println("Number Of Characters In The File: "+charcount);
            System.out.println("Number Of Words In The File: "+wordcount);
            System.out.println("Number Of Lines In The File: "+linecount);

       }catch(Exception e){
           e.printStackTrace();
       }
    }
}
