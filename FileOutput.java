
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class FileOutput
{
    public static void main(String[] args)
    {
        String string;
        try
        {
            File file = new File("D:","Turjo.txt");
            BufferedReader in = new BufferedReader(new FileReader(file));
            string=in.readLine();
            while(string !=null)
            {
                System.out.println("Read: "+string);
                string=in.readLine();
            }
            in.close();
        }
        catch(FileNotFoundException ex)
        {
            System.out.println(ex);
            
        }
        catch(IOException ex)
        {
            System.out.println(ex);
            
        }
    }
    
}
