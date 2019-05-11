
import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;


public class FileInput 
{
    public static void main(String[] args) 
    {
        String string;
        File file = new File("D:","MyText.txt");
        try
        {
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader in = new BufferedReader(isr);
            PrintWriter out = new PrintWriter(new FileWriter(file));
            System.out.println("Write In The File ");
            string = in.readLine();
            out.print(string);
            in.close();
            isr.close();
            out.close();
        }
        catch(IOException ex)
        {
            System.out.println(ex);
        }
    }
    
}
