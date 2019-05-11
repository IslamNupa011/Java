
package FinalCodes;


import java.io.*;
public class WriteFile {
    public static void main(String[] args){
        File file=new File("D:","MyText.text");
        try{
            InputStreamReader isr=new InputStreamReader(System.in);
            BufferedReader in=new BufferedReader(isr);
            PrintWriter out=new PrintWriter(new FileWriter(file));
            System.out.println("Enter a string:");
            String str=in.readLine();
            //System.out.println(str);
            out.println(str);
            in.close();
            out.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}

